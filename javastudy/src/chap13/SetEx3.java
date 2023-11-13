package chap13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet 예제 : 정렬, 중복불가
Set의 하위인터페이스 SortedSet 인터페이스의 구현 클래스
*/

public class SetEx3 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		// Set<String> set = new TreeSet<>();
		// SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dzzzz"); set.add("dZZZZ");
		set.add("elev"); set.add("fan"); set.add("flower");
		System.out.println(set);
		System.out.println("from:" + from + ", to:"+to);
		System.out.println(set.subSet(from, to));
		System.out.println("from:" + from + ", to:"+to+"zzzz");
		System.out.println(set.subSet(from, to+"zzzz"));
		System.out.println();

		System.out.println("역순정렬 Desc");
		TreeSet<String> set2 = new TreeSet<>(Comparator.reverseOrder());
		set2.add("abc"); set2.add("alien");
		set2.add("bat"); set2.add("azz");
		set2.add("car"); set2.add("Car");
		set2.add("disc"); set2.add("dance");
		set2.add("dzzzz"); set2.add("dZZZZ");
		set2.add("elev"); set2.add("fan"); set2.add("flower");
		System.out.println(set2);
		System.out.println();

		// TreeSet<String> set3 = new TreeSet<>(set.descendingSet());
		TreeSet<String> set3 = new TreeSet<>(set.descendingSet());
		// TreeSet<String> set3 = (TreeSet)set.descendingSet();
		System.out.println("set.descendingSet()" + set.descendingSet());
		System.out.println(set3);
		
		
		//set 객체를 대소문자구분없이 정렬하여 출력하기
		Set<String> set4 = new TreeSet<>((s1,s2)->s1.compareToIgnoreCase(s2));
		set4.add("A"); set4.add("a");	// A==a 같은 객체로 인식함.
		System.out.println(set4);
		System.out.println("a".compareToIgnoreCase("A"));
	}
}
