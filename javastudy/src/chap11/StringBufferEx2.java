package chap11;

/*
StringBuffer/StringBuilder 클래스 : 동적 문자열
- 두개의 클래스 멤버 메서드는 동일하다.
- equals 메서드를 오버라이딩 안함 => 내용 비교가 안됨.
	=> 내용비교를 위하여 문자열로 변경해야 함. toString() 메서드 이용
*/
public class StringBufferEx2 {

	public static void main(String[] args) {
		System.out.println("===== StringBuffer =====");
		StringBuffer sb = new StringBuffer();	// 빈공간의 버퍼
		
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);		//abc123Afalse
		sb.delete(2, 4);			// 2번 인덱스부터 3번인덱스까지 삭제
		System.out.println(sb);		//ab23Afalse
		sb.deleteCharAt(4); 		//4번 인덱스 문자 제거
		System.out.println(sb);		//ab23false
		sb.insert(5, "==");			//5번인덱스에 문자열 추가
		System.out.println(sb);		//ab23f==alse
		sb.insert(6, 1.23);			//6번인덱스에 실수 추가
		System.out.println(sb);		//ab23f=1.23=alse
		sb = new StringBuffer("ABCDEFG");	// 새로운 객체 생성
		sb.replace(0, 3, "abc");	//0~2번 인덱스 abc 문자열로 치환
		System.out.println(sb);		//abcDEFG
		sb.reverse();				//문자열 뒤집기
		System.out.println(sb);		//GFEDcba

	}

}
