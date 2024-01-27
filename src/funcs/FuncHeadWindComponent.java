package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncHeadWindComponent extends Func {
	public static final String[] requiredParams = {
		Settings.TRUE_COURSE_CODE, 
		Settings.WIND_DIRECTION_CODE, 
		Settings.WIND_SPEED_CODE
	};

	private Double trueCourse;
	private Double windDirection;
	private Double windSpeed;

	public void fit(HashMap<String, Double> params) {
		trueCourse = params.get(Settings.TRUE_COURSE_CODE);
		windDirection = params.get(Settings.WIND_DIRECTION_CODE);
		windSpeed = params.get(Settings.WIND_SPEED_CODE);

		validateParams(params, requiredParams);
	}
		
	public void call() {
		code = Settings.HEAD_WIND_COMPONENT_CODE;
		Double radialRadians = Math.toRadians(windDirection - trueCourse);
		Double crossWindFactor = Math.cos(radialRadians);
		result = crossWindFactor * windSpeed;
	}
}
