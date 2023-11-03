package cmmn;

import java.text.DecimalFormat;

public class Function {

	public static boolean checkNum(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean checkNull(String str) {
		try {
			if(str.toString() == null)	return false;
			else						return true;
		} catch (NullPointerException ex) {
			return false;
		}
	}
	
	public static String onlyNumComma(double str) {
		DecimalFormat df = new DecimalFormat("###,###,###.######");
		return df.format(str);
	}
	/*
	public static String onlyNumComma1(double str) {
		NumberFormat df = new NumberFormat.getInstance();
		return df.format(str);
	}
	*/
}
