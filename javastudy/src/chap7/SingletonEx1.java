package chap7;
/*
 생성자의 접근제어자를 private로 => 객체를 한개만 생성
*/

class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}

public class SingletonEx1 {

	public static void main(String[] args) {
//		SingleObject o = new SingleObject();	// 생성자 접근 불가
//		System.out.println(o.value);
//		System.out.println(o.getObject());
		SingleObject o1 = SingleObject.getObject();
		System.out.println(o1.value);
		System.out.println(o1);
		SingleObject o2 = SingleObject.getObject();
		System.out.println(o2.value);
		System.out.println(o2);
		
		if(o1 == o2) System.out.println("주소동일");
		if(o1.equals(o2)) System.out.println("주소동일");
		
		o1.value = 200;
		System.out.println(o1.value);
		System.out.println(o2.value);
	}

}
