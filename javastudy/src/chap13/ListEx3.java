package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
List 객체 정렬하기
	: 요소의 자료형이 Comparable 인터페이스의 구현 클래스여야 함.

Comparable 인터페이스 : Functional 인터페이스, compareTo() 추상메서드를 가짐 => 객체의 기본 정렬방식을 구현

정렬관련 인터페이스
1. Comparable	:	해당 요소에 기본 정렬방식을 설정
					int compareTo(Object o) 추상메서드.
					양수리턴 : 현재 객체가 뒤쪽순서로 간다.
					음수리턴 : 현재 객체가 앞쪽순서로 본다.
2. Comparator	:	기본 정렬방식과 무관하게 다른 정렬 방식을 설정
					동적 정렬방식 설정
					Collections.sort(List, Comparator)
					int compare(Object o1, Object o2)
					양수리턴 : o2 객체를 앞쪽.
					음수리턴 : o1 객체를 앞쪽.
					Comparator.reverseOrder()	:	기본정렬방식 역순으로 정렬.
													Comparator 인터페이스의 static 메서드
*/
class Data implements Comparable<Data> {
	int value;

	Data(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + "";
	}

	@Override
	public int compareTo(Data d) {	// 기본정렬방식
		// return d.value - value;	// 정렬역순(내림차순)
		return value - d.value;
	}
}

class Data2 {
	int value;
	public Data2(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + "";
	}
	
}

public class ListEx3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.sort(Comparator.naturalOrder());
		System.out.println(list);

		System.out.println("===== list2(class 내 compareTo 오버라이딩) =====");
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(3));
		list2.add(new Data(2));
		list2.add(new Data(1));
		System.out.println(list2);
		System.out.println();
		Collections.sort(list2);
		//list2.sort(Comparator.naturalOrder());
		System.out.println(list2);
		// Comparator.reverseOrder() : 정렬방식을 반대로 처리
		Collections.sort(list2, Comparator.reverseOrder());
		// list2.sort(Comparator.reverseOrder());
		System.out.println(list2);

		System.out.println("===== list3(인터페이스 내 익명개체 사용) =====");
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(2));
		list3.add(new Data2(3));
		list3.add(new Data2(1));
		System.out.println(list3);
		System.out.println();
		Comparator<Data2> c = new Comparator<Data2>() {
			@Override
			public int compare(Data2 obj1, Data2 obj2) {
				return obj1.value - obj2.value;
			}
		};
		// Collections.sort(list3, c);
		list3.sort(c);
		System.out.println(list3);
		// 역순 정렬하기(익명사용)
		Collections.sort(list3, new Comparator<Data2>() {
			@Override
			public int compare(Data2 obj1, Data2 obj2) {
				return obj2.value - obj1.value;
			}
		});
		System.out.println(list3);
		// 람다로 오름차순 정렬
		Collections.sort(list3, (d1, d2)-> d1.value-d2.value);
		System.out.println(list3);
		
		
	}
}
