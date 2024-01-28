package funcs;


public enum FuncType {
	CTF(Settings.CELCIUS_TO_FAHRENHEIT_CODE),
	CWC(Settings.CROSS_WIND_COMPONENT_CODE),
	DA(Settings.DENSITY_ALTITUDE_CODE),
	FTC(Settings.FAHRENHEIT_TO_CECLIUS_CODE),
	FUEL(Settings.FUEL_CODE),
	GS(Settings.GROUND_SPEED_CODE),
	HELP(Settings.HELP_CODE),
	HWC(Settings.HEAD_WIND_COMPONENT_CODE),
	NM(Settings.NAUTICAL_MILES_CODE),
	PA(Settings.PRESSURE_ALTITUDE_CODE),
	SM(Settings.STATUTE_MILES_CODE),
	TAS(Settings.TRUE_AIRSPEED_CODE),
	TIME(Settings.TIME_CODE),
	TWC(Settings.TAIL_WIND_COMPONENT_CODE),
	WCA(Settings.WIND_CORRECTION_ANGLE_CODE);

  private String funcType;

  FuncType(String funcType) {
    this.funcType = funcType;
  }

  public String getFuncType() {
    return funcType;
  }
}
