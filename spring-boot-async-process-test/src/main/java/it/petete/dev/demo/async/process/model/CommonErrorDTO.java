package it.petete.dev.demo.async.process.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.petete.dev.demo.async.process.model.ErrorDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommonErrorDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-02T15:28:17.541+02:00")

public class CommonErrorDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("errors")
  private List<ErrorDto> errors = new ArrayList<ErrorDto>();

  public CommonErrorDTO transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * CorrelationId parameter
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "CorrelationId parameter")
  @NotNull


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public CommonErrorDTO timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Datetime when error occour
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Datetime when error occour")
  @NotNull

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public CommonErrorDTO errors(List<ErrorDto> errors) {
    this.errors = errors;
    return this;
  }

  public CommonErrorDTO addErrorsItem(ErrorDto errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "List of errors")
  @NotNull

  @Valid

  public List<ErrorDto> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDto> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonErrorDTO commonErrorDTO = (CommonErrorDTO) o;
    return Objects.equals(this.transactionId, commonErrorDTO.transactionId) &&
        Objects.equals(this.timestamp, commonErrorDTO.timestamp) &&
        Objects.equals(this.errors, commonErrorDTO.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, timestamp, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonErrorDTO {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

