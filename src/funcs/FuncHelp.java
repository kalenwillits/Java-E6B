package funcs;

import java.util.HashMap;

public class FuncHelp extends Func {
	public void fit(HashMap<String, Double> params) {}
	public void call() {
		System.out.println(Settings.HELP_DOCUMENT);
		System.exit(0);
	};
}
