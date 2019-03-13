package com.lucas.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class TemperatureConverterBean
 */

//Anota��o que indica que o bean � do tipo Stateless
@Stateless
public class TemperatureConverterBean implements TemperatureConverterBeanLocal {

	@Override
	public double convertCelsiusToFahrenheit(double tc) {
		return 9 * (tc / 2) + 32;
	}

    

}
