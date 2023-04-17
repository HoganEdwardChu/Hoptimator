/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.linkedin.hoptimator.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Flink SQL job spec.
 */
@ApiModel(description = "Flink SQL job spec.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T18:24:49.721Z[Etc/UTC]")
public class V1alpha1FlinkSqlJobSpec {
  public static final String SERIALIZED_NAME_SQL = "sql";
  @SerializedName(SERIALIZED_NAME_SQL)
  private List<String> sql = new ArrayList<>();


  public V1alpha1FlinkSqlJobSpec sql(List<String> sql) {
    
    this.sql = sql;
    return this;
  }

  public V1alpha1FlinkSqlJobSpec addSqlItem(String sqlItem) {
    this.sql.add(sqlItem);
    return this;
  }

   /**
   * Flink SQL statements.
   * @return sql
  **/
  @ApiModelProperty(required = true, value = "Flink SQL statements.")

  public List<String> getSql() {
    return sql;
  }


  public void setSql(List<String> sql) {
    this.sql = sql;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1FlinkSqlJobSpec v1alpha1FlinkSqlJobSpec = (V1alpha1FlinkSqlJobSpec) o;
    return Objects.equals(this.sql, v1alpha1FlinkSqlJobSpec.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sql);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1FlinkSqlJobSpec {\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

