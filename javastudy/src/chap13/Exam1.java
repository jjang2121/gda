package chap13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
화면에서 홀수개의 숫자를 입력받아 입력받은 숫자의 평균과 중간값 출력하기
[결과]

10 40 90 60 30 999
평균 : 전체합/갯수
중간값 :  30 => 데이터를 정렬하여 가운데 값
짝수개 입력 시 숫자제거
*/
public class Exam1 {
	public static void main(String[] args) {
		inputStr();
	}

	private static void inputStr() {
		int num = 0;
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 숫자를 입력하세요.(종료 : 999)");

		try {
			while(true) {
				num = scan.nextInt();
				if(num == 999)	break;
				list.add(num);
			}
			
			// 짹수개이면 마지막 정보 삭제
			if(list.size()%2 == 0)	list.remove(list.size()-1);
			
			// 합계 정산
			int sum = 0;
			for(int i=0;i<list.size();i++)	sum += list.get(i);

			System.out.println("입력데이터 : " + list);
			list.sort(Comparator.naturalOrder());
			
			// 중간값 인덱스 확인
			int centerIndex = list.size()/2;
			
			System.out.println("정렬데이터 : " + list);
			System.out.println("합계 : "+ sum + ", 평균 : "+ (double)sum/list.size() +", 중간값 : "+ list.get(centerIndex));
			
		}catch(Exception ex) {
			System.out.println("오류발생 : "+ ex.getMessage() + "\n다시 입력하세요.");
			inputStr();
			scan.next();
		}
	}
	
	

}
