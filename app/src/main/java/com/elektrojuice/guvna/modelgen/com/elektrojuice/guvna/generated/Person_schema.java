
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
    "id",
    "latest_member"
})
public class Person_schema implements Parcelable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("latest_member")
    private Latest_member latest_member;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Person_schema> CREATOR = new Creator<Person_schema>() {


        public Person_schema createFromParcel(Parcel in) {
            Person_schema instance = new Person_schema();
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.latest_member = ((Latest_member) in.readValue((Latest_member.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Person_schema[] newArray(int size) {
            return (new Person_schema[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The latest_member
     */
    @JsonProperty("latest_member")
    public Latest_member getLatest_member() {
        return latest_member;
    }

    /**
     * 
     * @param latest_member
     *     The latest_member
     */
    @JsonProperty("latest_member")
    public void setLatest_member(Latest_member latest_member) {
        this.latest_member = latest_member;
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
        return new HashCodeBuilder().append(id).append(latest_member).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Person_schema) == false) {
            return false;
        }
        Person_schema rhs = ((Person_schema) other);
        return new EqualsBuilder().append(id, rhs.id).append(latest_member, rhs.latest_member).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(latest_member);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
