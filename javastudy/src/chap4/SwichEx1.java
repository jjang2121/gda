package chap4;

public class SwichEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 59;
		
		switch(score/10){
			case 9, 10	: System.out.println("A학점"); break;
			case 8		: System.out.println("B학점"); break;
			case 7		: System.out.println("C학점"); break;
			case 6		: System.out.println("D학점"); break;
			default 	: System.out.println("F학점");
		}
		
		// 60점 이상이면 pass, 미만이면 fail 출력
		switch(score/10){
			case 6, 7, 8, 9, 10	: System.out.println("pass"); break;
			default 			: System.out.println("fail");
		}
		
		
	}

}
