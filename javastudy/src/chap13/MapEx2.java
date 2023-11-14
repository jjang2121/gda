package chap13;

import java.util.Comparator;
import java.util.TreeMap;

/*
TreeMap 예제	: key순으로 정렬
*/
public class MapEx2 {
	public static void main(String[] args) {
//		TreeMap<Integer, String> scores = new TreeMap<>();
		TreeMap<Integer, String> scores = new TreeMap<>(Comparator.reverseOrder());
		scores.put(87, "홍길동");
		scores.put(98, "이몽룡");
		scores.put(75, "임꺽정");
		scores.put(94, "김삿갓");
		scores.put(80, "성춘향");
		scores.put(88, "향단이");
		System.out.println(scores);
		System.out.println();
		
		System.out.println("첫번째 key : " + scores.firstKey());
		System.out.println("첫번째 entry : " + scores.firstEntry());
		System.out.println("마지막 key : " + scores.lastKey());
		System.out.println("마지막 entry : " + scores.lastEntry());
		// 점수가 가장 낮은 사람의 이름 출력하기
		System.out.println("가장 점수가 낮은 사람 : " + scores.get(scores.firstKey()));
		System.out.println("가장 점수가 낮은 사람 : " + scores.firstEntry().getValue());
		// 점수가 가장 높은 사람의 이름 출력하기
		System.out.println("가장 점수가 높은 사람 : " + scores.get(scores.lastKey()));
		System.out.println("가장 점수가 높은 사람 : " + scores.lastEntry().getValue());
		System.out.println();
		System.out.println("94점 앞 점수:");
		System.out.println(scores.lowerKey(94));
		System.out.println(scores.lowerEntry(94));
		System.out.println("94점 뒤 점수:");
		System.out.println(scores.higherKey(94));
		System.out.println(scores.higherEntry(94));
		System.out.println("94점(포함) 앞/뒤 점수:");
		System.out.println(scores.floorKey(94));
		System.out.println(scores.ceilingKey(94));
		System.out.println();
		
		
		for(Integer s : scores.keySet())	System.out.println(scores.get(s) +":"+ s);
		
		
	}
}
