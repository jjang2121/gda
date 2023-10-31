package test1025;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아 다음 삼각형을 출력하기
 [결과]
 삼각형의 높이 : 3
    * 
   ***
  *****
 
 */
public class Test7 {
	public static void main(String[] args) {
		getHeight();
	}
	
	public static void getHeight() {
		try {
			System.out.println("높이를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int HeightStr = scan.nextInt();
			
			procHeight(HeightStr);
		}catch(Exception ex) {
			System.out.println("올바른 높이를 입력하세요.");
			getHeight();
		}
	}
	
	public static void procHeight(int HeightStr) {
		// int maxColumn = HeightStr*2 - 1;
		int blankSpace = HeightStr-1;
		
		for(int i=1;i<=HeightStr;i++) {
			//앞공백
			for(int j=1;j<=blankSpace;j++) {
				System.out.print(" ");
			}
			//별
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("*");
			}
			
			/*
			// 뒷 공백 필요 시 주석해제
			for(int j=1;j<=blankSpace;j++) {
				System.out.print(" ");
			}
			*/
			blankSpace -= 1;
			System.out.println();
		}
		
	}
}
