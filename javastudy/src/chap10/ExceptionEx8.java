package chap10;

/*
사용자 예외 클래스 구현하기

Exception 클래스 상속 : 예외처리가 필수인 예외클래스 생성
RuntimeException 클래스 상속 : 예외처리 생략 가능한 예외클래스 생성
*/

class LoginFailException1 extends Exception {
	LoginFailException1(String msg) {
		super(msg);
	}
}

class LoginFailException2 extends RuntimeException {
	LoginFailException2(String msg) {
		super(msg);
	}
}

public class ExceptionEx8 {

	public static void main(String[] args) {
		String id = "hong";
		String pw = "1234";
		/*
		try {
			if (!id.equals("hong") || !pw.equals("1234"))
				throw new LoginFailException1("아이디 또는 비밀번호가 틀립니다.");
		
			System.out.println("반갑습니다. " + id + "님");
		} catch (LoginFailException1 ex) {
			ErrMsg.exMsg(ex, false);
		}
		*/
		try {
			if (!id.equals("hong") || !pw.equals("1234"))
				throw new LoginFailException2("아이디 또는 비밀번호가 틀립니다.");

			System.out.println("반갑습니다. " + id + "님");
		} catch (LoginFailException2 ex) {
			ErrMsg.exMsg(ex, false);
		}
		


	}

}
