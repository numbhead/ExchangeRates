package com.exchange.service;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.exchange.model.CurrencyValue;
import com.exchange.model.ExchangeRates;

@Service
public class ExchangeService {
	
	@Autowired
	@Value("${app.resturl.apiaccesskey}")
	private String apiKey;
	
	@Autowired
	@Value("${app.resturl}")
	private String exchangeURL;

	public double getExchangeRates(String currencyFrom, String currencyTo)
	{
		double exchangeRate;
		String uri = exchangeURL.trim()+currencyFrom.toUpperCase()+"_"+currencyTo.toUpperCase()+
				"&compact=ultra&apiKey="+apiKey;
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		System.out.println("Result is "+result+result+result);
		if(!result.trim().equals("{}"))
		{
			String[] value = result.split(":");
			exchangeRate = Double.parseDouble(value[1].substring(0, value[1].length()-1));
			return exchangeRate;
		}
		else
			return -1;
	}
	
	public CurrencyValue getCurrencyValue(String currencyFrom, String currencyTo, double amount)
	{
		DecimalFormat deciFormat = new DecimalFormat("#.##");
		double  exchangeValue = getExchangeRates(currencyFrom,currencyTo);
		String message;
		if(exchangeValue>=0){
			message="Currency conversion successful";
			ExchangeRates exchangeRates = new ExchangeRates(currencyFrom.toUpperCase(),currencyTo.toUpperCase(),exchangeValue);
			return new CurrencyValue(exchangeRates,amount,Double.parseDouble(deciFormat.format(amount*exchangeValue)),message);
		}
		else{
			ExchangeRates exchangeRates = new ExchangeRates(currencyFrom.toUpperCase(),currencyTo.toUpperCase(),0);
			message = "Invalid currency formats found";
			return new CurrencyValue(exchangeRates,amount,0,message);
		}
	}
}
