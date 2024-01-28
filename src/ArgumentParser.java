import java.util.HashMap;
import java.util.Arrays;
import funcs.FuncType;

public class ArgumentParser {
	static final String ARGUMENT_PARAMETER_DELIM = "=";

	static String function;	
	static HashMap<String, Double> params = new HashMap<String, Double>();

	public ArgumentParser(String[] args) {
		if (args.length < 1) {
			function = "HELP";
		} else { 
			function = args[0];
			String[] paramsArray = Arrays.copyOfRange(args, 1, args.length);
			ArgumentParser.parseParams(paramsArray);
		}
	}

	static void parseParams(String[] paramsArray) {
		for (String argPart : paramsArray) {
			String[] pair = argPart.split(ARGUMENT_PARAMETER_DELIM);
			if (pair.length != 2) {
				System.out.println(String.format("Syntax Error : %s", argPart));
				System.exit(0);
			}
			String key = pair[0].toUpperCase();
			double value = Double.parseDouble(pair[1]);
			params.put(key, value);
			}
		}

	public HashMap<String, Double> getParams() {
		return params; 
	}

	public FuncType getFunc() {
		return FuncType.valueOf(function.toUpperCase());
	}
}
