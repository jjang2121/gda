package chap11;

/*
String 클래스 정적문자열 특징
*/

public class StringEx3 {

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		// str = change(str);
		// System.out.println("change() 후 main : " + str);
		System.out.println("change() 후 main : " + change(str));
	}
	/*
	private static String change(String str) {
		str += "456";
		System.out.println("change : " + str);
		return str;
	}
	*/
	private static String change(String str) {
		return str+="456";
	}
}
