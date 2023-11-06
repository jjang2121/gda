package chap9;

/*
중첩클래스 객체에서 this
*/

class P {
	int iv = 0;
}
class Outer3 extends P {
	int iv	= 10;
	int iv2	= 20;
	
	class InstanceInner {
		int iv = 100;
		void method() {
			 int iv = 300;
			System.out.println("iv="+iv);	// 300
			System.out.println("iv2="+iv2);	// Outer3.iv2
			// this : 중첩클래스의 격체 참조변수
			System.out.println("this.iv="+this.iv);	// InstanceInner.iv
			System.out.println("===== Outer3 변수출력 =====");
			System.out.println("Outer3.iv="+Outer3.this.iv);		//Outer3.iv
			System.out.println("Outer3.iv2="+Outer3.this.iv2);		//Outer3.iv2
			System.out.println("===== Outer3 상속된 변수출력 =====");
			System.out.println("Outer3.super.iv="+Outer3.super.iv);	//P.iv
		}
	}
}

public class InnerEx3 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner in = out.new InstanceInner();
		in.method();
	}

}
