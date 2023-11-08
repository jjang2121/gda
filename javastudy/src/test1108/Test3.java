package test1108;
/*
[결과]
 HTML=>홍길동
 CSS=>김삿갓
 JavaScript=>이몽룡
 JAVA=>성춘향
 JSP=>임꺽정
 스프링=>향단이
*/
public class Test3 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JavaScript-JAVA-JSP-스프링";
		String s2 = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    ";
		
		String[] s1Arr = s1.split("-");
		String[] s2Arr = s2.split(",");
		int minNum = 0;
		
		if(s1Arr.length == s2Arr.length || s1Arr.length > s2Arr.length)
			minNum = s2Arr.length;
		else
			minNum = s1Arr.length;

		for(int i=0;i<minNum;i++) {
			System.out.println(s1Arr[i].trim() + "=>" + s2Arr[i].trim());
		}
	}
}