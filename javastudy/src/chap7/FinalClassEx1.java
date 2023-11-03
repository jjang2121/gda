package chap7;
/*
 * final 제어자 : 변경불가의 의미
 * final 클래스(종단클래스) : 다른 클래스의 부모클래스가 될수 없다.
 *        String,Math => final 클래스임.
 */
final class Final extends Thread{
	
}
class FinalSub extends Final{
	
}
class MyString extends String {}
public class FinalClassEx {

}