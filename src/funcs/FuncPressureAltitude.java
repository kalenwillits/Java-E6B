package funcs;

import java.lang.Math;
import java.util.HashMap;


public class FuncPressureAltitude extends Func {
	public static final String[] requiredParams = {
		Settings.TRUE_ALTITUDE_CODE,
		Settings.ALTIMETER_SETTING_CODE
	};

	private Double altimeterSetting;
	private Double trueAltitude;

	public void fit(HashMap<String, Double> params) {
		altimeterSetting = params.get(Settings.ALTIMETER_SETTING_CODE);
		trueAltitude = params.get(Settings.TRUE_ALTITUDE_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.PRESSURE_ALTITUDE_CODE;
		result = trueAltitude + 1000d * (Settings.STANDARD_PRESSURE - altimeterSetting); 
	
	}
}
