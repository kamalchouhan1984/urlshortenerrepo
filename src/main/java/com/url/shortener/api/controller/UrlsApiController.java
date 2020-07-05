package com.url.shortener.api.controller;

import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.url.shortener.api.model.ShorenerResponse;
import com.url.shortener.api.model.Shortner;
import com.url.shortener.api.model.UrlHitsResponse;
import com.url.shortener.api.model.UrlsResponse;
import com.url.shortener.data.model.UrlShortener;
import com.url.shortener.data.repository.UrlShortenerRepository;
import com.url.shortener.data.service.UrlShortenerHitsService;
import com.url.shortener.data.service.UrlShortenerService;

import io.swagger.annotations.ApiParam;

@RestController
public class UrlsApiController implements UrlsApi {

	private final Logger logger = LoggerFactory.getLogger(UrlsApiController.class);

	private final ObjectMapper objectMapper;
	private final HttpServletRequest request;
	@Autowired
	UrlShortenerService urlShortenerService;

	@Autowired
	UrlShortenerHitsService urlShortenerHitsService;

	private ResponseEntity<Object> unauthorizedResponse;

	@Autowired
	UrlShortenerRepository urlShortenerRepository;

	@Autowired
	public UrlsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.unauthorizedResponse = ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}

	public ResponseEntity<ShorenerResponse> addUrl(Shortner shortnerPost) {

		ShorenerResponse response = new ShorenerResponse();

		UrlShortener urlObj = urlShortenerRepository.findByOriginalUrl(shortnerPost.getOriginalUrl());

		if (urlObj != null) {
			response.setErrorMessages("URL already exist");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}

		Shortner url = null;
		try {
			url = urlShortenerService.addUrlShortener(shortnerPost);
			response.setResults(url);
		} catch (MalformedURLException e) {
			response.setErrorMessages("Invalid Url");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}

		return ResponseEntity.ok().body(response);

	}

	public ResponseEntity<Shortner> getUrlByKey(
			@ApiParam(value = "Unique url of key", required = true) @PathVariable("tinyUrlKey") String tinyUrlKey) {
		System.out.println("getUrl");
		System.out.println(tinyUrlKey);
		Shortner shortner = null;
		shortner = urlShortenerService.getUrlShortener(tinyUrlKey);
		return ResponseEntity.ok().body(shortner);

	}

	public ResponseEntity<UrlHitsResponse> getUrlHits(@PathVariable("tinyUrlKey") String tinyUrlKey,
			@Valid @RequestParam(value = "startDate", required = false) String startDate,
			@Valid @RequestParam(value = "endDate", required = false) String endDate) {
		System.out.println("getUrlHits");
		System.out.println(tinyUrlKey);
		UrlHitsResponse res = urlShortenerHitsService.getUrlShortenerHits(tinyUrlKey, startDate, endDate);
//		UrlHitsResponse res= new UrlHitsResponse();
		return ResponseEntity.ok().body(res);
		// return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<UrlsResponse> getUrls(
			@Min(1) @Max(200) @ApiParam(value = "Indicates the maximum number of data to return in a single response", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit,
			@ApiParam(value = "Gives the number of data to be skipped") @Valid @RequestParam(value = "offset", required = false) Integer offset,
			@ApiParam(value = "Allows the user to reverse the default direction of the sort", allowableValues = "asc, desc") @Valid @RequestParam(value = "sortDir", required = false) String sortDir,
			@ApiParam(value = "the sorting fields , default by date") @Valid @RequestParam(value = "sortField", required = false) String sortField) {
		System.out.println("getUrls");
		System.out.println(sortField);
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

//	public ResponseEntity<Shortner> updateHits(@RequestBody Shortner body,
//			@ApiParam(value = "Unique url of key", required = true) @PathVariable("tinyUrlKey") String tinyUrlKey) {
//		System.out.println("updateHits");
//		System.out.println(tinyUrlKey);
//		urlShortenerHitsService.addUrlShortenerHits(tinyUrlKey);
//		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
//	}
}
