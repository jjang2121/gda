package chap13;

import java.util.TreeSet;

/*
사용자가 정의한 클래스의 객체를 TreeSet에 저장하기
1. Comparable<T> 인터페이스 구현 => 클래스에 구현, 기본정렬 방식 설정 사용
   int compareTo(T o);
2. Comparator<T> 인터페이스 구현 => 기본정렬 외에 다른 방식 사용. 실행 시 정렬방식 설정
   int compare(T o1, T o2)
*/

// 이름순 정렬이 되도록 정렬방식 설정하기
class PhoneNo implements Comparable<PhoneNo> {
	String name;
	int number;

	public PhoneNo(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return name + ":" + number;
	}

	@Override
	public int compareTo(PhoneNo o) {
		return name.compareTo(o.name);
	}
}

public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<PhoneNo> set = new TreeSet<>(); // 기본정렬방식으로 정렬
		set.add(new PhoneNo("홍길동", 1234));
		set.add(new PhoneNo("김삿갓", 2345));
		set.add(new PhoneNo("이몽룡", 3456));
		System.out.println("이름순 기본정렬");
		System.out.println(set);
		System.out.println();
		System.out.println("전화번호순 역순으로 정렬"); // Comparator
		/*
		TreeSet<PhoneNo> set2 = new TreeSet<>(new Comparator<PhoneNo>() {
			@Override
			public int compare(PhoneNo o1, PhoneNo o2) {
				return o2.number - o1.number;
			}
		});
		*/
		// 람다식 이용
		TreeSet<PhoneNo> set2 = new TreeSet<>((n1, n2) -> n2.number - n1.number);

		set2.add(new PhoneNo("홍길동", 1234));
		set2.add(new PhoneNo("김삿갓", 2345));
		set2.add(new PhoneNo("이몽룡", 3456));
		System.out.println(set2);
		System.out.println();

	}
}
