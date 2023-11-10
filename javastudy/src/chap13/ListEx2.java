package chap13;

import java.util.Vector;

/*
Vector 클래스
	- Collection 프레임워크 이전의 클래스
	- List 인터페이스의 구현클래스
	- 구버전의 메서드, List 메서드 공존
*/
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
		list.add(0.3);			//List 인터페이스의 메서드
		list.add(Math.PI);
		list.addElement(5.0);	//Vector 클래스의 메서드, add() 메서드와 같은 기능
		list.add(0.3);
		list.add(0.3);
		System.out.println(list);

		// 요소의 위치 찾기
		double num = 5.0;
		int index = list.indexOf(num);
		if(index < 0)	System.out.println(num + "은 list에 없는 요소입니다.");
		else			System.out.println(num + "의 위치 : "+ index);

		// contains() : 요소의 존재
		if(list.contains(num))	System.out.println(num + "은 list에 객체에 존재함.");
		else					System.out.println(num + "은 list 객체에 없음");

		
		System.out.println("첫번째 인덱스 위치의 값 : " + list.firstElement());	// 0.3
		// System.out.println(list.get(0));
		System.out.println("1번 인덱스 위치의 값 : " + list.elementAt(1));
		System.out.println("마지막 인덱스 위치의 값 : " + list.lastElement());

		System.out.println("===== 삭제 실행 후 =====");
		
//		list.remove(0.3);
//		System.out.println(list);			// Object 값에 대한 모두 삭제되지 않음.
//		list.remove(0.3);
//		System.out.println(list);			// Object 값에 대한 모두 삭제되지 않음.

		// while 통한 0.3 모두 삭제
		while(list.remove(0.3))
			System.out.println(list);
			
		
		System.out.println(list.get(0));	// Math.PI
		list.remove(0);
		System.out.println(list.get(0));	// 5.0
		
		// System.out.println(list.capacity());
		
		list.clear();	// 전체초기화
		//list.removeAll(list);
		System.out.println(list);
	}
}
