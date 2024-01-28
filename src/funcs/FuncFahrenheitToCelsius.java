package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncFahrenheitToCelsius extends Func {
	public static final String[] requiredParams = {
		Settings.FAHRENHEIT_CODE
	};


	private Double fahrenheit;

	public void fit(HashMap<String, Double> params) {
		fahrenheit = params.get(Settings.FAHRENHEIT_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.CELCIUS_CODE;
		result = (5d / 9d) * (fahrenheit - 32);
	}
}
