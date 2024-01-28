package funcs;

import java.lang.Math;
import java.util.HashMap;
import java.util.Arrays;


public class FuncTimeEnRoute extends Func {
	public static final String[] requiredParams = {
		Settings.GROUND_SPEED_CODE,
		Settings.DISTANCE_CODE,
	};

	private Double groundSpeed;
	private Double distance;

	public void fit(HashMap<String, Double> params) {
		groundSpeed = params.get(Settings.GROUND_SPEED_CODE);
		distance = params.get(Settings.DISTANCE_CODE);
		if (groundSpeed == 0d) {
			System.out.println(
					Settings.DIVIDE_BY_ZERO_ERROR + String.format("%s=%f", Settings.GROUND_SPEED_CODE, groundSpeed)
				);
			System.exit(0);
		}
		validateParams(params, requiredParams);
	}

	public void call() {
		code = Settings.TIME_CODE;
		result = distance / groundSpeed;
	}
}
