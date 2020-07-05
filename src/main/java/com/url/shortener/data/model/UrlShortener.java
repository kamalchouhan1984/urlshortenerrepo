package com.url.shortener.data.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UrlShortener {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String originalUrl;
	private String tinyUrlKey;
	private String tinyUrl;
	private int userId;
	private String scheme;
	private String host;
	private Date createdOn;
	private Date expiresOn;
	private String expandedurl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOriginalUrl() {
		return originalUrl;
	}
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	public String getTinyUrlKey() {
		return tinyUrlKey;
	}
	public void setTinyUrlKey(String tinyUrlKey) {
		this.tinyUrlKey = tinyUrlKey;
	}
	public String getTinyUrl() {
		return tinyUrl;
	}
	public void setTinyUrl(String tinyUrl) {
		this.tinyUrl = tinyUrl;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getExpiresOn() {
		return expiresOn;
	}
	public void setExpiresOn(Date expiresOn) {
		this.expiresOn = expiresOn;
	}
	public String getExpandedurl() {
		return expandedurl;
	}
	public void setExpandedurl(String expandedurl) {
		this.expandedurl = expandedurl;
	}

}
