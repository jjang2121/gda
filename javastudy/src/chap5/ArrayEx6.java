package chap5;

public class ArrayEx6 {

	final static int divSet = 16; // 16진수 변환

	public static void main(String[] args) {
		/*
		Command line에서 파라미터 받기
		
		- 자바프로그램 실생순서
		1. java소스코딩
		2. 컴파일	> 	javac ArrayEx6.java => ArrayEx6.class(바이트코드 생성)
		3. 실행	> 	java ArrayEx6
		3.1 	java 인터프리터 기능
		3.1.1	JVM 환경설정 : 클래스영역, 스택영역, 힙영역
		3.1.2	바이트코드 클래스영역 메모리 로드
		3.1.3	args 배열의 값을 생성(힙영역)하여 main 메서드에 전달. main 메서드 실행(스택영역).
		*/
		inputStr(args);
	}

	public static void inputStr(String[] args) {
		try {
			if (args.length == 0) {
				System.out.println("command 라인에 파라미터를 입력하세요.");
				return;
			}
			for (String a : args)
				System.out.println(a);
			
			
			for(int i=0;i<args.length;i++) {
				System.out.println("args["+i+"]="+args[i]);
			}

		} catch (Exception ex) {
			System.out.printf("오류발생 : %s\n", ex.getMessage());
		}
	}

}
