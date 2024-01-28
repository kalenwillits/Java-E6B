import funcs.FuncType;
import funcs.Func;
import funcs.FuncHelp;
import funcs.FuncCrossWindComponent;
import funcs.FuncHeadWindComponent;
import funcs.FuncTailWindComponent;
import funcs.FuncWindCorrectionAngle;
import funcs.FuncGroundSpeed;
import funcs.FuncFahrenheitToCelsius;
import funcs.FuncCelsiusToFahrenheit;
import funcs.FuncTrueAirspeed;
import funcs.FuncPressureAltitude;
import funcs.FuncDensityAltitude;
import funcs.FuncFuelConsumption;
import funcs.FuncTimeEnRoute;
import funcs.FuncNauticalMiles;
import funcs.FuncStatuteMiles;


public class App {
	public static final String VERSION = "0.1";

	public static void main(String[] args) {
		if (args.length > 1) {
			if (args[1].toUpperCase() == "VERSION") {
				System.out.println("Java E6B v" + VERSION);
				System.exit(0);
			}
		}

		ArgumentParser argumentParser = new ArgumentParser(args);
		FuncType funcSelect = argumentParser.getFunc();

		Func func = switch (funcSelect) {
			case HELP -> new FuncHelp();
			case CWC -> new FuncCrossWindComponent();
			case HWC -> new FuncHeadWindComponent();
			case TWC -> new FuncTailWindComponent();
			case WCA -> new FuncWindCorrectionAngle();
			case GS -> new FuncGroundSpeed();
			case FTC -> new FuncFahrenheitToCelsius();
			case CTF -> new FuncCelsiusToFahrenheit();
			case TAS -> new FuncTrueAirspeed();
			case PA -> new FuncPressureAltitude();
			case DA -> new FuncDensityAltitude();
			case FUEL -> new FuncFuelConsumption();
			case TIME -> new FuncTimeEnRoute();
			case NM -> new FuncNauticalMiles();
			case SM -> new FuncStatuteMiles();
		};

		func.fit(argumentParser.getParams());
		func.call();
		func.print();
	}
}
