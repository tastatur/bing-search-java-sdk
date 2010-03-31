
package com.google.code.bing.search.schema.adapter.json.phonebook;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.phonebook.PhonebookResult;
public class PhonebookResultImpl
    extends BaseAdapter implements PhonebookResult, Adaptable<PhonebookResult, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String url;
    protected String business;
    protected String phoneNumber;
    protected String address;
    protected String city;
    protected String stateOrProvince;
    protected String countryOrRegion;
    protected String postalCode;
    protected Double latitude;
    protected Double longitude;
    protected String uniqueId;
    protected String businessUrl;
    protected Double userRating;
    protected Long reviewCount;
    protected String displayUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String value) {
        this.business = value;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    public String getCountryOrRegion() {
        return countryOrRegion;
    }

    public void setCountryOrRegion(String value) {
        this.countryOrRegion = value;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double value) {
        this.longitude = value;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    public String getBusinessUrl() {
        return businessUrl;
    }

    public void setBusinessUrl(String value) {
        this.businessUrl = value;
    }

    public Double getUserRating() {
        return userRating;
    }

    public void setUserRating(Double value) {
        this.userRating = value;
    }

    public Long getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Long value) {
        this.reviewCount = value;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
}
