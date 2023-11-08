package chap11;

/*
String 클래스 주요 메서드
*/

public class StringEx2 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4) : " + s.charAt(4)); // E, 5번째 문자(char) 리턴
		/*
		s.compareTo("abc") :	결과가 양수 s문자열이 "abc" 문자열보다 뒤쪽
								결과가 음수 s문자열이 "abc" 문자열보다 앞쪽
		*/
		System.out.println("s.compareTo(\"abc\") : " + s.compareTo("abc")); // -32
		System.out.println("s.compareTo(\"AAA\") : " + s.compareTo("AAA")); // 1
		/*
		s.compareToIgnoreCase("abc")	: 대소문자 상관없이
		*/
		System.out.println("s.compareToIgnoreCase(\"abc\") : " + s.compareToIgnoreCase("abc")); // 5
		System.out.println("s.endsWith(\"GH\") : " + s.endsWith("GH")); // true
		System.out.println("s.startsWith(\"AB\") : " + s.startsWith("AB")); // true
		System.out.println("s.equals(\"abcdefgh\") : " + s.equals("abcdefgh")); // false
		System.out.println("s.equalsIgnoreCase(\"abcdefgh\") : " + s.equalsIgnoreCase("abcdefgh")); // true
		System.out.println();

		s = "This is a String";
		System.out.println("s.indexOf('i') : " + s.indexOf('i')); // 2
		// s문자열에서 3번 인덱스부터 'i' 문자의 인덱스 리턴
		System.out.println("s.indexOf('i', 3) : " + s.indexOf('i', 3)); // 5
		System.out.println("s.indexOf('Q') : " + s.indexOf('Q')); // -1
		System.out.println("s.lastIndexOf('i') : " + s.lastIndexOf('i')); // 13, 앞쪽 인덱스부터 해당위치 계산
		System.out.println("s.length() : " + s.length()); // 16
		System.out.println("s.isEmpty() : " + s.isEmpty()); // false
		System.out.println("s.replace(\"i\", \"z\") : " + s.replace("i", "z"));
		System.out.println("s.substring(5) : " + s.substring(5)); // is a String
		System.out.println("s.substring(5, 13) : " + s.substring(5, 13)); // is a Str
		System.out.println("s.substring(s.lastIndexOf('i'), s.lastIndexOf('i')+2) : "
				+ s.substring(s.lastIndexOf('i'), s.lastIndexOf('i') + 2)); // in

		System.out.println();
		System.out.println("s.toUpperCase() : " + s.toUpperCase()); // THIS IS A STRING
		System.out.println("s.toLowerCase() : " + s.toLowerCase()); // this is a string
		System.out.println("s.concat(\"aaa\") : " + s.concat("aaa"));
		System.out.println("s.repeat(2) : " + s.repeat(2));
		s = "   "+ s + "   ";
		System.out.println("s.trim() : /"+ s +"/ => /" + s.trim() + "/");
		s = s.trim();
		
		String[] arr =  s.split(" ");
		for(String aArr : arr)	System.out.print(aArr + ",");

	}

}
