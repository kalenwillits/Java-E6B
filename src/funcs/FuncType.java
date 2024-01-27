package funcs;


public enum FuncType {
	HELP(Settings.HELP_CODE),
	CWC(Settings.CROSS_WIND_COMPONENT_CODE)
	;

  private String funcType;

  FuncType(String funcType) {
    this.funcType = funcType;
  }

  public String getFuncType() {
    return funcType;
  }
}
