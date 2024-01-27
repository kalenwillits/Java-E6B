import funcs.FuncType;
import funcs.Func;
import funcs.FuncHelp;
import funcs.FuncCrossWindComponent;
import funcs.FuncHeadWindComponent;
import funcs.FuncTailWindComponent;


public class App {
	public static void main(String[] args) {
		ArgumentParser argumentParser = new ArgumentParser(args);
		FuncType funcSelect = argumentParser.getFunc();

		Func func = switch (funcSelect) {
			case HELP -> new FuncHelp();
			case CWC -> new FuncCrossWindComponent();
			case HWC -> new FuncHeadWindComponent();
			case TWC -> new FuncTailWindComponent();
		};

		func.fit(argumentParser.getParams());
		func.call();
		func.print();
	}
}
