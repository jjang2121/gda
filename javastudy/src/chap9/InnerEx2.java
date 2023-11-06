package chap9;

/*
외부클래스의 private 멤버를 중첩 클래스에서 접근
*/

class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;

	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}

	static class StaticInner {
		// int siv = outeriv;	// 객체화 필요
		int siv = new Outer2().outeriv;
		int siv2 = outercv;
		static int scv = outercv;
	}

	void method(int pv) {	//지역변수 final 생략(중첩 외부메서드 매개변수)
		int max = 1000;
		// max++;	//하단에서 오류발생
		class LocalInner { // local 중첩클래스 : 메서드 내부에서 선언된 클래스.
			int liv = outeriv;
			int liv2 = outercv;
			int pv2 = pv;
			/*
			지역 중첩클래스의 멤버메서드에서 외부메서드의 지역변수는 상수화 되어야 한다(pv).
			지역변수의 변경이 없는 경우는 상수로 판단함.
			지역변수의 변경이 되는 경우는 오류발생.
			*/
			void method(int num) { // LocalInner의 멤버 메서드
				System.out.println("outeriv=" + outeriv);
				System.out.println("outercv=" + outercv);
				System.out.println("liv=" + liv);
				System.out.println("liv2=" + liv2);
				// pv = outeriv + outercv;
				pv2 = outeriv + outercv;
				System.out.println("pv=" + pv);
				System.out.println("pv2=" + pv2);
				num = liv + liv2;
				System.out.println("num=" + num);
				System.out.println("max=" + max);
			}
		}
		LocalInner li = new LocalInner();
		li.method(3);
	}
}

public class InnerEx2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(30);
		// InnerEx2 클래스에서 Outer2의 Private 멤버 접근불가
//		System.out.println(out.outeriv);
//		System.out.println(out.outercv);
		
		//InstanceInner, StaticInner의 멤버 변수를 화면 출력하기
		//InstanceInner 변수 화면출력
		System.out.println("===== InstanceInner 변수 화면출력 =====");
		//Outer2.InstanceInner ii = new Outer2().new InstanceInner();
		Outer2.InstanceInner ii = out.new InstanceInner();
		System.out.println("Outer2.InstanceInner ii.iiv="+ ii.iiv);
		System.out.println("Outer2.InstanceInner ii.iiv2="+ ii.iiv2);

		//StaticInner 변수 화면출력
		System.out.println("===== StaticInner 변수 화면출력 =====");
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("Outer2.StaticInner si.siv="+ si.siv);
		System.out.println("Outer2.StaticInner si.siv2="+ si.siv2);
		System.out.println("Outer2.StaticInner si.scv="+ Outer2.StaticInner.scv);
	}

}
