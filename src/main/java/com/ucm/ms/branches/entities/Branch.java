package com.ucm.ms.branches.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "branch")
public class Branch implements Serializable {
	private static final long serialVersionUID = -5346346502452405011L;

	// Data
	@Id
	@Column(name = "location_number")
	private Integer locationNumber;

	@Column(name = "name")
	private String name;

	@Column(name = "zip")
	private String zip;

	@Column(name = "street_address")
	private String streetAddress;

	@Column(name = "city")
	private String city;

	@Column(name = "opening_time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
	private LocalTime openingTime;

	@Column(name = "closing_time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
	private LocalTime closingTime;

	@Column(name = "type")
	private String type;
	
	@Column(name = "phone")
	private String phone;
	
	// Relationships
	// None

	// Methods
	public Branch() {
	}

	public Branch(Integer locationNumber, String name, String zip, String streetAddress, String city,
			LocalTime openingTime, LocalTime closingTime, String type, String phone) {
		this.locationNumber = locationNumber;
		this.name = name;
		this.zip = zip;
		this.streetAddress = streetAddress;
		this.city = city;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.type = type;
		this.phone = phone;
	}

	public Integer getLocationNumber() {
		return locationNumber;
	}

	public void setLocationNumber(Integer locationNumber) {
		this.locationNumber = locationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalTime getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Branch branch = (Branch) o;
		return Objects.equals(locationNumber, branch.locationNumber) && Objects.equals(name, branch.name)
				&& Objects.equals(zip, branch.zip) && Objects.equals(streetAddress, branch.streetAddress)
				&& Objects.equals(city, branch.city) && Objects.equals(openingTime, branch.openingTime)
				&& Objects.equals(closingTime, branch.closingTime) && Objects.equals(type, branch.type) 
				&& Objects.equals(phone, branch.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(locationNumber, name, zip, streetAddress, city, openingTime, closingTime, type, phone);
	}

}
