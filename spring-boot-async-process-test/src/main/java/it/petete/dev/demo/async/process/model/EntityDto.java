package it.petete.dev.demo.async.process.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntityDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-02T15:28:17.541+02:00")

public class EntityDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("body")
  private String body = null;

  public EntityDto code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Numeric code of the Entity
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Numeric code of the Entity")
  @NotNull

 @Size(max=3)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EntityDto order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Entity order
   * @return order
  **/
  @ApiModelProperty(required = true, value = "Entity order")
  @NotNull


  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public EntityDto title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the Entity
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title of the Entity")
  @NotNull

 @Size(max=150)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EntityDto body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Detailed description Entity in rich-text HTML format
   * @return body
  **/
  @ApiModelProperty(value = "Detailed description Entity in rich-text HTML format")


  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDto entityDto = (EntityDto) o;
    return Objects.equals(this.code, entityDto.code) &&
        Objects.equals(this.order, entityDto.order) &&
        Objects.equals(this.title, entityDto.title) &&
        Objects.equals(this.body, entityDto.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, order, title, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDto {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

