package test1110;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
화면에서 여러개의 자연수를 입력받아(0을 입력시 입력종료) 이들 중
홀수 인 자연수들만 이루어진 List 객체에 저장
List  객체의 요소의 합을 구하고,
홀수 중 최대값, 최소값, 중간값 을 찾는 프로그램을 작성하기
단 자연수가 아닌 경우가 입력되면 무시한다.
홀수 들로만 이루어진 List 객체를 생성하여 출력하기

최대값과 최소값 :
Collections.max(list)와 Collections.min(list) 함수를 이용한다
중간값 :
 요소의 갯수가 홀수인 경우 : 가운데 값
 요소의 갯수가 짝수인 경우 : 가운데 값 2개의 평균
 
 [결과]
자연수를 입력하세요 종료(0)
12 77 38 41 53 92 85 aaa 0
[77, 41, 53, 85]의 합:256
홀수의 최대값:85
홀수의 최소값:41
홀수의 최대값 위치:3
홀수의 최소값 위치:1
입력된 홀수 목록:[77, 41, 53, 85]
중간값 :65.0
*/

public class Test2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수를 입력하세요 종료(0)");
		int 	num		= 0;		// 입력정수 값
		
		// 숫자입력
		while(true) {
			try {
				num = scan.nextInt();
				if(num == 0) 		break;			// 0 입력 시 종료
				if(num % 2 == 1)	list.add(num);	// 홀수인 자연수만 등록
			}catch(Exception ex) {
				// System.out.println("올바른 자연수를 입력하세요.");
				scan.next();
			}
		}
		
		//합
		int sum = 0;
		for(int n : list)	sum += n;
		System.out.println();
		System.out.println("홀수입력데이터 : "+ list);
		System.out.println("홀수의 총합 : "+ sum + ", 최대 : "+ Collections.max(list)+ ", 최소 : "+ Collections.min(list));
		System.out.println("홀수의 최대값 위치 : "+ list.indexOf(Collections.max(list)));
		System.out.println("홀수의 최소값 위치 : "+ list.indexOf(Collections.min(list)));
		
		
		// 정렬처리
		list.sort(Comparator.naturalOrder());
		System.out.println("정렬데이터 : "+ list);
		
		// 평균
		int lSize = list.size();
		if(lSize%2 == 0) {		// 짝수
			int sPosNum = list.get((lSize/2)-1);
			int ePosNum = list.get(lSize/2);
			double avgNum = (double)(sPosNum+ePosNum)/2;
			
			System.out.println("짝수개 중간값 : " + avgNum);
		} else {				// 홀수
			System.out.println("홀수개 중간값 : " + list.get(lSize/2));
		}
		
		
	}
}
