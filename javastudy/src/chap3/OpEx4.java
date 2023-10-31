package chap3;

/*
 * 이항연산자 
 * - 비교(관계)연산자 => 결과는 boolean
 * - 논리연산자 => &&, ||
 */
public class OpEx4 {

	public static void main(String[] args) {
		int x = 1, y = 1;
		
		System.out.printf("%d == %d : %b\n", x, y, (x == y));
		System.out.printf("%d != %d : %b\n", x, y, (x != y));
		System.out.printf("%d > %d : %b\n", x, y, (x > y));
		System.out.printf("%d >= %d : %b\n", x, y, (x >= y));

		System.out.println(x == 1 && y == 2);
		System.out.println(x == 1 || y == 2);
		
		String str = null;
		if (str == null || str.equals(""))
			System.out.println("str 변수에 값이 없음");
		
		if (str == null | str.equals(""))
			System.out.println("str 변수에 값이 없음");

	}

}
