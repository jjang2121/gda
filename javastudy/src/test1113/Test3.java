package test1113;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
1.궁합음식의 키를 입력받아 해당되는 음식을 출력하기.
  종료가 입력될때 까지 계속 출력하기
  등록안된 경우 오류 발생. => 등록여부 판단필요
2.종료 입력시 등록된 내용 출력하기
  등록된음식 :
    떡볶이 : 오뎅
    짜장면 : 단무지
3. 등록이 안된경우
   등록여부를 입력받아, 등록하는 경우 궁합음식을 입력받기
   등록하시겠습니까(y)?
     y입력 : foods객체에 추가.
            궁합음식 입력받아서 foods에 추가함
     y가아닌경우 :
            음식을 다시 입력하기

[결과]
음식명을 입력하세요(종료:종료)
떡볶기
떡볶기의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?
n
음식명을 입력하세요(종료:종료)
떡볶이
떡볶이의 궁합음식:오뎅
음식명을 입력하세요(종료:종료)
치킨
치킨의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?
y
치킨의 궁합음식을 등록하세요
맥주
음식명을 입력하세요(종료:종료)
종료
{치킨=맥주, 떡볶이=오뎅, 라면=김치}
*/
public class Test3 {
	public static void main(String[] args) {
		Map<String, String> fm = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		String strFood1="", strFood2="";
		while(true) {
			try {
				System.out.println("음식명을 입력하세요(종료:종료)");
				strFood1 = scan.next();
				// 종료확인
				if(strFood1.equals("종료"))	break;
				
				if(fm.get(strFood1) != null) {	// 궁합음식 존재 시
					System.out.println(strFood1 + "의 궁합음식:" + fm.get(strFood1));
				}else {							// 궁합음식 미존재 입력여부 판별
					while(true) {
						System.out.println(strFood1 + "의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?(y,n)");
						strFood2 = scan.next();
						if(strFood2.equalsIgnoreCase("y")) {
							System.out.println(strFood1 + "의 궁합음식을 등록하세요.");
							strFood2 = scan.next();
							fm.put(strFood1, strFood2);
							break;
						}else if(strFood2.equalsIgnoreCase("n")) {
							break;
						}else {
							System.out.println("올바르지 않은 답변입니다.");
						}
					}
				}
			}catch(Exception ex) {
				scan.next();
			}
			
		}
		
		System.out.println("프로그램 종료");
		// 음식궁합 출력
		System.out.println("음식궁합 출력");
		Set<String> s = fm.keySet();
		for(String s1 : s)	System.out.println(s1+"="+fm.get(s1));
	}
}
