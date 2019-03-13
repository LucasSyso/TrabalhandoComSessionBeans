package com.lucas.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

//@Local
@Remote //Para casos onde essa interface ser� instanciada de outra jvm
public interface TemperatureConverterBeanLocal {

	public double convertCelsiusToFahrenheit(double tc);
	
}
