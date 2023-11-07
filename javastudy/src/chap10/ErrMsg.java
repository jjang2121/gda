package chap10;

public class ErrMsg {
	// 기본형
	static void exMsg(Exception ex) {
		System.out.println("오류발생 : " + ex.getMessage());
		ex.printStackTrace();
		return;
	}
	
	// printStackTrace 출력여부
	static void exMsg(Exception ex, boolean flag) {
		System.out.println("오류발생 : " + ex.getMessage());
		if (flag)
			ex.printStackTrace();
		return;
	}

	// printStackTrace 출력여부, 사용자 메시지
	static void exMsg(Exception ex, boolean flag, String errStr) {
		System.out.println("오류발생 : " + errStr);
		if (flag)
			ex.printStackTrace();
		return;
	}
}
