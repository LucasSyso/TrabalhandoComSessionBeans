package com.lucas.bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.lucas.ejb.TemperatureConverterBeanLocal;


@SuppressWarnings("serial")
@Named("form")
@RequestScoped
public class FormBean implements Serializable{

	private Double tc;
	private Double tf;
	
	//Vamos trabalhar com a interface e anotar com @EJB, que indica ao container que o atributo é de um ejb
	@EJB
	TemperatureConverterBeanLocal converter;
	
	public String convertCelsiusToFahrenheit() {
		this.tf = converter.convertCelsiusToFahrenheit(tc);
		return null;
	}
	
	public Double getTc() {
		return tc;
	}
	public void setTc(Double tc) {
		this.tc = tc;
		this.tf = converter.convertCelsiusToFahrenheit(tc);
	}
	
	public Double getTf() {
		return tf;
	}
	public void setTf(Double tf) {
		this.tf = tf;
	}
	
}
