package test1030;

import java.util.Scanner;

/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후
 * 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답
 * 
 *  알고리즘
 *  1. 시스템이 중복 되지 않도록 서로다른 4자리 수 저장(0 ~ 9)
 *  2. 화면으로 부터 4자리 정수를 입력
 *  3. 시스템의 수와 입력된 수를 비교하여
 *     스트라익, 볼을 결정, 화면 출력
 *  4. 4스트라익이 될때 까지 2,3 을 계속 실행
 *  5. 정답인 된경우 몇번만에 정답을 맞췄는지
 *     입력 갯수를 화면에 출력하기
 */

public class Test4 {
	public static void main(String[] args) {
		try {
			int[] balls = new int[9];
			int[] selBalls = new int[4];
			int cnt = 0;	//시도횟수
			
			// 정답볼 처리 시작
			for(int i=0;i<9;i++) {
				balls[i] = i+1;
			}

			//swap
			for(int i=0;i<10;i++) {
				int temp;
				int a = (int)(Math.random()*9);
				int b = (int)(Math.random()*9);

				temp = balls[a];
				balls[a] = balls[b];
				balls[b] = temp;
			}
			
			for(int i=0;i<4;i++)	selBalls[i] = balls[i];
			for(int i=0;i<4;i++)	System.out.print(selBalls[i]+" ");
			// 정답볼 처리 종료
			System.out.println();
			
			int[] checkCnt = new int[3];	// [0]:스트라이크, [1]:볼, [2], 아웃
			int[] num = new int[4];
			
			Scanner scan = new Scanner(System.in);
			String numStr = "";
			
			while(true) {
				cnt++;
				
				//스트라이크, 볼처리 초기화
				for(int i=0;i<checkCnt.length;i++)	checkCnt[i] = 0;
				
				// 입력부분
				System.out.println("숫자 4개를 입력하세요.");
				numStr = scan.next();
				for(int i=0;i<4;i++) {
					num[i] = (int)(numStr.charAt(i)-'0');
				}
				
				// for(int a : num ) System.out.println(a);
				
				for(int i=0;i<4;i++) {
					for(int j=0;j<4;j++) {
						if(i == j && num[i] == selBalls[j]) {
							checkCnt[0] += 1;	//스트라이크
							break;
						}
						else if(i != j && num[i] == selBalls[j]) {
							checkCnt[1] += 1;	//볼
							break;
						}
						else if(j==3 &&  num[i] != selBalls[j]) {
							checkCnt[2] += 1;	//아웃
						}
					}
				}
				
				
				if(checkCnt[0] == 4) {
					System.out.printf("정답입니다. 시도횟수 : %2d", cnt);
					break;
				}else {
					if (checkCnt[0] > 0)	System.out.printf("%d 스트라이크\n", checkCnt[0]);
					if (checkCnt[1] > 0)	System.out.printf("%d 볼\n", checkCnt[1]);
					if (checkCnt[2] > 0)	System.out.printf("%d 아웃\n", checkCnt[2]);
					System.out.println();
				}
			}
		}catch(Exception ex) {
			System.out.println("올바른 숫자 4개를 입력하세요.");
		}
	}
	

	
}