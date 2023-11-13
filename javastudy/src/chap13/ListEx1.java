package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
Collection 인터페이스	:	여려개의 객체를 저장할 수 있는 객체
	- List 인터페이스 	:	Collection 인터페이스의 하위 인터페이스
						저장된 객체들의 순서 유지 => 인덱스 사용 가능
						가변배열이라고도 함.
						구현클래스 : ArrayList, Vector(jdk1버전, 구버전리스트), LinkedList (순서유지, 중복안됨)
	- Set 인터페이스	:	Collection 인터페이스의 하위 인터페이스
						중복된 객체를 저장하지 않음.
						순서는 유지하지 않음. => 인덱스 사용 불가
						구현클래스 : HashSet, TreeSet, LinkedHashSet(순서유지,중복안됨)

Map 인터페이스			:	(key, 객체)쌍인 객체들을 저장할 수 있는 객체
						구현클래스 : HashMap, TreeMap, HashTable(jdk1버전, 구버전리스트)
*/
public class ListEx1 {
	public static void main(String[] args) {
		// <Integer> : 제네릭, List 객체내부에 요소의 자료형 설정
		// List<Integer> list = new ArrayList<Integer>();
		// List<Object> list = new ArrayList<>();	// Object 객체들은 모두 저장 가능
		// List<Integer> list = new ArrayList<>();	//jdk8.0부터 제네릭 생략가능
		// List<Integer> list = new Vector<>();	//jdk8.0부터 제네릭 생략가능
		List<Integer> list = new LinkedList<>();	//jdk8.0부터 제네릭 생략가능
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
		list.add(1);
		// list.add("a");	// Object 객체에서 사용가능
		System.out.println("list : " + list);
		list.remove(2);	// 2번 인덱스 삭제
		System.out.println("list 2번 인덱스 삭제 후 : " + list);
		list.add(1, 9);		// 1번 인덱스 위치에 9 삽입
		System.out.println("list 1번 인덱스 입력 후 : " + list);
		list.set(1, 10);	// 1번 인덱스 위치에 9 변경
		System.out.println("list 1번 인덱스 입력 후 : " + list);
		// list.size() : list 객체 내부 요소의 갯수
		// list.get(i) : i번 인덱스의 요소를 리턴
		System.out.println("list 크기 : " + list.size());
		System.out.println("list 마지막 객체 : " + list.get(list.size()-1));
		System.out.println();
		/*
		정렬하기
		Collections	: 클래스. Collection 객체들의 보조기능 수행
		Collection	: 인터페이스
		*/
		System.out.println("===== Collections 정렬 =====");
		Collections.sort(list);
		System.out.println("list 정렬 : " + list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("list 내림차순 정렬 : " + list);

		System.out.println("===== list 정렬 =====");
		list.sort(Comparator.naturalOrder());
		System.out.println("list 정렬 : " + list);
		list.sort(Comparator.reverseOrder());
		System.out.println("list 내림차순 정렬 : " + list);

		Collections.shuffle(list);
		System.out.println("list 섞기(Collections.shuffle) : \n" + list);

		System.out.println();
		// sublist(시작인덱스, 종료인덱스+1)
		List<Integer> list2 = new ArrayList<>(list.subList(1, 4));	//얕은 복사
		List<Integer> list3 = list.subList(1, 4);					//깊은 복사
		System.out.println("list2 sublist : " + list2);
		System.out.println("list3 sublist : " + list3);
		
		list.set(1, 200);	// 1번 인덱스 위치에 9 변경
		System.out.println("1번 인덱스 200변경 후 ");
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println("list3 : " + list3);
		
		System.out.println();
		for(Integer l : list)
			System.out.print(l+",");
		System.out.println();
		for(int l : list)	// UnBoxing
			System.out.print(l+",");
	}
}
