package com.exchange.model;

public class CurrencyValue {
	
	private ExchangeRates exchangeRate;
	private double currencyFromValue;
	private double currencyToValue;
	private String message;
	
	public CurrencyValue() {
		super();
	}
		
	public CurrencyValue(ExchangeRates exchangeRate, double currencyFromValue, double currencyToValue, String message) {
		super();
		this.exchangeRate = exchangeRate;
		this.currencyFromValue = currencyFromValue;
		this.currencyToValue = currencyToValue;
		this.setMessage(message);
	}

	public ExchangeRates getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(ExchangeRates exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public double getCurrencyFromValue() {
		return currencyFromValue;
	}
	public void setCurrencyFromValue(double currencyFromValue) {
		this.currencyFromValue = currencyFromValue;
	}
	public double getCurrencyToValue() {
		return currencyToValue;
	}
	public void setCurrencyToValue(double currencyToValue) {
		this.currencyToValue = currencyToValue;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
