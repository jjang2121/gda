package chap2;

public class VarEx3 {

	public static void main(String[] args) {
		String str = "홍길동이 말했습니다. \"안녕\"";
		System.out.println(str);
		
		char ch = '\'';
		System.out.println(ch);
		
		System.out.println("홍길동\t김삿갓\t이몽룡"); // tab
		System.out.println("홍길동\n김삿갓\n이몽룡"); // new line
		
		ch = '\\';
		System.out.println(ch);
		
		System.out.println("c:\\20231012");
		
		ch = '\u0041';
		System.out.println(ch);
	}

}
