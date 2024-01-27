import funcs.FuncType;
import funcs.Func;
import funcs.FuncHelp;
import funcs.FuncCrossWindComponent;
import funcs.FuncHeadWindComponent;
import funcs.FuncTailWindComponent;
import funcs.FuncWindCorrectionAngle;
import funcs.FuncGroundSpeed;
import funcs.FuncFahrenheitToCelcius;
import funcs.FuncCelciusToFahrenheit;


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
			case FTC -> new FuncFahrenheitToCelcius();
			case CTF -> new FuncCelciusToFahrenheit();
		};

		func.fit(argumentParser.getParams());
		func.call();
		func.print();
	}
}
