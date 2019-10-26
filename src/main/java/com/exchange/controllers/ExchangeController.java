package com.exchange.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.model.Currency;
import com.exchange.model.CurrencyValue;
import com.exchange.service.ExchangeService;

@RestController
@RequestMapping("/api")
public class ExchangeController {
	
	@Autowired
	ExchangeService exchangeService;
	
	@RequestMapping("/convert/{from}/{to}/{amount}")
    public CurrencyValue convertAmount(@PathVariable String from, 
    		@PathVariable String to,@PathVariable double amount 
    		){
		 return exchangeService.getCurrencyValue(from, to, amount); 
    }
	
	@RequestMapping("/getAllCurrencies")
    public List<Currency> getAllCurrencies(){
		return exchangeService.getAllCurrencies();
    }
	

}
