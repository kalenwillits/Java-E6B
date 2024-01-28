package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncCelsiusToFahrenheit extends Func {
	public static final String[] requiredParams = {
		Settings.CELCIUS_CODE
	};


	private Double celsius;

	public void fit(HashMap<String, Double> params) {
		celsius = params.get(Settings.CELCIUS_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.FAHRENHEIT_CODE;
		result = ((9d / 5d) * celsius) + 32;
	}
}
