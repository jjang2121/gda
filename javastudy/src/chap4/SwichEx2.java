package chap4;

public class SwichEx2 {

	/*	컴퓨터에서 난수를 선택하여 상품 출력하기	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*10) + 1;
		System.out.println(num);
		
		switch(num){
			case 1		: System.out.println("축하합니다. 자전거 당첨입니다."); break;
			case 2		: System.out.println("축하합니다. USB 당첨입니다."); break;
			case 3		: System.out.println("축하합니다. 키보드 당첨입니다."); break;
			default 	: System.out.println("다음기회에...");
		}
		
	}

}
