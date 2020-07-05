package com.url.shortener.data.repository;
import com.url.shortener.data.model.UrlShortener;
import org.springframework.data.repository.CrudRepository;

public interface UrlShortenerRepository extends CrudRepository<UrlShortener, Integer>{
	
	public UrlShortener findByTinyUrlKey(String urlKey);
	public UrlShortener findByOriginalUrl(String originalUrl);


}
