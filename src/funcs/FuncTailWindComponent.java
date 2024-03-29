package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncTailWindComponent extends Func {
	public static final String[] requiredParams = {
		Settings.TRUE_COURSE_CODE, 
		Settings.WIND_DIRECTION_CODE, 
		Settings.WIND_SPEED_CODE
	};


	private FuncHeadWindComponent funcHWC = new FuncHeadWindComponent();

	public void fit(HashMap<String, Double> params) {
		funcHWC.fit(params);
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.TAIL_WIND_COMPONENT_CODE;
		funcHWC.call();
		result = funcHWC.result * -1;
	}
}
