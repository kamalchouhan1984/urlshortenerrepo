package com.url.shortener.data.service;

import java.net.MalformedURLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.url.shortener.api.model.Shortner;
import com.url.shortener.data.model.UrlShortener;
import com.url.shortener.data.model.UrlShortenerHits;
import com.url.shortener.data.repository.UrlShortenerHitsRepository;
import com.url.shortener.data.repository.UrlShortenerRepository;
import com.url.shortener.utils.UrlShortenerBuilder;

@Service
public class UrlShortenerService {

	@Autowired
	UrlShortenerRepository urlShortenerRepository;
	@Autowired
	UrlShortenerHitsRepository urlShortenerHitsRepository;

	public Shortner addUrlShortener(Shortner shortenerPost) throws MalformedURLException {
		UrlShortener urlObj = (UrlShortener) urlShortenerRepository.save(UrlShortenerBuilder.buildData(shortenerPost));
		Shortner shortner = UrlShortenerBuilder.buildApiData(urlObj);	
		return shortner;
	}
	
	public Shortner getUrlShortener(String tinyUrlKey) {
		UrlShortener urlObj = null;
		Shortner shortner = null;
		urlObj = (UrlShortener) urlShortenerRepository.findByTinyUrlKey(tinyUrlKey);
		if(urlObj !=null) {
		UrlShortenerHits  urlShortenerHits = new UrlShortenerHits();
		urlShortenerHits.setUrlShortenerId(urlObj.getId());
		urlShortenerHits.setCreatedOn(new Date());
		urlShortenerHitsRepository.save(urlShortenerHits);
		shortner = UrlShortenerBuilder.buildApiData(urlObj);
		}
		return shortner;
	}
	
}
