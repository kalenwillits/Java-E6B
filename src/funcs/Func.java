package funcs;

import java.util.HashMap;


public abstract class Func {
	public String code;
	public Double result;

	public abstract void fit(HashMap<String, Double> params);

	public abstract void call();

	public void print() { 
		String output = String.format("%s=%f", code, result);
		System.out.println(output);	
	}

	public void validateParams(HashMap<String, Double> params, String[] requiredCodes) {
		String missingParams = ""; 
		for (String code : requiredCodes) {
			if (params.get(code) == null) {
				missingParams += " " + code;
			}
		}

		if (missingParams != "") {
			System.out.println(Settings.INVALID_PARAMS_ERROR + missingParams);
			System.exit(0);
		}

	};
}


