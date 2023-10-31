package chap4;

public class LoopEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	break; continue;	*/
		for(int i=2; i<=9; i++) {
			System.out.println("\n"+i+"단");
			for(int j=2; j<=9; j++) {
//				if(j==5) break;	// 반복문 탈출
				if(j==5) continue;	//하위 문장 실행 건너뛰고 다음 실행
				System.out.println(i+"X"+j+"="+ i*j);
			}
		}
		


	}
}
