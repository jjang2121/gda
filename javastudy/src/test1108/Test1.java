package test1108;
/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기
[결과]
 12,340
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "1,234";
		int num = Integer.parseInt(str.replace(",",""));
		System.out.println(str + "값 정수변경 : " + num);
		num *= 10;
		System.out.println(str + "값 * 10 : " + num);
		
		System.out.printf("%s값 * 10 콤마 : %,d", str, num);
	}
}
