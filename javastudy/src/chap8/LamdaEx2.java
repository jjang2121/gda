package chap8;

/*
람다식 예제 :	jdk8 이후부터 사용가능 함
			람다식으로 사용할 수 있는 인터페이스는 FunctionInterface 여야 함

FunctionInterface : 추상메서드가 한개만 존재하는 인터페이스

추상메서드의 매개변수가 없고, 리턴타입도 없는 경우
() -> {.....}
람다식 내부에 실행되는 문장이 한개인 경우 {} 생략가능
*/

@FunctionalInterface //어노테이션 검증
interface LamdaInterface2 {		// 람다식에서 사용하기 위해서는 FunctionInterface 여야함.
	void method(int num);
}

public class LamdaEx2 {

	public static void main(String[] args) {
		//익명객체 방식
		/*LamdaInterface2 fi = new LamdaInterface2() {
			@Override
			public void method(int num) {
				System.out.println("입력숫자는 "+ num);
			}
		};*/
		LamdaInterface2 fi = (num) -> {
			System.out.println("입력숫자 * 2는 "+ num*2);
		};
		fi.method(1);

		//람다방식 코딩1
		fi = num -> {
			System.out.println("1.람다 방식으로 코딩, 숫자 * 2는 "+ num*2);
		};
		fi.method(2);

		//제곱을 출력하는 람다식 구현하기
		fi = (num) -> System.out.println(num + "의 제곱 : "+ (int)Math.pow(num, 2));
		fi.method(10);
		fi.method(2);
		
		//매개변수까지의 합 출력하는 람다식 구현하기
		fi = (num) -> {
			int sum = 0;
			for(int i=1;i<=num;i++) sum += i;
			System.out.println("1~"+num+"까지의 합계는 "+ sum);
		};
		fi.method(10);
		fi.method(2);
		
		// 함수형태로도 가능
		calc(fi, 10);
		// calc(fi, 10);	//짝수만의 합
		calc(num -> {
			int sum = 0;
			for(int i=0;i<=num;i+=2) sum+=i;
			System.out.println("1~"+num+"까지의 짝수 합계는 "+ sum);
		}, 10);
	}
	
	public static void calc(LamdaInterface2 fi, int num) {
		fi.method(num);
	}

}
