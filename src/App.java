import funcs.FuncType;
import funcs.Func;
import funcs.FuncHelp;
import funcs.FuncCrossWindComponent;


public class App {
	public static void main(String[] args) {
		ArgumentParser argumentParser = new ArgumentParser(args);
		FuncType funcSelect = argumentParser.getFunc();
		Func func = switch (funcSelect) {
			case HELP -> new FuncHelp();
			case CWC -> new FuncCrossWindComponent();
		};
		func.fit(argumentParser.getParams());
		func.call();
		func.print();
	}
}
