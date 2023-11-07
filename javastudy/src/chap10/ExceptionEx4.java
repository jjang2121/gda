package chap10;

/*
throws :	예외처리
			예외 발생 메서드에서 호출한 메서드로 예외 전달.
			=> 호출한 메서드가 예외 발생
*/

public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			first();
		} catch (Exception ex) {
			ErrMsg.exMsg(ex);
//			System.out.println("숫자만 가능합니다.");
//			ex.printStackTrace();
		}
	}
	
	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();
	}
	private static void second() throws Exception {
		System.out.println("second 메서드");
		try {
			System.out.println(Integer.parseInt("aa"));	//NumberFormatException 발생
		}catch(RuntimeException ex) {
			System.out.println("second 메서드에서 예외처리");
			ErrMsg.exMsg(ex);
		}
	}

}
