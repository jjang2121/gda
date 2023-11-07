package chap11;

/*
Object 클래스 : equals 메서드
equals 메서드 : 같은 내용 여부를 리턴.
			  Object 클래스의 equals 메서드는 같은 객체인지 비교함.
			  => 내용 비교를 위해서는 equals 메서드를 오버라이딩 해야함.
== : 같은 객체 여부 리턴
*/

class Equal {
	int value;
	Equal(int value){
		this.value = value;
	}

	// Equal 객체의 내용을 비교하기 위해서 equals 메서드를 오버라이딩 해야함
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Equal e = (Equal)obj;
			return value == e.value;
		}else {
			return false;
		}
	}

}

public class ObjectEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		System.out.println("e1 : "+e1.hashCode());
		System.out.println("e2 : "+e2.hashCode());
		System.out.println();
		System.out.println("e1.toString() : "+e1.toString());
		System.out.println("e2.toString() : "+e2.toString());
		System.out.println();
		System.out.println("e1.value : "+e1.value);
		System.out.println("e2.value : "+e2.value);
		System.out.println();
		
		if(e1 == e2)		System.out.println("e1과 e2 객체는 동일");
		else				System.out.println("e1과 e2 객체는 다르다");

		if(e1.equals(e2))	System.out.println("e1과 e2 객체는 동일 내용임");
		else				System.out.println("e1과 e2 객체는 다른 내용임");

		if(e1.value == e2.value)	System.out.println("e1과 e2 객체는 동일 내용임");
		else						System.out.println("e1과 e2 객체는 다른 내용임");

	}

}
