package chap11;

/*
Object 클래스	:	hashCode() 메서드
	hashcode :	원래 의미는 JVM이 객체를 구별하기 위한 고유의 값(참조값)
		물리적동등성 : 	실제 같은 객체인 경우
		논리적동등성 : 	내용 기준으로 같은 객체로 판단하는 경우
		논리적동등성을 위해서 오버라이딩이 필요함.
		
- 두 객체가 논리적 동등성 판단 기준
1. equals 메서드의 결과가 true
2. hashcode 메서드의 결과가 동일한 경우

equals 메서드 오버라이딩 시 hashCode도 함께 오버라이딩을 권장함
*/


public class ObjectEx3 {

	public static void main(String[] args) {
		Card c1 = new Card("spade", 1);
		Card c2 = new Card("spade", 1);

		int c1Hash = c1.hashCode();
		int c2Hash = c2.hashCode();

		System.out.println("c1Hash : " + c1Hash);
		System.out.println("c2Hash : " + c2Hash);

		System.out.println();
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		if(s1 == s2)		System.out.println("s1과 s2는 같은 객체임");
		else				System.out.println("s1과 s2는 다른 객체임");
		System.out.println();
		if(s1.equals(s2))	System.out.println("s1과 s2는 같은 내용임");
		else				System.out.println("s1과 s2는 다른 내용임");
		System.out.println();
		// String 클래스에서는 오버라이딩 됨.
		System.out.println("s1 hashCode : " + s1.hashCode());
		System.out.println("s2 hashCode : " + s2.hashCode());
		System.out.println();
		System.out.println("s1 고유의 hashCode : " + System.identityHashCode(s1));
		System.out.println("s2 고유의 hashCode : " + System.identityHashCode(s2));
		System.out.println();
		// 클래스 객체
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		System.out.println("e1 hashcode():"+ e1.hashCode());
		System.out.println("e2 hashcode():"+ e2.hashCode());
		System.out.println("e1 고유의 hashcode():"+ System.identityHashCode(e1));
		System.out.println("e2 고유의 hashcode():"+ System.identityHashCode(e2));
		
	}
}
