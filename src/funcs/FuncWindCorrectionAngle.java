package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncWindCorrectionAngle extends Func {
	public static final String[] requiredParams = {
		Settings.TRUE_AIRSPEED_CODE,
		Settings.TRUE_COURSE_CODE, 
		Settings.WIND_DIRECTION_CODE, 
		Settings.WIND_SPEED_CODE
	};

	private FuncGroundSpeed funcGS = new FuncGroundSpeed();
	private FuncCrossWindComponent funcCWC = new FuncCrossWindComponent();

	public void fit(HashMap<String, Double> params) {
		funcGS.fit(params);
		funcCWC.fit(params);

		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.WIND_CORRECTION_ANGLE_CODE;
		funcCWC.call();
		funcGS.call();
		if (funcGS.result == 0) {
			System.out.println(Settings.DIVIDE_BY_ZERO_ERROR + "GS=0");
			System.exit(0);
		};
		Double crossWindComponentRadians = Math.toRadians(funcCWC.result);
		Double groundSpeedRadians = Math.toRadians(funcGS.result);
		result = Math.toDegrees(Math.atan(crossWindComponentRadians / groundSpeedRadians));
	}
}
