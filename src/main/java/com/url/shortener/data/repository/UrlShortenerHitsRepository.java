package com.url.shortener.data.repository;

import com.url.shortener.data.model.UrlShortenerHits;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UrlShortenerHitsRepository extends CrudRepository<UrlShortenerHits, Integer> {

	List<UrlShortenerHits> getByUrlShortenerId(int id);
	List<UrlShortenerHits> findAllByIdAndCreatedOnBetween(Integer id, Date start, Date endDate);
	List<UrlShortenerHits> findAllByUrlShortenerId(Integer id);
	List<UrlShortenerHits> getAllByUrlShortenerId(int id);
}
