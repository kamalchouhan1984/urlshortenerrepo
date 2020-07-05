package com.url.shortener.utils;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import com.url.shortener.api.model.Shortner;
import com.url.shortener.api.model.UrlHits;
import com.url.shortener.data.model.UrlShortener;
import com.url.shortener.data.model.UrlShortenerHits;

public class UrlShortenerBuilder {

	public static UrlShortener buildData(Shortner shortnerPost) throws MalformedURLException {

		UrlShortener urlShortener = ShortenerUtils.extractUrl(shortnerPost);	

		return urlShortener;
	}

	public static Shortner buildApiData(UrlShortener urlShortener) {
		Shortner shortnerPost = new Shortner();
		shortnerPost.setOriginalUrl(urlShortener.getOriginalUrl());
		if (urlShortener.getCreatedOn() != null)
			shortnerPost.setCreatedOn(urlShortener.getCreatedOn().toString());
		shortnerPost.setHost(urlShortener.getHost());
		//shortnerPost.setTinyUrl(urlShortener.getTinyUrl());
		if (urlShortener.getExpiresOn() != null)
			shortnerPost.setExpiresOn(urlShortener.getExpiresOn().toString());
		shortnerPost.setUserId(urlShortener.getUserId());
		shortnerPost.setExpandedUrl(urlShortener.getExpandedurl());
		shortnerPost.setTinyUrlKey(urlShortener.getTinyUrlKey());
		shortnerPost.setScheme(urlShortener.getScheme());
		return shortnerPost;
	}
	
	public static List<UrlHits> buildApiDataHits(List <UrlShortenerHits> list) {
		  List<UrlHits> results = new ArrayList();
		  for(UrlShortenerHits obj:list) {
			  UrlHits urlHits =new UrlHits();
			  urlHits.setCreatedOn(obj.getCreatedOn().toString());
			  results.add(urlHits);
		  }
		  return results;
	}

}
