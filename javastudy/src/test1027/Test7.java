package test1027;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    java Test7 10
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/
public class Test7 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			
			System.out.print(num+"의 약수 : ");
			for(int i=1;i<=num;i++) {
				if(num%i == 0) {
					System.out.print(((i==1)?"":",") +  i);
				}
			}
			System.out.println();
			
		}catch(Exception ex) {
			System.out.println("오류가 발생하였습니다.\n올바른 숫자를 입력하세요.");
		}
		
	}
}
