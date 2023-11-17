package chap15;

import java.util.function.Supplier;

/*
Supplier 인터페이스
	매개변수는 없고, 리턴값은 존재함
	T getXXX() 추상메서드를 가짐
*/
public class RambdaEx2 {
	public static void main(String[] args) {
		Supplier<String> s1 = ()->"java";
		System.out.println(s1.get());
		System.out.println(s1.get());
		//IntSupplier : 정수값을 리턴
		//IntSupplier를 이용하여 임의의 주사위값 리턴
		Supplier<Integer> s2 = ()-> (int)(Math.random()*6)+1;
		//IntSupplier 를 이용하여 1~100
	}
}
