package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
이름목록 : 홍길동, 김삿갓, 이몽룡, 김자바, 박자바
나이목록 : 10,13,15,25,20
총나이 합산 : 100
나이평균 : 20.0
*/
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	@Override
	public String toString() {
		return name +":"+ age;
	}
	
}

public class Exam1 {
	static List<Person> list = Arrays.asList(
			new Person("홍길동", 10), new Person("김삿갓", 30),
			new Person("이몽룡", 15), new Person("김자바", 25), new Person("박자바", 20)
			);
	public static void main(String[] args) {
		System.out.println("이름목록 ===");
		printString(t->t.getName());
		System.out.println("나이목록 ===");
		printInt(t->t.getAge());
		System.out.println("총나이 합산 ===");
		printTot(t->t.getAge());
		System.out.println("나이평균 ===");
		printAvg(t->t.getAge());
	}

	static void printTot (ToIntFunction<Person> f) {
		int sum = 0;
		for(Person p : list) sum += f.applyAsInt(p);
		System.out.println(sum);
	}
	static void printAvg (ToDoubleFunction<Person> f) {
		double sum = 0;
		for(Person p : list) sum += f.applyAsDouble(p);	//나이데이터를 double로 리턴
		System.out.println(sum/list.size());
	}
	static void printString (Function<Person, String> f) {
		for(Person p : list) System.out.println(f.apply(p));
	}
	static void printInt (ToIntFunction<Person> f) {
		for(Person p : list) System.out.println(f.applyAsInt(p));
	}
	
}
