import java.util.HashMap;
import java.util.Arrays;
import funcs.FuncType;

public class ArgumentParser {
	static final String NO_FUNCTION_SPECIFIED_ERROR = "No Function Specified";

	static String function;	
	static HashMap<String, String> params = new HashMap<String, String>();

	public ArgumentParser(String[] args) {
		if (args.length < 1) {
			throw new java.lang.Error(NO_FUNCTION_SPECIFIED_ERROR);	
		} 
		function = args[0];
		String[] paramsArray = Arrays.copyOfRange(args, 1, args.length);
		ArgumentParser.parseParams(paramsArray);
	}

	static void parseParams(String[] paramsArray) {
		String[] pairQueue = { "", "" };
		for (String argPart : paramsArray) {
			if (pairQueue[0] == "") {
				pairQueue[0] = argPart;
			} else if (pairQueue[1] == "") {
				pairQueue[1] = argPart;
			} else {
				params.put(pairQueue[0], pairQueue[1]);
				pairQueue[0] = "";
				pairQueue[1] = "";
			}
		}
	}

	public HashMap<String, String> getParams() {
		return params; 
	}

	public FuncType getFunc() {
		return FuncType.valueOf(function.toUpperCase());
	}
}
