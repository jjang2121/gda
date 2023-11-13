package test1113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
  
  [결과]
3등 복권 추첨합니다.
945
123
6
2등 복권 추첨합니다.
611
404
1등 복권 추첨합니다.
797
*** 복권 추첨 결과 ***
1등:797,
2등:404,611,
3등:6,123,945,
 */
public class Test1 {
	public static void main(String[] args) {
		Set<Integer> lotto = new LinkedHashSet<>();
		while(lotto.size()<6) {
			Random rdn = new Random();
			lotto.add(rdn.nextInt(1000)+1);
		}
		// top3 저장
		List<Integer> top3 = new ArrayList<Integer>(new ArrayList<Integer>(lotto).subList(0, 3));
		System.out.println("3등 복권 추첨합니다.");
		for(int i3 : top3)	System.out.println(i3);
		// top2 저장
		List<Integer> top2 = new ArrayList<Integer>(new ArrayList<Integer>(lotto).subList(3, 5));
		System.out.println("2등 복권 추첨합니다.");
		for(int i2 : top2)	System.out.println(i2);
		// top1 저장
		List<Integer> top1 = new ArrayList<Integer>(new ArrayList<Integer>(lotto).subList(5, 6));
		System.out.println("1등 복권 추첨합니다.");
		for(int i1 : top1)	System.out.println(i1);
		
		System.out.println("*** 복권 추첨 결과 ***");
		System.out.println("1등 : " + replaceStr(top1));
		// top2.sort(Comparator.naturalOrder());
		Collections.sort(top2);
		System.out.println("2등 : " + replaceStr(top2));
		// top3.sort(Comparator.naturalOrder());
		Collections.sort(top3);
		System.out.println("3등 : " + replaceStr(top3));
	}
	
	private static String replaceStr(List<Integer> str) {
		return str.toString().replace("[", "").replace("]", "");
	}
}
