package test1025;
/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고,
  한개의 숫자를 입력받아 가위바위보 게임하기
  
  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!

  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
*/

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStr();
	}
	
	public static void inputStr() {
		try {
			System.out.println("가위:1, 바위:2, 보:3 입력");
			Scanner scan = new Scanner(System.in);
			int mycrp = scan.nextInt();
			
			getResult(mycrp);
		}catch(Exception ex) {
			System.out.println("다시 입력하세요.");
			inputStr();
		}
	}
	
	public static void getResult(int mycrp) {
		int comcrp = (int)(Math.random()*3) + 1;
		String winMsg = "";
		
		if(comcrp==1 && mycrp==2)		winMsg = "내가 승리";
		else if(comcrp==1 && mycrp==3)	winMsg = "컴퓨터 승리";
		else if(comcrp==2 && mycrp==1)	winMsg = "컴퓨터 승리";
		else if(comcrp==2 && mycrp==3)	winMsg = "내가 승리";
		else if(comcrp==3 && mycrp==1)	winMsg = "내가 승리";
		else if(comcrp==3 && mycrp==2)	winMsg = "컴퓨터 승리";
		else if(comcrp==mycrp)			winMsg = "비김";
		else							winMsg = "";
		
		if(winMsg == "")	System.out.println("오류입니다. 다시 입력하세요.");
		else				System.out.println(winMsg);
		inputStr();
	}

}
