package com.url.shortener.data.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UrlShortenerHits {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int id;
	private int userId;
	private int urlShortenerId;
	private Date createdOn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUrlShortenerId() {
		return urlShortenerId;
	}
	public void setUrlShortenerId(int urlShortenerId) {
		this.urlShortenerId = urlShortenerId;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

}
