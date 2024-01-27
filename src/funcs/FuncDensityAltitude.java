package funcs;

import java.lang.Math;
import java.util.HashMap;


public class FuncDensityAltitude extends Func {
	public static final String[] requiredParams = {
		Settings.PRESSURE_ALTITUDE_CODE
	};


	private Double pressureAltitude;

	public void fit(HashMap<String, Double> params) {
		pressureAltitude = params.get(Settings.PRESSURE_ALTITUDE_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.DENSITY_ALTITUDE_CODE;
	}
}
