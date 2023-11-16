package chap2;

public class VarEx2 {
	public static void main(String[] args) {
		char ch1 = 'A'; // 문자형은 반드시 한 개의 문자만 저장 가능하다. 빈 문자도 불가능하다(공백과는 구분됨)
		int num = ch1; // int <- char 형변환
		System.out.println(ch1 + "=" + num);
		
		num = ch1 + 1;
		System.out.println((char)num);
		
		String str = "ABC";
		System.out.println(str);
		
		String str2 = "";
		System.out.println(str2);
	}
}
