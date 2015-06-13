
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
    "name",
    "electorate",
    "house",
    "party"
})
public class Latest_member implements Parcelable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("electorate")
    private String electorate;
    @JsonProperty("house")
    private String house;
    @JsonProperty("party")
    private String party;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Latest_member> CREATOR = new Creator<Latest_member>() {


        public Latest_member createFromParcel(Parcel in) {
            Latest_member instance = new Latest_member();
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.name = ((Name) in.readValue((Name.class.getClassLoader())));
            instance.electorate = ((String) in.readValue((String.class.getClassLoader())));
            instance.house = ((String) in.readValue((String.class.getClassLoader())));
            instance.party = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Latest_member[] newArray(int size) {
            return (new Latest_member[size]);
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
     *     The name
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The electorate
     */
    @JsonProperty("electorate")
    public String getElectorate() {
        return electorate;
    }

    /**
     * 
     * @param electorate
     *     The electorate
     */
    @JsonProperty("electorate")
    public void setElectorate(String electorate) {
        this.electorate = electorate;
    }

    /**
     * 
     * @return
     *     The house
     */
    @JsonProperty("house")
    public String getHouse() {
        return house;
    }

    /**
     * 
     * @param house
     *     The house
     */
    @JsonProperty("house")
    public void setHouse(String house) {
        this.house = house;
    }

    /**
     * 
     * @return
     *     The party
     */
    @JsonProperty("party")
    public String getParty() {
        return party;
    }

    /**
     * 
     * @param party
     *     The party
     */
    @JsonProperty("party")
    public void setParty(String party) {
        this.party = party;
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
        return new HashCodeBuilder().append(id).append(name).append(electorate).append(house).append(party).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Latest_member) == false) {
            return false;
        }
        Latest_member rhs = ((Latest_member) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(electorate, rhs.electorate).append(house, rhs.house).append(party, rhs.party).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(electorate);
        dest.writeValue(house);
        dest.writeValue(party);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
