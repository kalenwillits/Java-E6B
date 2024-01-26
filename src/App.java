import funcs.FuncType;
import funcs.Func;
import funcs.FuncHelp;


public class App {
	public static void main(String[] args) {
		ArgumentParser argumentParser = new ArgumentParser(args);
		FuncType funcSelect = argumentParser.getFunc();
		Func func = switch (funcSelect) {
			case HELP -> new FuncHelp();
		};
		func.fit(argumentParser.getParams());
		func.call();
	}
}
