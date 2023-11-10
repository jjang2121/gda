package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
정규표현식 문자
	.	: 문자 한개
	?	: 0 또는 1개
	*	: 0개 이상
	+	: 1개 이상
	^[]	: 지정된 문자로 시작되는 문자
	[^]	: 지정된 문자 제외
	|	: or
	&	: and
	()	: 그룹
	\s	: 공백
	\S	: 공백이 아닌
	\d	: 숫자. [0-9]
	\D	: 숫자가 아닌 [^0-9]
	\w	: 일반문자 [0-9a-zA-Z]
	\W	: 특수문자(일반문자 아닌, [^0-9a-zA-Z])
	{n}	: n개
	{n,}: n개 이상
	{n,m}: n개 ~ m개
*/
public class RegEx3 {
	public static void main(String[] args) {
		String source = "한드폰:010-1111-2222, 집:02-123-4567,이메일:regular111@aaa.bbb,계좌번호:301-01-123456";
		/*
		()			: 그룹
		0\\d{1,2}	: 0으로 시작하고 숫자가 1개 또는 2개, 0\\[0-9]{1,2}
		\\d{3,4}	: 숫자 3~4개
		\\d{4}		: 숫자 4개
		*/
		String telPattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		int i=0;
		System.out.println("전화번호");
		// m.find() : 해당무자열에서 패턴에 맞는 문자열을 찾기
		while(m.find()) {
			System.out.println(++i + ":" + m.group()+"=>" +m.group(1)+"," +m.group(2)+"," +m.group(3));
		}
		
		//이메일 형식 데이터 찾기
		// \w : [0-9a-zA-Z]
		String emailPattern = "(\\w+})@(\\w+).(\\w{3,4})";
		p = Pattern.compile(emailPattern);
		m = p.matcher(source);
		
		i=0;
		System.out.println("이메일");
		while(m.find())
			System.out.println(++i + ":" + m.group()+"=>" +m.group(1)+"," +m.group(2)+"," +m.group(3));

		//계좌번호 형식 데이터 찾기
		//301-01-123456
		String acountPattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		p = Pattern.compile(acountPattern);
		m = p.matcher(source);
		
		i=0;
		System.out.println("계좌번호");
		while(m.find())
			System.out.println(++i + ":" + m.group()+"=>" +m.group(1)+"," +m.group(2)+"," +m.group(3));
		
	}
}
