package it.petete.dev.demo.async.process.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CommonErrorDTO
 */
public class CommonErrorDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("transactionId")
    private String transactionId = null;
    
    @JsonProperty("timestamp")
    private OffsetDateTime timestamp = null;
    
    @JsonProperty("errors")
    private List<ErrorDto> errors = new ArrayList<>();
    
    public CommonErrorDTO transactionId(final String transactionId) {
	 this.transactionId = transactionId;
	 return this;
    }
    
    /**
     * transactionId parameter
     * @return transactionId
     **/
    @ApiModelProperty(required = true, value = "transactionId parameter")
    @NotNull
    
    public String getTransactionId() {
	 return this.transactionId;
    }
    
    public void setTransactionId(final String transactionId) {
	 this.transactionId = transactionId;
    }
    
    public CommonErrorDTO timestamp(final OffsetDateTime timestamp) {
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
	 return this.timestamp;
    }
    
    public void setTimestamp(final OffsetDateTime timestamp) {
	 this.timestamp = timestamp;
    }
    
    public CommonErrorDTO errors(final List<ErrorDto> errors) {
	 this.errors = errors;
	 return this;
    }
    
    public CommonErrorDTO addErrorsItem(final ErrorDto errorsItem) {
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
	 return this.errors;
    }
    
    public void setErrors(final List<ErrorDto> errors) {
	 this.errors = errors;
    }
    
    @Override
    public boolean equals(final java.lang.Object o) {
	 if (this == o) {
	     return true;
	 }
	 if ((o == null) || (this.getClass() != o.getClass())) {
	     return false;
	 }
	 final CommonErrorDTO commonErrorDTO = (CommonErrorDTO) o;
	 return Objects.equals(this.transactionId, commonErrorDTO.transactionId) && Objects.equals(this.timestamp, commonErrorDTO.timestamp) && Objects.equals(this.errors, commonErrorDTO.errors);
    }
    
    @Override
    public int hashCode() {
	 return Objects.hash(this.transactionId, this.timestamp, this.errors);
    }
    
    @Override
    public String toString() {
	 final StringBuilder sb = new StringBuilder();
	 sb.append("class CommonErrorDTO {\n");
	 
	 sb
	     .append("    transactionId: ")
	     .append(this.toIndentedString(this.transactionId))
	     .append("\n");
	 sb
	     .append("    timestamp: ")
	     .append(this.toIndentedString(this.timestamp))
	     .append("\n");
	 sb
	     .append("    errors: ")
	     .append(this.toIndentedString(this.errors))
	     .append("\n");
	 sb.append("}");
	 return sb.toString();
    }
    
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(final java.lang.Object o) {
	 if (o == null) {
	     return "null";
	 }
	 return o
	     .toString()
	     .replace("\n", "\n    ");
    }
}
