package funcs;

import java.lang.Math;
import java.util.HashMap;


public class FuncTrueAirspeed extends Func {
	public static final String[] requiredParams = {
		Settings.CALIBRATED_AIRPSEED_CODE,
		Settings.PRESSURE_ALTITUDE_CODE,
		Settings.OUTSIDE_AIR_TEMPERATURE_CODE,
	};

	private Double calibratedAirspeed;
	private Double outsideAirTemperature;
	private Double pressureAltitude;

	public void fit(HashMap<String, Double> params) {
		calibratedAirspeed = params.get(Settings.CALIBRATED_AIRPSEED_CODE);
		outsideAirTemperature = params.get(Settings.OUTSIDE_AIR_TEMPERATURE_CODE);
		pressureAltitude = params.get(Settings.PRESSURE_ALTITUDE_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.TRUE_AIRSPEED_CODE;
        double altitudeMeters = pressureAltitude * 0.3048d;
        double nonStandardTempKelvin = outsideAirTemperature + Settings.CELCIUS_TO_KELVIN_FACTOR;
		double airDensity = Settings.STANDARD_AIR_DENSITY * Math.pow(
				1 - (
						Settings.TEMPERATURE_LAPSE_RATE_KPM * altitudeMeters
					) / nonStandardTempKelvin, Settings.GRAVITY_ACCELERATION / (
						Settings.SPECIFIC_GAS * Settings.TEMPERATURE_LAPSE_RATE_KPM
						)
				);
		result = calibratedAirspeed * Math.sqrt(Settings.STANDARD_AIR_DENSITY / airDensity);
	}
}
