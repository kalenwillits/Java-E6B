package funcs;

import java.util.HashMap;

public class FuncHelp extends Func {
	static final String HELP_DOCUMENT = """
		This is the help doc!
""";
	public void fit(HashMap<String, String> params) {}

	public void call() {
		System.out.println(HELP_DOCUMENT);
	}

}
