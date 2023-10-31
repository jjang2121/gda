package chap6;

/*
추상화 : 클래스 생성 단계
	클래스 : 사용자 정의 자료형, 객체 생성 도구, 객체지향언어에서 가장 중요한 개념.
		속성 : 멤버변수
		기능 : 멤버메서드
	객체화 : 클래스 정보를 이용하여 메모리 할당과정. new 클래스명(), 참조변수로 참조하여 사용
하나의 참조변수는 하나의 객체만 참조 가능함
하나의 객체는 여러개의 참조변수로 참조 가능함.
=> 참조변수가 참조하지 않는 객체는 사라진다.
*/

class Student {
	String studno;	//멤버변수
	String name;	//멤버변수
	String major;	//멤버변수
	
	void study() {	//멤버메서드
		System.out.println("열심히 공부합시다.");
	}
}

public class StudentEx1 {

	public static void main(String[] args) {
		Student s1 = new Student();	//객체화 한다(메모리 할당)
		/*
		new 예약어의 기능
		1. 힙영역에 메모리 할당 > 객체생성
		2. 멈버변수를 기본값으로 초기화
		3. 생성자 호출
		대입연산자를 통해서 객체의 참조값을 참조변수에 저장
		*/
		s1.studno = "A230101";
		s1.name = "홍길동";
		s1.major = "컴퓨터공학";

		Student s2 = new Student();
		s2.studno = "B230201";
		s2.name = "김삿갓";
		s2.major = "경영학";
		
		
		System.out.println(s1.toString()+"/\n"+s2.toString());
		System.out.println();
		
		System.out.printf("학번:%s, 이름:%s, 전공:%s\n", s1.studno, s1.name, s1.major);
		System.out.printf("학번:%s, 이름:%s, 전공:%s\n", s2.studno, s2.name, s2.major);
		
		System.out.println();
		
		s1.study();
		s2.study();

		System.out.println();
		System.out.println("참조변수 변경 s1 <= s2");
		s1 = s2;

		System.out.println(s1.toString()+"/\n"+s2.toString());
		System.out.println();
		
		System.out.printf("학번:%s, 이름:%s, 전공:%s\n", s1.studno, s1.name, s1.major);
		System.out.printf("학번:%s, 이름:%s, 전공:%s\n", s2.studno, s2.name, s2.major);
		
		System.out.println();
		
	}
}
