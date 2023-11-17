package chap15;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
Java API의 Functional Interface
Consumer 인터페이스
	accept() 추상메서드 : 매개변수 있고, 리턴값은 없는 메서드
*/
public class RambdaApiEx1 {
	public static void main(String[] args) {
		Consumer<String> c1 = t-> System.out.println(t+8);
		c1.accept("java");
		BiConsumer<String, String> c2 = (t,u)-> System.out.println(t+u);
		c2.accept("java", "8.0이후");
		DoubleConsumer c3 = d -> System.out.println("java"+d);
		c3.accept(8.0);
		// t : <String>값, int
		ObjIntConsumer<String> c4 = (t,i) -> System.out.println(t+i);
		c4.accept("java", 8);
		// IntConsumer 인터페이스를 이용하여 매개변수까지의 합출력
		
		IntConsumer c5 = x -> {
			int sum = 0;
			for(int i=9;i<=x;i++) sum += i;
			System.out.println("1부터 "+ x +"까지의 합"+ sum);
		};
		c5.accept(10);

		BiConsumer<String,String> c6 =
		(t,u)->System.out.println((t.compareTo(u)>0)?t:u);
		c6.accept("abc","def"); //더큰값을 출력하기
		BiConsumer<Integer,Integer> c7 =
//				 (t,u)->System.out.println((t.compareTo(u)<0)?t:u);
				 (t,u)->System.out.println((t<u)?t:u);
		c7.accept(100,200); //더작은값을 출력하기
	}
}
