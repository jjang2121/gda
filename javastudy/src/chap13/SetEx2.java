package chap13;

import java.util.HashSet;
import java.util.Set;

/*
객체 중복 여부 판단
	1. equals	: true
	2. hashcode	: 동일
	1,2번 모두 만족 : 객체 동일 판단 => 오버라이딩 필요
*/

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public int hashCode() {
		return (name.hashCode() + age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return (p.name.equals(this.name) && p.age == age);
		}else {
			return false;
		}
	}

}

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		boolean flag;
		flag = set.add(new String("abc"));
		System.out.println("abc 입력flag : "+flag);
		flag = set.add(new String("abc"));
		System.out.println("abc 입력flag : "+flag);
		flag = set.add(new Person("홍길동", 10));
		System.out.println("Person 10 입력flag : "+flag);
		flag = set.add(new Person("홍길동", 20));
		System.out.println("Person 20 입력flag : "+flag);
		flag = set.add(new Person("홍길동", 10));
		System.out.println("Person 10 입력flag : "+flag);
		
		flag = set.add(1);
		System.out.println("1 입력flag : "+flag);
		flag = set.add(2);
		System.out.println("2 입력flag : "+flag);
		flag = set.add(1);
		System.out.println("1 입력flag : "+flag);
		
		flag = set.add(new StringBuffer("abcd"));				// equals, hashcode 오버라이딩 안되어 있음.
		System.out.println("StringBuffer 입력flag : "+flag);
		flag = set.add(new StringBuffer("abcd").toString());	// 중복체크 시 toString() 필요
		System.out.println("StringBuffer 입력flag : "+flag);
		flag = set.add(new StringBuffer("abcd").toString());
		System.out.println("StringBuffer 입력flag : "+flag);
		
		
		System.out.println(set);
		
	}
}
