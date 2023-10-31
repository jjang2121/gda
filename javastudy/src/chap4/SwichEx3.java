package chap4;

public class SwichEx3 {

	/*	switch 조건값으로 사용할 수 있는 자료형 : byte, int, short, char, String만 가능	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int v = 1;
//		byte v = 1;
//		short v = 1;
//		char v = '1';
//		long v = 1;
		String v = "1";
//		double v = 1.0;
		
		switch(v){
			default 	: System.out.println(v);
		}
		
		/*중첩 switch*/
		
		int a = 1, b = 2;
		
		switch(a) {
		case 1 :	switch(b) {
					case 1 : System.out.println("a=" + a); break;
					case 2 : System.out.println("b=" + b); break;
					} 
					break;
		}
		
	}

}
