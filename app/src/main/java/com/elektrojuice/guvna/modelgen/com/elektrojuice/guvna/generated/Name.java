
package com.elektrojuice.guvna.generated;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "first",
    "last"
})
public class Name implements Parcelable
{

    @JsonProperty("first")
    private String first;
    @JsonProperty("last")
    private String last;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Name> CREATOR = new Creator<Name>() {


        public Name createFromParcel(Parcel in) {
            Name instance = new Name();
            instance.first = ((String) in.readValue((String.class.getClassLoader())));
            instance.last = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Name[] newArray(int size) {
            return (new Name[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The first
     */
    @JsonProperty("first")
    public String getFirst() {
        return first;
    }

    /**
     * 
     * @param first
     *     The first
     */
    @JsonProperty("first")
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 
     * @return
     *     The last
     */
    @JsonProperty("last")
    public String getLast() {
        return last;
    }

    /**
     * 
     * @param last
     *     The last
     */
    @JsonProperty("last")
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(first).append(last).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Name) == false) {
            return false;
        }
        Name rhs = ((Name) other);
        return new EqualsBuilder().append(first, rhs.first).append(last, rhs.last).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(first);
        dest.writeValue(last);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
