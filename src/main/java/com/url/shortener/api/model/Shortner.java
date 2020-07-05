package com.url.shortener.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User supplied portions of the url to be executed
 */
@ApiModel(description = "User supplied portions of the url to be executed")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-05T11:01:55.190+05:30[Asia/Calcutta]")
public class Shortner   {
//  @JsonProperty("tinyUrl")
//  private String tinyUrl = null;

  @JsonProperty("scheme")
  private String scheme = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("originalUrl")
  private String originalUrl = null;

  @JsonProperty("createdOn")
  private String createdOn = null;

  @JsonProperty("expiresOn")
  private String expiresOn = null;

  @JsonProperty("expandedUrl")
  private String expandedUrl = null;
  
  @JsonProperty("tinyUrlKey")
  private String tinyUrlKey = null;
  
//  public Shortner tinyUrl(String tinyUrl) {
//    this.tinyUrl = tinyUrl;
//    return this;
//  }

  /**
   * Get tinyUrlKey
   * @return tinyUrlKey
  **/
  @ApiModelProperty(required = true, readOnly = true, value = "")
  @NotNull

//  @Valid
//  public String getTinyUrl() {
//    return tinyUrl;
//  }
//
//  public void setTinyUrl(String tinyUrl) {
//    this.tinyUrl = tinyUrl;
//  }

  public Shortner scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Get scheme
   * @return scheme
  **/
  @ApiModelProperty(example = "http/https", readOnly = true, value = "")

  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public Shortner host(String host) {
    this.host = host;
    return this;
  }
  
  

  public String getExpandedUrl() {
	return expandedUrl;
}

public void setExpandedUrl(String expandedUrl) {
	this.expandedUrl = expandedUrl;
}

/**
   * Get host
   * @return host
  **/
  @ApiModelProperty(example = "Domain", required = false, readOnly = true, value = "")


  public String getHost() {
    return host;
  }

  public String getTinyUrlKey() {
	return tinyUrlKey;
}

public void setTinyUrlKey(String tinyUrlKey) {
	this.tinyUrlKey = tinyUrlKey;
}

public void setHost(String host) {
    this.host = host;
  }

  public Shortner userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "12345", value = "")

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Shortner originalUrl(String originalUrl) {
    this.originalUrl = originalUrl;
    return this;
  }

  /**
   * Get originalUrl
   * @return originalUrl
  **/
  @ApiModelProperty(example = "Domain", value = "")

  public String getOriginalUrl() {
    return originalUrl;
  }

  public void setOriginalUrl(String originalUrl) {
    this.originalUrl = originalUrl;
  }

  public Shortner createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")

  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Shortner expiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

  /**
   * Get expiresOn
   * @return expiresOn
  **/
  @ApiModelProperty(value = "")

  public String getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shortner shortner = (Shortner) o;
    return 
        Objects.equals(this.scheme, shortner.scheme) &&
        Objects.equals(this.host, shortner.host) &&
        Objects.equals(this.userId, shortner.userId) &&
        Objects.equals(this.originalUrl, shortner.originalUrl) &&
        Objects.equals(this.createdOn, shortner.createdOn) &&
        Objects.equals(this.expiresOn, shortner.expiresOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash( scheme, host, userId, originalUrl, createdOn, expiresOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shortner {\n");
    
//    sb.append("    tinyUrl: ").append(toIndentedString(tinyUrl)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    originalUrl: ").append(toIndentedString(originalUrl)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
