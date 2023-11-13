package chap13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map : (키, 객체)쌍인 객체들의 모임
put(키값, 객체값)	:	Map객체에 데이터 추가, 수정
					동일한 키값이 들어온 경우 객체만 수정.
remove(키값)		:	키값에 해당하는 데이터 제거, 객체값 리턴.

- 3가지 목록조회
keySet()		: Map 객체 중 key값들의 목록. Set객체로 리턴
values()		: Map 객체 중 개체값들의 목록. Collection 객체 리턴
entrySet()		: Map 객체의 (키,객체)쌍인 객체 목록. Set 객체 리턴.
				  (키,객체) 쌍인 객체 : Map.Entry<key자료형, 객체자료형>
*/
public class MapEx1 {
	public static void main(String[] args) {
		/*
		<String, Integer>	: key의 자료형 String
							  객체의 자료형 Integer
		*/
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 1234);
		map.put("김삿갓", 4567);
		map.put("이몽룡", 2350);
		map.put("김삿갓", 3456);	// 키값 동일하여 객체정보 수정
		
		System.out.println("===== 조회정보1 =====");
		System.out.println(map);	// 3개의 요소가 저장

		System.out.print("김삿갓의 전화번호 : ");
		System.out.println(map.get("김삿갓"));
		System.out.println(map.get("홍길동"));
		System.out.println(map.get("성춘향"));
		System.out.println();

		System.out.println("===== 조회정보2 =====");
		//keySet() : key값들만 조회
		System.out.println("key값들만 조회");
		Set<String> keys = map.keySet();
		for(String k : keys)	System.out.print(k +"="+ map.get(k)+",");
		System.out.println();

		//Collection values() : 객체들만 조회, 중복가능, 순서유지 안됨.
		//						키값 조회 불가.
		System.out.println("객체들만 조회");
		Collection<Integer> values  = map.values();
		for(int i : values)		System.out.print(i+",");
		System.out.println();
		
		//entrySet() : (key, 객체) 쌍인 객체들
		//			   (key, 객체) 객체의 자료형 : Map.Entry
		System.out.println("Map.Entry");
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> e : entrys)	System.out.println(e.getKey() +":"+ e.getValue());
		System.out.println();
		
		System.out.println("===== 수정정보 =====");
		System.out.print("홍길동의 전화번호 수정 : " + map.replace("홍길동", 7890));
		System.out.println();
		System.out.println(map);
		
		System.out.println("===== 삭제정보 =====");
		//remove(키값)	: 키값의 데이터 제거, 객체값 리턴.
		System.out.print("홍길동의 전화번호 삭제 후: "+ map.remove("홍길동"));
		System.out.println();
		System.out.println(map);	// 3개의 요소가 저장
		System.out.println("map size() : " + map.size());
	}
}
