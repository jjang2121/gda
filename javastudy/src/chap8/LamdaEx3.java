package chap8;

/*
매개변수, 리턴값이 모두 있는 경우
(x, y) -> {....}
문장에 return 문장만 있는 경우 {}, return 생략가능
*/

@FunctionalInterface // 어노테이션 검증
interface LamdaInterface3 { // 람다식에서 사용하기 위해서는 FunctionInterface 여야함.
	int method(int x, int y);
}

public class LamdaEx3 {

	public static void main(String[] args) {
		LamdaInterface3 fi = (x, y) -> {
			return x * y;
		};
		System.out.println("두 수의 곱 : " + fi.method(2, 3));

		fi = (x, y) -> x * y;
		System.out.println("두 수의 곱 : " + fi.method(2, 5));

		fi = (x, y) -> x + y;
		System.out.println("두 수의 합 : " + fi.method(2, 5));

		fi = (x, y) -> {
			if(x > y)			return x;
			else if((x < y))	return y;
			else				return 0;
		};
		System.out.println("두 수 중 큰값 : " + ((fi.method(2, 5)==0)?"같다":fi.method(2, 5)));

		fi = (x, y) -> {
			if(x < y)			return x;
			else if((x > y))	return y;
			else				return 0;
		};
		System.out.println("두 수 중 작은값 : " + ((fi.method(2, 5)==0)?"같다":fi.method(2, 5)));
	}

}
