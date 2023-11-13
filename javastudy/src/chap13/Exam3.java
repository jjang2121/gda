package chap13;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet을 이용하여 Lotto번호 생성 구현하기
*/
public class Exam3 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		int ranNum=0;
		while(set.size() < 6) {
			ranNum = (int)((Math.random()*45)+1);
			set.add(ranNum);
		}
		System.out.println("로또번호 생성 : "+ set);
	}
}
