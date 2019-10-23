package com.exchange.model;

public class ExchangeRates {
	
	private String currencyFrom;
	private String currencyTo;
	private double exchangeValue;
	
	public ExchangeRates() {
		super();
	}
	
	public ExchangeRates(String currencyFrom, String currencyTo, double exchangeValue) {
		super();
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.exchangeValue = exchangeValue;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public double getExchangeValue() {
		return exchangeValue;
	}
	public void setExchangeValue(double exchangeValue) {
		this.exchangeValue = exchangeValue;
	}
	
	

}
