package com.url.shortener.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a paginated search result.
 */
@ApiModel(description = "Represents a paginated search result.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-05T11:01:55.190+05:30[Asia/Calcutta]")
public class Pagination   {
  @JsonProperty("offset")
  private Integer offset = 0;

  @JsonProperty("limit")
  private Integer limit = 200;

  @JsonProperty("total")
  private Integer total = null;

  public Pagination offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The start index of the result set, 0 based
   * @return offset
  **/
  @ApiModelProperty(example = "200", required = true, value = "The start index of the result set, 0 based")
  @NotNull

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Pagination limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Size of the page in the result set
   * @return limit
  **/
  @ApiModelProperty(example = "20", required = true, value = "Size of the page in the result set")
  @NotNull

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Pagination total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of results in result set
   * @return total
  **/
  @ApiModelProperty(example = "31308", required = true, value = "Total number of results in result set")
  @NotNull

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.offset, pagination.offset) &&
        Objects.equals(this.limit, pagination.limit) &&
        Objects.equals(this.total, pagination.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
