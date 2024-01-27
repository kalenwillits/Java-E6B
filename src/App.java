import funcs.FuncType;
import funcs.Func;
import funcs.FuncHelp;
import funcs.FuncCrossWindComponent;
import funcs.FuncHeadWindComponent;
import funcs.FuncTailWindComponent;
import funcs.FuncWindCorrectionAngle;
import funcs.FuncGroundSpeed;


public class App {
	public static void main(String[] args) {
		ArgumentParser argumentParser = new ArgumentParser(args);
		FuncType funcSelect = argumentParser.getFunc();

		Func func = switch (funcSelect) {
			case HELP -> new FuncHelp();
			case CWC -> new FuncCrossWindComponent();
			case HWC -> new FuncHeadWindComponent();
			case TWC -> new FuncTailWindComponent();
			case WCA -> new FuncWindCorrectionAngle();
			case GS -> new FuncGroundSpeed();
		};

		func.fit(argumentParser.getParams());
		func.call();
		func.print();
	}
}
