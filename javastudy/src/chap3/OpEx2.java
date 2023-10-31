package chap3;

/*
 * 단항연산자
 * - 부호연산자
 * -- +
 * -- -
 * 
 * - 논리부정연산자
 * -- !
 */
public class OpEx2 {

	public static void main(String[] args) {
		System.out.println(!false);
		System.out.println(!true);
		System.out.println(5 != 4); // 비교연산자 !=
		System.out.println(5 == 4); // 비교연산자 ==
		
		int x = -10;
		System.out.println(+x);
		System.out.println(-x);
		
		x = 10;
		System.out.println(+x);
		System.out.println(-x);
	}

}
