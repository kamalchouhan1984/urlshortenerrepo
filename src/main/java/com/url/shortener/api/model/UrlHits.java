package com.url.shortener.api.model;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Maintain hits based on user
 */
@ApiModel(description = "Maintain hits based on user")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-05T11:01:55.190+05:30[Asia/Calcutta]")
public class UrlHits   {
//  @JsonProperty("tinyUrlKey")
//  private String tinyUrlKey = null;

//  @JsonProperty("hits")
//  private Integer hits = null;

  @JsonProperty("createdOn")
  private String createdOn = null;

//  public UrlHits tinyUrlKey(String tinyUrlKey) {
//    this.tinyUrlKey = tinyUrlKey;
//    return this;
//  }

  /**
   * Get tinyUrlKey
   * @return tinyUrlKey
  **/
//  @ApiModelProperty(required = true, value = "")
//  @NotNull

//  @Valid
//  public String getTinyUrlKey() {
//    return tinyUrlKey;
//  }
//
//  public void setTinyUrlKey(String tinyUrlKey) {
//    this.tinyUrlKey = tinyUrlKey;
//  }

//  public UrlHits hits(Integer hits) {
//    this.hits = hits;
//    return this;
//  }

  /**
   * Get hits
   * @return hits
  **/
  @ApiModelProperty(example = "12345", value = "")
//
//  public Integer getHits() {
//    return hits;
//  }

//  public void setHits(Integer hits) {
//    this.hits = hits;
//  }

  public UrlHits createdOn(String createdOn) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlHits urlHits = (UrlHits) o;
    return 
        Objects.equals(this.createdOn, urlHits.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash( createdOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlHits {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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
