package chap5;

public class Exam3 {

	final static int divSet = 8;

	public static void main(String[] args) {
		/*
		문자열내에 각 소문자의 갯수 출력하기
		1. 소문자만 갯수 구하기
		2. cnt 배열의 요소가 1이상인 데이터만 출력하기
		3. cnt 배열의 값만큼 * 출력하기
		*/
		// inputStr();
		searchString();
	}

	/*
	 * 사용자 입력처리
	public static void inputStr() {
		try {
			System.out.println(divSet + "진수로 변활 할 10진수를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
	
			procBinary(num);
		} catch (Exception ex) {
			System.out.println("10진수의 숫자만 입력하세요.");
			inputStr();
		}
	}
	*/

	public static void searchString() {
		String str = "aaaabbㅈ4ㄷ갣ㄱ셓]ㅠㅊ퓨ㅜ.cvb[pertewiovbmbㅏㅡㄹ호'5ㅅ-0ㅐ류=-ㅍ9ㅠㅜ=ㅑㄷㅂ45시ㅛㅡbccdzzzzzzAASDFSDFSDFSDFDS#@$%#$%#$%";

		char[] getChar = str.toCharArray();
		int[] alphaCnt = new int[26];
		int alphaIdx = 0;
		int passStrCnt = 0;

		/*
		System.out.println((int)'a');	//97
		System.out.println((int)'z');	//122
		*/

		// 입력문자열 한자리씩 확인
		for (int i = 0; i < getChar.length; i++) {
			if (getChar[i] >= 'a' & getChar[i] <= 'z') { // 소문자 외 예외
				alphaIdx = getChar[i] - 'a'; // 알파벳 코드값 확인
				alphaCnt[alphaIdx]++; // 배열 알파벳 코드값 자리에 증분처리(0자리 a)
				// System.out.println(tempNum);
				passStrCnt++;
			}
		}

		System.out.println();

		// 각 알파벳별 갯수 출력
		for (int i = 0; i < alphaCnt.length; i++) {
			// System.out.println((char) (i + 97) + ":" + alphaCnt[i]);

			/*
			// 일반처리
			if (alphaCnt[i] > 0) {
				// System.out.println((char) (i + 'a') + ":" + alphaCnt[i]);	// 일반 갯수 출력
				System.out.print((char) (i + 'a') + ":"+alphaCnt[i]+"개,");
				for(int j=0;j<alphaCnt[i];j++) {
					System.out.print('*');
				}
				System.out.println();
			}
			*/

			// 간편화
			if (alphaCnt[i] > 0) {
				System.out.println((char) (i + 'a') + ":" + alphaCnt[i] + "개," + "*".repeat(alphaCnt[i]));
			}
		}
		System.out.println("총 문자열 수 : " + str.length());
		System.out.println("해당 문자열 수 : " + passStrCnt);
		System.out.println("비해당 문자열 수 : " + (str.length() - passStrCnt));

	}

}
