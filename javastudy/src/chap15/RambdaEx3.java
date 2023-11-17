package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
Function 인터페이스 : 매개변수, 리턴값 존재
	R applyXXXX(..)
	
Function<T, R>	 : T:매개변수형, R:리턴형
BiFunction<T, U, R>	: T,U:매개변수형, R:리턴형
ToIntFunction<T>	: T:매개변수형, int:리턴형
DoubleToIntFunction<T>	: double:매개변수형, int:리턴형
...
*/
class Student {
	private String name, major;
	private int eng, math;

	public Student(String name, String major, int eng, int math) {
		super();
		this.name = name;
		this.major = major;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + major + ", " + eng + ", " + math +")";
	}

}

public class RambdaEx3 {
	static List<Student> list = Arrays.asList(new Student("홍길동", "경영", 90, 80), new Student("김삿갓", "경영", 95, 70),
			new Student("이몽룡", "컴공", 85, 75), new Student("성춘향", "컴공", 88, 99));

	public static void main(String[] args) {
		System.out.println("학생의 이름===");
		for (Student s : list)
			System.out.println(s.getName() + ",");
		System.out.println();
		System.out.println("학생의 이름===");
		// printString(t->t.getName()); // t: Student, t.getName():String
		printString(Student::getName); // t: Student, t.getName():String
		System.out.println("전공 이름===");
		printString(t -> t.getMajor());
		System.out.println("수학점수===");
		printString(t -> t.getMath() + "");
		System.out.println("영어점수===");
		printString(t -> t.getEng() + "");
		System.out.println("학생이름(영어점수)===");
		printString(t -> t.getName() + "(" + t.getEng() + ")");
		// 학생들의 영어점수 합계
		System.out.println("영어점수 합계===");
		printTot(t -> t.getEng());
		System.out.println("학생이름(수학점수)===");
		printString(t -> t.getName() + "(" + t.getMath() + ")");
		System.out.println("수학점수 합계===");
		printTot(t -> t.getMath());
		System.out.println("전체점수 합계===");
		printTot(t -> t.getMath() + t.getEng());

	}

	public static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for (Student s : list)
			sum += f.applyAsInt(s);
		System.out.println(sum);
		System.out.println();
	}

	// Function<Student, String> : String apply(Student)
	public static void printString(Function<Student, String> f) {
		// f : t-> t.getName() : f.apply(s)
		for (Student s : list)
			System.out.print(f.apply(s) + ",");
		System.out.println();
	}
}
