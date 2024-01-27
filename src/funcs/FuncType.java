package funcs;


public enum FuncType {
	HELP(Settings.HELP_CODE),
	CWC(Settings.CROSS_WIND_COMPONENT_CODE),
	HWC(Settings.HEAD_WIND_COMPONENT_CODE),
	TWC(Settings.TAIL_WIND_COMPONENT_CODE),
	WCA(Settings.WIND_CORRECTION_ANGLE_CODE),
	GS(Settings.GROUND_SPEED_CODE),
	FTC(Settings.FAHRENHEIT_TO_CECLIUS_CODE),
	CTF(Settings.CELCIUS_TO_FAHRENHEIT_CODE),
	TAS(Settings.TRUE_AIRSPEED_CODE),
	PA(Settings.PRESSURE_ALTITUDE_CODE),
	DA(Settings.DENSITY_ALTITUDE_CODE);

  private String funcType;
  // TODO

  FuncType(String funcType) {
    this.funcType = funcType;
  }

  public String getFuncType() {
    return funcType;
  }
}
