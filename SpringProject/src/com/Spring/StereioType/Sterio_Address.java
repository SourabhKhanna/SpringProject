package com.Spring.StereioType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sterio_Address {
	@Value("Rajpur")
	private String cityName;
	@Value("MP")
	private String stateName;
	@Value("India")
	private String countryName;
	
	public Sterio_Address() {
		// TODO Auto-generated constructor stub
	}
	public Sterio_Address(String cityName, String stateName, String countryName) {
		super();
		System.out.println("setting");
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		 return cityName + " " + stateName + " " +countryName;
	}


}
