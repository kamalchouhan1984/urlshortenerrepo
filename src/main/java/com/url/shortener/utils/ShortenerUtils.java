package com.url.shortener.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

import com.url.shortener.api.model.Shortner;
import com.url.shortener.data.model.UrlShortener;

public class ShortenerUtils {
	

	public static UrlShortener extractUrl(Shortner shortnerPost) throws MalformedURLException {
		URLShortenerKeyGen urlShortenerKeyGen= new URLShortenerKeyGen(6,"");
		urlShortenerKeyGen.shortenURL(shortnerPost.getOriginalUrl());
		
		
		UrlShortener urlShortener = new UrlShortener();
		URL url = getHostName(shortnerPost.getOriginalUrl());
		urlShortener.setOriginalUrl(shortnerPost.getOriginalUrl());
		urlShortener.setCreatedOn(new Date());
		urlShortener.setExpiresOn(getBackDate(2));
		urlShortener.setHost(url.getHost());
		urlShortener.setScheme(url.getProtocol());
		urlShortener.setTinyUrl(urlShortenerKeyGen.shortenURL(shortnerPost.getOriginalUrl()));
		urlShortener.setExpandedurl(urlShortenerKeyGen.expandURL(urlShortener.getTinyUrl()));
		
		String key = urlShortener.getTinyUrl().substring(urlShortener.getTinyUrl().length()-7,urlShortener.getTinyUrl().length());
		urlShortener.setTinyUrlKey(key);
		return urlShortener;
	}


	public static URL getHostName(String orignalUrl) throws MalformedURLException {
		String res = "";
		URL url = new URL(orignalUrl);
		
		return url;
	}
	
	static Date getBackDate(int years){
		Calendar cal = Calendar.getInstance();
//		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 2); // to get previous year add -1
		Date nextYear = cal.getTime();
		return nextYear;
	}

}
