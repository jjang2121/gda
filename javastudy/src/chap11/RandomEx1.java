package chap11;

import java.util.Random;

/*
java.util.Random 클래스 : 난수발생클래스
	1. 자료형별로 난수 발생 가능
		nextInt()		: 정수형 난수
		nextInt(n)		: 정수형 난수, 0 <= x < n	nextInt(10) : 0~9사이의 임의의 정수
		nextDouble()	: 0 <= x < 1.0
		nextBoolean()	: true/false
	2. seed값 설정 가능
		
*/
public class RandomEx1 {

	public static void main(String[] args) {
		Random rand1 = new Random();
		rand1.setSeed(1);
		for(int i=0;i<5;i++)	System.out.println(i + ":" + rand1.nextInt(10));
		System.out.println("==========");
		Random rand2 = new Random();
		rand2.setSeed(1);
		for(int i=0;i<5;i++)	System.out.println(i + ":" + rand2.nextInt(10));
	}

}
