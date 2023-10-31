package chap3;

/*
 * 1. 단항 연산자
 * - 증감연산자: ++, --
 */
public class OpEx1 {

	public static void main(String[] args) {
		int x = 5, y = 5;
		x++;
		y--;
		System.out.printf("x=%d,y=%d\n",x,y);
		++x;
		--y;
		System.out.printf("x=%d,y=%d\n",x,y);
		
		x=y=5;
		y = ++x;
		System.out.printf("x=%d,y=%d\n",x,y);
		y = x++;
		System.out.printf("x=%d,y=%d\n",x,y);
		
		x=y=5;
		System.out.println("x=" + x++); // 1. x값 출력, 2. x값 증가
		System.out.println("x=" + ++x); // 1. x값 증가, 2. x값 출력
		System.out.println("y=" + y--);
		System.out.println("y=" + --y);

	}

}
