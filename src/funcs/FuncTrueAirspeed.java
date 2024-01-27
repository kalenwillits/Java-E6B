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
		 // Convert altitude to meters
        double altitudeMeters = pressureAltitude * 0.3048d;
		double rho0 = 1.225;  // Standard air density at sea level in kg/m³
		double L = 0.0065;   // Temperature lapse rate in K/m
		double T0 = 288.15;  // Standard temperature at sea level in K
		double g = 9.81;     // Acceleration due to gravity in m/s²
		double R = 287.0;    // Specific gas constant for dry air in J/(kg·K)
							 // // Calculate air density at the given altitude

        double nonStandardTempKelvin = outsideAirTemperature + 273.15;
        double rho = rho0 * Math.pow(1 - (L * altitudeMeters) / nonStandardTempKelvin, g / (R * L));
		result = calibratedAirspeed * Math.sqrt(rho0 / rho);
	}
}
