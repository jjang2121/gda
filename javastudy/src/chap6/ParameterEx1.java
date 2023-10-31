package chap6;

/*
매개변수 예제
	기본형 매개변수
	참조형 매개변수
*/

class Value{
	int val;
}

public class ParameterEx1 {

	public static void main(String[] args) {
	
			Value v = new Value();
			v.val = 100;
			change1(v.val);
			System.out.println("change1 함수 호출 후 : "+ v.val);
			change2(v);
			System.out.println("change2 함수 호출 후 : "+ v.val);
	}

	private static void change1(int val) {
		val += 100;
		System.out.println("change1함수 : "+ val);
	}

	private static void change2(Value v) {
		v.val += 100;
		System.out.println("change2함수 : "+ v.val);
	}

}
