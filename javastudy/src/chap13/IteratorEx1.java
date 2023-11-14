package chap13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/*
Iterator 인터페이스 객체 : 반복자
Collection 객체는 Iterator 객체로 변환이 가능 : iterator() 메서드 이용
주요메서드
boolean hasNext()	: 조회 대상 객체존재 여부
Object next()		: 조회대상 객체 리턴
void remove()		: 조회된 객체 제거.

Enumeration 인터페이스	: Iterator 반복자 이전에 사용되던 구반복자
					  Collection 프레임워크 이전에 사용됨 : Vector, HashTable 에서만 사용 가능.
주요메서드
	boolean hasMoreElement()	: 조회대상 객체 존재 여부
	Object nextElement()		: 조회대상 객체 리턴
	
*/
public class IteratorEx1 {
	public static void main(String[] args) {
		System.out.println("===== Iterator =====");
		Iterator<Integer> it = null;
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i=1;i<=5;i++) {
			list.add(i+10);
			set.add(i*10);
		}
		
		it = list.iterator();	// Iterator 객체 <- List 객체
		print(it);
		System.out.println();
		it = set.iterator();	// Iterator 객체 <- Set 객체
		print(it);
		System.out.println();
		System.out.println("print() 이후의 list : " + list);
		System.out.println("print() 이후의 set : " + set);
		System.out.println();
		
		System.out.println("===== Enumeration =====");
		Enumeration<Integer> et = null;
		Vector<Integer> vt = new Vector<>();
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		for(int i=1;i<=5;i++) {
			vt.add(i+10);
			ht.put(i+10, i*10);
		}
		et = vt.elements();
	}
	
	public static void print(Iterator<Integer> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();	// 한개의 요소 제거.
		}
	}
	
}
