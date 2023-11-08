package chap11;

/*
delChar 메서드 구현하기
StringBuffer delChar(원본문자열, 삭제문자열)
	=> 원본 문자열에서 삭제 문자열을 제외한 문자열 리턴
*/


public class Exam4 {

	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));	// 12345
		System.out.println(delChar("(1!2@3^4~5)","12345"));			//(!@^~)

		System.out.println(delChar2("(1!2@3^4~5)","~!@#$%^&*()"));	// 12345
		System.out.println(delChar2("(1!2@3^4~5)","12345"));			//(!@^~)
	}
	
	private static StringBuffer delChar(String str, String delStr) {
		char[] delStrArr = delStr.toCharArray();
		StringBuffer sb = new StringBuffer(str);
		
		int num = 0;
		for(int i=0;i<delStrArr.length;i++) {
			num = sb.indexOf(String.valueOf(delStrArr[i]));
			if(num >= 0)	sb.deleteCharAt(num);
		}
		return sb;
	}

	private static StringBuffer delChar2(String str, String delStr) {
		StringBuffer sb = new StringBuffer();
		
		int num = 0;
		for(int i=0;i<str.length();i++) {
			//if(delStr.indexOf(str.charAt(i)) < 0){
			// a.contains(b) => b문자열이 a문자열에 포함되는지 비교(true, false)
			if(!delStr.contains(str.charAt(i)+"")){
				sb.append(str.charAt(i));
			}
		}
		return sb;
	}

}
