package chap11;

/*
switch 구문 조건값으로 사용할 수 있는 자료형
byte, short, char, int, String
Byte, Short, Character, Integer
*/

public class WrapperEx3 {
	public static void main(String[] args) {
		Character data = 0;
		switch(data) {
			case	0	: System.out.println("data:"+data); break;
			default		: System.out.println("swich테스트");
		}
	}
}
