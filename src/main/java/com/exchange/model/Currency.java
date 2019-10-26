package com.exchange.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
	
	private String currencyName;
	private String currencyId;
	
	public Currency() {
		super();
	}

	public Currency(String currencyName, String currencyId) {
		super();
		this.currencyName = currencyName;
		this.currencyId = currencyId;		
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

}
