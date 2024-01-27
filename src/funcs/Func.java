package funcs;

import java.util.HashMap;


public abstract class Func {
	public String code;
	public Double result;

	public abstract void fit(HashMap<String, Double> params);

	public abstract void call();

	public void print() { 
		String output = String.format("%s=%f", code, result);
		System.out.println(output);	
	}
}


