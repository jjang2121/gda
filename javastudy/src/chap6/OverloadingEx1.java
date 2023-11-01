package chap6;

/*
메서드 오버로딩 : 메서드의 다양성
	1. 동일한 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 할 수 있다.
	2. 단 매개변수 목록이 달라야 한다.(자료형 기준 => 갯수, 형, 순서)
*/

class Math2 {
	int a = 100;

	int add(int b) {
		System.out.print("1:");
		return a + b;
	}

	/*
	매개변수숫자가 동일 시 같은 자료형 사용 불가.
	int add(int x) {
		System.out.print("1:");
		return a+x;
	}
	*/
	double add(double b) {
		System.out.print("2:");
		return a + b;
	}

	String add(String b) {
		System.out.print("3:");
		return a + b;
	}

	int add(int[] b) {
		System.out.print("4:");
		int rtn = 0;
		for (int i = 0; i < b.length; i++) {
			rtn += b[i];
		}
		return a + rtn;
	}
}

public class OverloadingEx1 {

	public static void main(String[] args) {
		try {
			int b1 = 10;
			double b2 = 10.5;
			String b3 = "번";
			long b4 = 10L;
			float b5 = 10F;
			int[] b6 = { 20, 30 };

			Math2 m = new Math2();
			System.out.println(m.add(b1));
			System.out.println(m.add(b2));
			System.out.println(m.add(b3));
			System.out.println(m.add(b4));
			System.out.println(m.add(b5));
			System.out.println(m.add(b6));
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
