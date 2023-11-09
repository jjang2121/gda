package chap11;

/*
Wrapper 클래스 : 8개의 기본 자료형을 객체화 하기 위한 클래스
	- 기본자료형		- Wrapper 클래스
	boolean			Boolean
	char			Char
	byte			Byte
	short			Short
	int				Integer
	long			Long
	float			Float
	double			Double
	
	기본형과 참조형 사이의 형변환 불가
	String s = 'a'; (x)
	
	기본형과 연결된 Wrapper 클래스간의 형변환은 가능함(jdk5 이상)
	기본형 < 참조형 : byte b = new Byte(10);	=> Auto UnBoxing
	참조형 < 기본형 : Byte b = 10;				=> Auto boxing
*/
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = 100;	//Boxing
		Integer i2 = 100;
		System.out.println("i1==i2 : "+ (i1 == i2));
		
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		System.out.println("i3==i4 : "+ (i3 == i4));
		System.out.println("100==i2 : "+ (100 == i2));	// UnBoxing
		System.out.println("100==i3 : "+ (100 == i3));
		// int형
		System.out.println("int 형의 최대값 : "+Integer.MAX_VALUE);
		System.out.println("int 형의 최소값 : "+Integer.MIN_VALUE);
		System.out.println("int 형의 bit크기 : "+Integer.SIZE);
		// double형
		System.out.println("double 형의 최대값 : "+Double.MAX_VALUE);
		System.out.println("double 형의 최소값 : "+Double.MIN_VALUE);
		System.out.println("double 형의 bit크기 : "+Double.SIZE);
	}
}
