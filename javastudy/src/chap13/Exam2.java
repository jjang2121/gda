package chap13;

import java.util.HashSet;
import java.util.Set;

/*
Student 클래스
	1. 멤버변수 : 학번(studno), 이름(name), 전공(major)
	2. 멤버메서드 : 학생정보를 출력하도록 toString 메서드 오버라이딩
	3. 학번과 이름이 같은 경우 같은 학생으로 인식되도록 하기
	4. 생성자는 멤버변수를 받아 객체생성 하기
*/

class Student {
	String studno, name, major;
	public Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	public Student(String studno, String name) {
		this(studno, name, "경영");
	}
	
	@Override
	public String toString() {
		return "학번:" + studno + ", 이름:" + name + ", 전공:" + major;
	}
	
	@Override
	public int hashCode() {
		return studno.hashCode() + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return s.studno.equals(studno) && s.name.equals(name);
		}else	return false;
	}
	
}

public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("1234", "홍길동","경영"));
		set.add(new Student("2345", "홍길순","경영"));
		set.add(new Student("2345", "홍길순","컴공"));
		set.add(new Student("1234", "홍길동","통계"));
		set.add(new Student("4567", "홍길동","경영"));
		
		System.out.println("등록학생수:"+set.size());
		System.out.println("등록학생===");
		for(Student s : set)	System.out.println(s);
	}
}
