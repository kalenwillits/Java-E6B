package funcs;

import java.lang.Math;
import java.util.HashMap;


public class FuncDensityAltitude extends Func {
	public static final String[] requiredParams = {
		Settings.PRESSURE_ALTITUDE_CODE,
		Settings.OUTSIDE_AIR_TEMPERATURE_CODE,
	};

	private Double pressureAltitude;
	private Double outsideAirTemperature;

	public void fit(HashMap<String, Double> params) {
		pressureAltitude = params.get(Settings.PRESSURE_ALTITUDE_CODE);
		outsideAirTemperature = params.get(Settings.OUTSIDE_AIR_TEMPERATURE_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.DENSITY_ALTITUDE_CODE;
		Double correctedStandardTemperature = Settings.STANDARD_TEMPERATURE_C - (pressureAltitude / Settings.TEMPERATURE_LAPSE_RATE_PER_FEET) * 2;
		Double temperatureDelta = outsideAirTemperature - correctedStandardTemperature;
		result = pressureAltitude + (Settings.DENSITY_CHANGE_FACTOR * temperatureDelta);
	}
}
