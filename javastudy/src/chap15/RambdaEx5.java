package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Predicate 인터페이스
	매개변수 존재. 리턴은 boolean
	boolean test(T)

*/
public class RambdaEx5 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동","경영",90,80), new Student("김삿갓","컴공",95,70),
			new Student("이몽룡","경영",85,75), new Student("임꺽정","전자",65,70),
			new Student("성춘향","컴공",65,45)
			);
	
	
	public static void main(String[] args) {
		System.out.println("영어점수 60이상인 학생의 영어평균:" + avgEng(t->t.getEng()>60));
		System.out.println("영어점수 80이상인 학생의 영어평균:" + avgEng(t->t.getEng()>80));
		System.out.println("컴공과 학생의 영어평균:" + avgEng(t->t.getMajor().equals("컴공")));
		System.out.println("컴공과 아닌 학생의 영어평균:" + avgEng(t->!t.getMajor().equals("컴공")));
		System.out.println("컴공과 학생의 이름:" + nameList(t->t.getMajor().equals("컴공")));
		System.out.println("컴공과 아닌 학생의 이름:" + nameList(t->!t.getMajor().equals("컴공")));
	}


	private static String nameList(Predicate<Student> p) {
		String result = "";
		for(Student s : list) {
			if(p.test(s)) {
				result += s.getName() + ",";
			}
		}
		return result;
	}
	
	private static double avgEng(Predicate<Student> p) {
		int sum = 0, cnt=0;
		for(Student s : list) {
			// t->t.getEng()>60
			if(p.test(s)) {
				sum += s.getEng();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	
}
