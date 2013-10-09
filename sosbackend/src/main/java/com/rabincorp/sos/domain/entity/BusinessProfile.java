
package com.rabincorp.sos.domain.entity;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author isakrabin
 */
@Entity
public class BusinessProfile extends BaseEntity implements Serializable{
    
    @Id
    @Column(name = "profile_id")
    private Long id;

    @NotNull
    private String name;
    
    @NotNull
    private String address;
    
    private String city;

    private String stateName;
    
    private String country;
    
    private String postalCode;
    
    private String phone;
    
    private String fax;
    
    private String email;
    
    private String websiteUrl;
    
    @OneToMany
    private Collection<OperationHour> businessHours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Collection<OperationHour> getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(Collection<OperationHour> businessHours) {
        this.businessHours = businessHours;
    }


    
}
