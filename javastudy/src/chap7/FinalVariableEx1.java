package chap7;

/*
final 변수 :	변경불가 변수 => 상수. goto, const 예약어 사용안함
			상수명명권장 : 대문자로 표시
*/

class FinalValue {
	final int NUM;
	public FinalValue (int num) {
		this.NUM = num;	// 명시적 초기화가 안된 경우, 생성자에서 한번은 초기화 가능
	}
}

public class FinalVariableEx1 {

	public static void main(String[] args) {
		final int NUM = 100;
		// NUM = 200;	// 상수이기에 변경불가
		System.out.println(NUM);
		
		final int MAX;	// 초기화 하지 않은 경우 한번 변경 가능.
		MAX = 100;		// 정상
		// MAX = 100;	// 오류
		System.out.println(MAX);	// 초기화 필수

		FinalValue f1 = new FinalValue(10);
		System.out.println(f1.NUM);
		// f1.NUM = 200; // 상수값은 변경불가
		FinalValue f2 = new FinalValue(20);
		System.out.println(f2.NUM);
		
		System.out.println("final 배열");
		//final 배열
		final int[] arr = {10,20,30,40,50};
		final int[] arr1 = {100,200,30,40,50};
		arr[0] = 100;
		arr[1] = 200;
		// arr = arr1;	//arr에 새로운 배열 객체로 변경 불가
		// arr = new int[] {100,200,300};
		for(int a : arr) System.out.print(a+" ");
		System.out.println();
	}

}
