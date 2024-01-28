package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncFuelConsumption extends Func {
	public static final String[] requiredParams = {
		Settings.HOURS_CODE,
		Settings.MINUTES_CODE,
		Settings.GALLONS_PER_HOUR_CODE,
	};


	private Double hours;
	private Double minutes;
	private Double gallonsPerHour;

	public void fit(HashMap<String, Double> params) {
		gallonsPerHour = params.get(Settings.GALLONS_PER_HOUR_CODE);
		hours = params.get(Settings.HOURS_CODE);
		minutes = params.get(Settings.MINUTES_CODE);

		if (params.get(Settings.HOURS_CODE) == null & params.get(Settings.MINUTES_CODE) == null) {
			validateParams(params, requiredParams);
		} else {
			if (params.get(Settings.HOURS_CODE) == null) {
				params.put(Settings.HOURS_CODE, Settings.DEFAULT_TIME);
				hours = Settings.DEFAULT_TIME;	
			}
			if (params.get(Settings.MINUTES_CODE) == null) {
				params.put(Settings.MINUTES_CODE, Settings.DEFAULT_TIME);
				minutes = Settings.DEFAULT_TIME;
			}
		}
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.GALLONS_CODE;
		result = gallonsPerHour * (hours + (minutes / 60d));
	}
}
