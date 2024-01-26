package funcs;


public enum FuncType {
	HELP("HELP")
	;

  private String funcType;

  FuncType(String funcType) {
    this.funcType = funcType;
  }

  public String getFuncType() {
    return funcType;
  }
}
