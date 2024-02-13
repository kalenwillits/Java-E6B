package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncGroundSpeed extends Func {
	public static final String[] requiredParams = {
		Settings.TRUE_COURSE_CODE, 
		Settings.WIND_DIRECTION_CODE, 
		Settings.WIND_SPEED_CODE,
		Settings.TRUE_AIRSPEED_CODE
	};

	private Double trueAirspeed;
	private FuncHeadWindComponent funcHWC = new FuncHeadWindComponent();
	private FuncTailWindComponent funcTWC = new FuncTailWindComponent();

	public void fit(HashMap<String, Double> params) {
		funcHWC.fit(params);
		funcTWC.fit(params);
		trueAirspeed = params.get(Settings.TRUE_AIRSPEED_CODE);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.GROUND_SPEED_CODE;
		funcHWC.call();
		funcTWC.call();
		double windComponent = Math.max(funcHWC.result, funcTWC.result);
		if (funcHWC.result < funcTWC.result) {
			windComponent*=-1;
		}
		result = (trueAirspeed - windComponent);
	}
}
