package chap11;

/*
숫자 <- 문자열 변경

*/

public class StringEx5 {

	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		System.out.println(i+200);
		float f = Float.parseFloat("100.5");
		System.out.println(f+200);
		double d = Double.parseDouble("100.5");
		System.out.println(d+200);
		long l = Long.parseLong("100");
		System.out.println(l+200);
		
		//FF 문자열을 16진수로 인식하여 10진수로 출력하기
		i = Integer.parseInt("FF", 16);
		System.out.println(i);
		//11 문자열을 8진수로 인식하여 10진수로 출력하기
		i = Integer.parseInt("11", 8);
		System.out.println(i);
	}
}
