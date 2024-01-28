package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncStatuteMiles extends Func {
	public static final String[] requiredParams = {
		Settings.NAUTICAL_MILES_CODE,
	};

	private Double nauticalMiles;

	public void fit(HashMap<String, Double> params) {
		nauticalMiles = params.get(Settings.NAUTICAL_MILES_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.STATUTE_MILES_CODE;
		result = nauticalMiles * Settings.NAUTICAL_MILES_TO_STATUTE_MILES_FACTOR;
	}
}
