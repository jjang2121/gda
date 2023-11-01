package chap6;

/*
오버로딩 메서드의 선택 기준
	1. 호출 시 입력된 인자값의 자료형과 메서드의 선언된 매개변수의 자료형 동일한 경우
	2. 1번의 조건이 없는 경우
		최소 갯수로 자동형변환이 가능한 메서드를 선택
		=> 동일한 조건의 메서드가 여러개인 경우 오류발생
*/

class Math3 {
	int add(int a, int b) {
		System.out.print("1:");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("2:");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("3:");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("4:");
		return a + b;
	}
	
}

public class OverloadingEx2 {

	public static void main(String[] args) {
		try {
			Math3 m = new Math3();
			System.out.println(m.add(11, 21));
			System.out.println(m.add(12L, 22));
			System.out.println(m.add(13, 23L));
			System.out.println(m.add(14L, 24L));
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
