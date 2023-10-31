package chap5;

public class Exam4 {

	public static void main(String[] args) {
		/*
		command line에서 숫자를 입력받아 숫자의 자리수 압을 출력하기
		java Exam4 1234
		
		1+2+3+4 = 10
		*/
		inputStr(args);
	}

	public static void inputStr(String[] args) {
		try {
			if (args.length == 0) { // 배열 없을 때
				System.out.println("파라미터 정보가 없습니다.");
				return;

			} else if (args.length == 1) { // args[0]에 일렬의 숫자로만 이루어질 때
				int sum = 0;
				char[] arrStr = args[0].toCharArray();

				for (int i = 0; i < arrStr.length; i++) {
					if(arrStr[i] >= '0' && arrStr[i] <= '9') {	// 0~9까지만 허용
						sum += arrStr[i] - '0';
						System.out.print(arrStr[i]+(i==arrStr.length-1?"=":"+"));
					}
				}
				System.out.println(sum);

			} else { // args 배열로 넘어올 때
				int sum = 0;
				String argsStr = "";
				for (int i = 0; i < args.length; i++) {
					sum += Integer.parseInt(args[i]);
					if (i > 0)
						argsStr += ", ";
					argsStr += args[i];
				}
				System.out.println("파라미터 정보 : " + argsStr);
				System.out.println("합계 : " + sum);
			}

		} catch (Exception ex) {
			System.out.println("오류내용 : " + ex.getLocalizedMessage() + "\n올바른 숫자만 입력하세요.");
		}
	}

}
