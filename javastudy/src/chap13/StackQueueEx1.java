package chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
Stack	: LIFO(LAST IN FIRST OUT)
	Stack 클래스 : Vector 클래스의 하위 클래스.
		주요메서드
			push(Object)	: 객체를 stack에 추가
			Object pop()	: stack에서 객체를 꺼내 리턴, stack에서 객체 제거
			Object peek()	: stack에서 조회 대상 객체를 리턴.

Queue	: FIFO(FIRST IN FIRST OUT)
	Queue 인터페이스 : LinkedList가 구현 클래스임.
		주요메서드
			offer(Object)	: 객체를 Queue에 추가
			Object poll()	: Queue에서 객체를 꺼내 리턴, Queue에서 객체 제거
			Object peek()	: Queue에서 조회 대상 객체를 리턴.
*/
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"소나타","그랜저","SM5","K9"};
		Stack<String> s = new Stack<>();
		Queue<String> q = new LinkedList<>();
		for(String c : cars) {
			s.push(c);
			q.offer(c);
		}
		
		System.out.println("스택에 저장된 갯수 : "+ s.size());
		System.out.println(s);
		System.out.println("큐에 저장된 갯수 : "+ q.size());
		System.out.println(q);
		System.out.println();
		System.out.println("스택 조회대상 객체 : "+s.peek());
		System.out.println("큐 조회대상 객체 : "+q.peek());
		System.out.println(s);
		System.out.println(q);
		System.out.println();
		System.out.println("스택 객체 꺼내기 : "+s.pop());
		System.out.println("큐 객체 꺼내기 : "+q.poll());
		System.out.println(s);
		System.out.println(q);
		System.out.println();
		System.out.println("스택 조회대상 객체 : "+s.peek());
		System.out.println("큐 조회대상 객체 : "+q.peek());
		System.out.println(s);
		System.out.println(q);
		System.out.println();
		

		/*
		 테스트
		System.out.println("===== Stack =====");
		Stack<Object> s = new Stack<Object>();
		for(int i=0;i<5;i++) {
			s.push(i);
		}
		
		System.out.println("Stack peek()");
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println("Stack pop()");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("Stack정보 : " + s);
		
		System.out.println("===== Queue =====");
		Queue<Object> q = new LinkedList<>();
		for(int i=0;i<5;i++) {
			q.offer(i);
		}
		System.out.println("Queue peek()");
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println("Queue pop()");
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println("Queue정보 : " + q);
		*/
	}
}
