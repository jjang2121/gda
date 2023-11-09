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
public class WrapperEx2 {
	public static void main(String[] args) {
		char[] data = {'A','a','1','&','가'};	// 하단과 동일
		// Character[] data = {'A','a','1','&','가'};
		
		for(char c : data) {
			if(Character.isUpperCase(c))		System.out.println(c + ":대문자");
			else if(Character.isLowerCase(c))	System.out.println(c + ":소문자");
			else if(Character.isDigit(c))		System.out.println(c + ":숫자");
			else if(Character.isAlphabetic(c))	System.out.println(c + ":문자");
			else								System.out.println(c + ":기타문자");
		}

		
		char[] pw = "asdfA12@!".toCharArray();
		int cuCnt=0, clCnt=0, cdCnt=0, ceCnt=0;
		for(char p : pw) {
			if(Character.isUpperCase(p))		cuCnt++;
			else if(Character.isLowerCase(p))	clCnt++;
			else if(Character.isDigit(p))		cdCnt++;
			else								ceCnt++;
		}
		
		if(cuCnt == 0 || clCnt == 0 || cdCnt == 0 || ceCnt == 0) {
			System.out.println("비밀번호는 영대소문자, 특수문자, 숫자가 필요합니다.");
		}else {
			System.out.println("통과");
		}
		
		
		
	}
}
