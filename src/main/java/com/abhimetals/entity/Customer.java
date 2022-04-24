package com.abhimetals.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name ="Customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "id of the Customer",name="id",required=true,value="id")
    @Column(nullable=false)
    private Integer id;
    @Column(nullable=false)
    @ApiModelProperty(notes = "Name of the Customer",name="name",required=true,value="name")
    private String name;
    @ApiModelProperty(notes = "Phone Number of the Customer",name="phoneNumber",value="phoneNumber")
    private String phoneNumber;
    @ApiModelProperty(notes = "Modified Date of the Customer",name="modifiedDate",value="modifiedDate")
    private Date modifiedDate;
    @Column(nullable=false)
    @ApiModelProperty(notes = "Address of the Customer",name="address",value="address")
    private String address;
    @ApiModelProperty(notes = "State of the Customer",name="state",value="state")
    private String state;
    @ApiModelProperty(notes = "City of the Customer",name="city",value="city")
    private String city;
    @ApiModelProperty(notes = "Country of the Customer",name="country",value="country")
    private String country;
    @ApiModelProperty(notes = "PAN Number of the Customer",name="panNumber",value="panNumber")
    private String panNumber;
    @ApiModelProperty(notes = "GST Number of the Customer",name="gstNumber",value="gstNumber")
    private String gstNumber;
    @ApiModelProperty(notes = "Email Id of the Customer",name="emailId",value="emailId")
    private String emailId;
   
    
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPanNumber() {
		return panNumber;
	}


	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}


	public String getGstNumber() {
		return gstNumber;
	}


	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", modifiedDate="
				+ modifiedDate + ", address=" + address + ", state=" + state + ", city=" + city + ", country=" + country
				+ ", panNumber=" + panNumber + ", gstNumber=" + gstNumber + ", emailId=" + emailId + "]";
	}


	public Customer(Integer id, String name, String phoneNumber, Date modifiedDate, String address, String state,
			String city, String country, String panNumber, String gstNumber, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.modifiedDate = modifiedDate;
		this.address = address;
		this.state = state;
		this.city = city;
		this.country = country;
		this.panNumber = panNumber;
		this.gstNumber = gstNumber;
		this.emailId = emailId;
	}

    
    
}
