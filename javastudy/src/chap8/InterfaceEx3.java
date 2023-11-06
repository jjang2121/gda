package chap8;

/*
인터페이스형을 리턴타입으로 사용
*/

class Lazerzet implements Printerable {
	@Override
	public void print() {
		System.out.println("레이저젯 프린터로 프린트 함");
	}
}
class Inkzet implements Printerable {
	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트 함");
	}
}

class PrinterManager {
	public static Printerable getPrint(String type) {
		if(type.equals("INK"))	return new Inkzet();
		else					return new Lazerzet();
	}
}

public class InterfaceEx3 {

	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrint("INK");
		System.out.println(p);
		p.print();
		p = PrinterManager.getPrint("LAZER");
		System.out.println(p);
		p.print();
	}

}
