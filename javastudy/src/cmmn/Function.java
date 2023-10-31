package cmmn;

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
	
	
}
