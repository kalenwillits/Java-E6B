package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncCelciusToFahrenheit extends Func {
	public static final String[] requiredParams = {
		Settings.CELCIUS_CODE
	};


	private Double celcius;

	public void fit(HashMap<String, Double> params) {
		celcius = params.get(Settings.CELCIUS_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.FAHRENHEIT_CODE;
		result = ((9d / 5d) * celcius) + 32;
	}
}
