package chap13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
1. 대한민국=서울, 캐나다=오타와, 영국=런던 값을 저장하는 HashMap 객체 생성
2. 화면에서 나라이름을 입력받아 그 나라의 수도출력하기, 종료가 입력시까지 계속 입력
   => 등록된 나라가 아닌 경우 : 등록된 나라가 아닙니다. 메시지 출력
3. 등록된 나라가 아닌 경우 수도를 입력받아 map 등록하기
   => 프로그램 종료 전 map에 등록된 내용 출력하기
*/
public class Exam4 {
	public static void main(String[] args) {
		// 1.
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		
		// System.out.println(map);
		Set<Map.Entry<String, String>> set = map.entrySet();
		//for(Map.Entry<String, String> s : set)	System.out.println(s.getKey() +":"+ s.getValue());
		
		Scanner scan = new Scanner(System.in);
		String inputNat;
		String inputSd;
		
		while(true) {
			try {
				boolean flag = false;
				System.out.println("나라이름을 입력하세요.");
				inputNat = scan.next();
				if(inputNat.equals("종료")) {
					System.out.println("프로그램 종료");
					break;
				}
				for(Map.Entry<String, String> s : set) {
					if(s.getKey().equals(inputNat)) {
						flag = true;
						System.out.println(s.getKey()+"의 수도는 " + s.getValue() + "입니다.");
						continue;
					}
				}
				
				// 등록된 나라가 없을 때 수도정보 받기
				if(!flag) {
					System.out.println("등록된 나라가 아닙니다.\n수도를 입력하세요.");
					inputSd = scan.next();
					if(inputSd.equals("종료")) {
						System.out.println("프로그램 종료");
						break;
					}else {
						map.put(inputNat, inputSd);
						System.out.println("입력정보 나라:"+inputNat +", 수도:"+ inputSd);
					}
					
				}
				
			}catch(Exception ex) {
				scan.next();
			}
			
		}
		
		// 위 데이터 출력 3종
		System.out.println("===== 3종목록 출력 =====");
		Set<String> nation = map.keySet();
		System.out.print("key출력 : ");
		for(String s : nation)	System.out.print(s+":"+map.get(s)+",");
		System.out.println();
		
		Collection<String> c = map.values();
		System.out.print("값출력 : ");
		for(String s : c)	System.out.print(s+",");
		System.out.println();
		
		Set<Map.Entry<String, String>> setData = map.entrySet();
		System.out.print("key:값 출력 : ");
		for(Map.Entry<String, String> s : setData)	System.out.print(s.getKey() +":"+ s.getValue()+",");
		System.out.println();
	}
}
