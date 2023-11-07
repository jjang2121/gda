package chap10;

/*
throw  :	예외 강제 발생

*/

public class ExceptionEx6 {

	public static void main(String[] args) { // throws Exception {
		// throw new RuntimeException("예외 강제 발생");	// 예외처리 생략가능(throws Exception)
		//throw new Exception("예외 강제 발생");				// 예외처리 필수(throws Exception)
		try {
			throw new Exception("예외 강제 발생");
		}catch (Exception ex) {
			ErrMsg.exMsg(ex, false);
		}
	}
	

}
