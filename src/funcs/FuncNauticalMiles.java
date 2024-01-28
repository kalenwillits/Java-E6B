package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncNauticalMiles extends Func {
	public static final String[] requiredParams = {
		Settings.STATUTE_MILES_CODE,
	};

	private Double statuteMiles;

	public void fit(HashMap<String, Double> params) {
		statuteMiles = params.get(Settings.STATUTE_MILES_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.NAUTICAL_MILES_CODE;
		result = statuteMiles / Settings.NAUTICAL_MILES_TO_STATUTE_MILES_FACTOR;
	}
}
