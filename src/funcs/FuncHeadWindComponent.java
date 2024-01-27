package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncHeadWindComponent extends Func {
	Double trueCourse;
	Double windDirection;
	Double windSpeed;

	public void fit(HashMap<String, Double> params) {
		boolean validParams = true;
		trueCourse = params.get(Settings.TRUE_COURSE_CODE);
		windDirection = params.get(Settings.WIND_DIRECTION_CODE);
		windSpeed = params.get(Settings.WIND_SPEED_CODE);
		validParams = trueCourse != null;
		validParams = windDirection != null;
		if (!validParams) {
			System.out.println(
					String.format(
						Settings.INVALID_PARAMS_ERROR + "%1$s=%2$f %3$s=%4$f %5$s=%6$f", 
						Settings.TRUE_COURSE_CODE, 
						trueCourse, 
						Settings.WIND_DIRECTION_CODE, 
						windDirection,
						Settings.WIND_SPEED_CODE,
						windSpeed
					)
				);
			System.exit(0);
		}
	}

	public void call() {
		code = Settings.HEAD_WIND_COMPONENT_CODE;
		Double[] trueRadials = {windDirection % Settings.MAX_RADIAL, trueCourse % Settings.MAX_RADIAL};
		Arrays.sort(trueRadials);
		Double radialDelta = trueRadials[1] - trueRadials[0]; 
		Double radialRadians = Math.toRadians(radialDelta);
		Double crossWindFactor = Math.cos(radialRadians);
		result = Math.max(crossWindFactor * windSpeed, 0.0);
	}

}
