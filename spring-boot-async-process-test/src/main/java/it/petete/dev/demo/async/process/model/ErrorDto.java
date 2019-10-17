package it.petete.dev.demo.async.process.model;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorDto
 */
public class ErrorDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("internal_code")
    private String internalCode = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("details")
    private String details = null;

    public ErrorDto internalCode(final String internalCode) {
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
	 return this.internalCode;
    }

    public void setInternalCode(final String internalCode) {
	 this.internalCode = internalCode;
    }

    public ErrorDto message(final String message) {
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
	 return this.message;
    }

    public void setMessage(final String message) {
	 this.message = message;
    }

    public ErrorDto details(final String details) {
	 this.details = details;
	 return this;
    }

    /**
     * Message description
     * @return details
     **/
    @ApiModelProperty(value = "Message description")

    public String getDetails() {
	 return this.details;
    }

    public void setDetails(final String details) {
	 this.details = details;
    }

    @Override
    public boolean equals(final java.lang.Object o) {
	 if (this == o) {
	     return true;
	 }
	 if ((o == null) || (this.getClass() != o.getClass())) {
	     return false;
	 }
	 final ErrorDto errorDto = (ErrorDto) o;
	 return Objects.equals(this.internalCode, errorDto.internalCode) && Objects.equals(this.message, errorDto.message) && Objects.equals(this.details, errorDto.details);
    }

    @Override
    public int hashCode() {
	 return Objects.hash(this.internalCode, this.message, this.details);
    }

    @Override
    public String toString() {
	 final StringBuilder sb = new StringBuilder();
	 sb.append("class ErrorDto {\n");

	 sb
	     .append("    internalCode: ")
	     .append(this.toIndentedString(this.internalCode))
	     .append("\n");
	 sb
	     .append("    message: ")
	     .append(this.toIndentedString(this.message))
	     .append("\n");
	 sb
	     .append("    details: ")
	     .append(this.toIndentedString(this.details))
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
