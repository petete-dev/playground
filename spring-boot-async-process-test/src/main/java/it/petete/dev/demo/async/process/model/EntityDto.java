package it.petete.dev.demo.async.process.model;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * EntityDto
 */
public class EntityDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("order")
    private Integer order = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("body")
    private String body = null;

    public EntityDto code(final String code) {
	 this.code = code;
	 return this;
    }

    /**
     * Numeric code of the Entity
     * @return code
     **/
    @ApiModelProperty(required = true, value = "Numeric code of the Entity")
    @NotNull

    @Size(max = 3)
    public String getCode() {
	 return this.code;
    }

    public void setCode(final String code) {
	 this.code = code;
    }

    public EntityDto order(final Integer order) {
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
	 return this.order;
    }

    public void setOrder(final Integer order) {
	 this.order = order;
    }

    public EntityDto title(final String title) {
	 this.title = title;
	 return this;
    }

    /**
     * Title of the Entity
     * @return title
     **/
    @ApiModelProperty(required = true, value = "Title of the Entity")
    @NotNull

    @Size(max = 150)
    public String getTitle() {
	 return this.title;
    }

    public void setTitle(final String title) {
	 this.title = title;
    }

    public EntityDto body(final String body) {
	 this.body = body;
	 return this;
    }

    /**
     * Detailed description Entity in rich-text HTML format
     * @return body
     **/
    @ApiModelProperty(value = "Detailed description Entity in rich-text HTML format")

    public String getBody() {
	 return this.body;
    }

    public void setBody(final String body) {
	 this.body = body;
    }

    @Override
    public boolean equals(final java.lang.Object o) {
	 if (this == o) {
	     return true;
	 }
	 if ((o == null) || (this.getClass() != o.getClass())) {
	     return false;
	 }
	 final EntityDto entityDto = (EntityDto) o;
	 return Objects.equals(this.code, entityDto.code) && Objects.equals(this.order, entityDto.order) && Objects.equals(this.title, entityDto.title) && Objects.equals(this.body, entityDto.body);
    }

    @Override
    public int hashCode() {
	 return Objects.hash(this.code, this.order, this.title, this.body);
    }

    @Override
    public String toString() {
	 final StringBuilder sb = new StringBuilder();
	 sb.append("class EntityDto {\n");

	 sb
	     .append("    code: ")
	     .append(this.toIndentedString(this.code))
	     .append("\n");
	 sb
	     .append("    order: ")
	     .append(this.toIndentedString(this.order))
	     .append("\n");
	 sb
	     .append("    title: ")
	     .append(this.toIndentedString(this.title))
	     .append("\n");
	 sb
	     .append("    body: ")
	     .append(this.toIndentedString(this.body))
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
