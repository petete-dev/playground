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
 * ErrorDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-02T15:28:17.541+02:00")

public class ErrorDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("internal_code")
  private String internalCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("details")
  private String details = null;

  public ErrorDto internalCode(String internalCode) {
    this.internalCode = internalCode;
    return this;
  }

   /**
   * UUID generate at catch exception
   * @return internalCode
  **/
  @ApiModelProperty(required = true, value = "UUID generate at catch exception")
  @NotNull


  public String getInternalCode() {
    return internalCode;
  }

  public void setInternalCode(String internalCode) {
    this.internalCode = internalCode;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human Readable message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Human Readable message")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Message description
   * @return details
  **/
  @ApiModelProperty(value = "Message description")


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.internalCode, errorDto.internalCode) &&
        Objects.equals(this.message, errorDto.message) &&
        Objects.equals(this.details, errorDto.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalCode, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    internalCode: ").append(toIndentedString(internalCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

