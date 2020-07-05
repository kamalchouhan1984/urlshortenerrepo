package com.url.shortener.data.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.url.shortener.api.model.Pagination;
import com.url.shortener.api.model.UrlHitsResponse;
import com.url.shortener.data.model.UrlShortener;
import com.url.shortener.data.model.UrlShortenerHits;
import com.url.shortener.data.repository.UrlShortenerHitsRepository;
import com.url.shortener.data.repository.UrlShortenerRepository;
import com.url.shortener.utils.Constants;
import com.url.shortener.utils.UrlShortenerBuilder;

@Service
public class UrlShortenerHitsService {
	@Autowired
	UrlShortenerHitsRepository urlShortenerHitsRepository;
	@Autowired
	UrlShortenerRepository urlShortenerRepository;

	public void addUrlShortenerHits(UrlShortener urlShortener) {
		UrlShortenerHits urlShortenerHits = new UrlShortenerHits();
		urlShortenerHits.setUrlShortenerId(urlShortener.getId());
		urlShortenerHits.setCreatedOn(new Date());
		urlShortenerHitsRepository.save(urlShortenerHits);
	}

	public List<UrlShortenerHits> getUrlShortenerHits(String tinyUrlKey) {
		UrlShortener urlShortener = (UrlShortener) urlShortenerRepository.findByTinyUrlKey(tinyUrlKey);
		return urlShortenerHitsRepository.getByUrlShortenerId(urlShortener.getId());
	}

	public UrlHitsResponse getUrlShortenerHits(String tinyUrlKey, String startDate, String endDate) {

		UrlHitsResponse urlHitsResponse = new UrlHitsResponse();
		Pagination pagination = new Pagination();
		UrlShortener urlShortener = (UrlShortener) urlShortenerRepository.findByTinyUrlKey(tinyUrlKey);
//		Date startDateObj= new Date();
//		Date endDateObj= new Date() ;
//
//		if (startDate != null && endDate != null) {
////			startDate = new Date();
////			endDate = new Date();
////
//		}
		if (urlShortener != null) {
			List<UrlShortenerHits> list = urlShortenerHitsRepository.findAllByUrlShortenerId(urlShortener.getId());
			if (list != null && list.size() > 0) {
				System.out.println(list.size());
				urlHitsResponse.setResults(UrlShortenerBuilder.buildApiDataHits(list));
				pagination.setTotal(list.size());
				urlHitsResponse.setPagination(pagination);
				urlHitsResponse.setStatusCode(Constants.OK);
				urlHitsResponse.setMessages(Constants.SUCCESS);
			}
		}else {
			urlHitsResponse.setStatusCode(Constants.NO_RECORDS_CODE);
			urlHitsResponse.setMessages(Constants.NO_RECORDS);
		}
		return urlHitsResponse;
	}
}
