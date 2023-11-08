package chap11;

/*
StringBuffer/StringBuilder 클래스 : 동적 문자열
- 두개의 클래스 멤버 메서드는 동일하다.
- equals 메서드를 오버라이딩 안함 => 내용 비교가 안됨.
	=> 내용비교를 위하여 문자열로 변경해야 함. toString() 메서드 이용
*/
public class StringBufferEx1 {

	public static void main(String[] args) {
		System.out.println("===== StringBuffer =====");
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		if(sb1 == sb2)		System.out.println("같은 내용의 객체임");
		else				System.out.println("다른 내용의 객체임");
		// 내용 비교를 위해 String 객체로 변환 : toString()
		if(sb1.equals(sb2))		System.out.println("같은 내용의 객체임");
		else					System.out.println("다른 내용의 객체임");
		if(sb1.toString().equals(sb2.toString()))		System.out.println("같은 내용의 객체임");
		else											System.out.println("다른 내용의 객체임");
		
		System.out.println();
		System.out.println("===== StringBuilder =====");
		StringBuilder sb3 = new StringBuilder("abc");
		StringBuilder sb4 = new StringBuilder("abc");
		if(sb3 == sb4)		System.out.println("같은 내용의 객체임");
		else				System.out.println("다른 내용의 객체임");
		// 내용 비교를 위해 String 객체로 변환 : toString()
		if(sb3.equals(sb4))		System.out.println("같은 내용의 객체임");
		else					System.out.println("다른 내용의 객체임");
		if(sb3.toString().equals(sb4.toString()))		System.out.println("같은 내용의 객체임");
		else											System.out.println("다른 내용의 객체임");
	}

}
