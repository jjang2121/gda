package test1030;
/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 */
public class Test1_A {
	public static void main(String[] args) {
		int[][] score = { 
				{ 90, 80, 70 }, { 95, 85, 75 }, 
				{ 70, 80, 75 }, { 75, 70, 85 }, 
				{ 70, 75, 80 } 
		};
		int[][] result = new int[score.length + 1][score[0].length + 1];
		//score 값과 합계를 result 배열에 저장
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j]; //score 값을 result 배열에 저장
				//마지막 열에 행의 합을 저장
				result[i][score[i].length] += score[i][j];
				//마지막 행에 열의 합을 저장
				result[score.length][j] += score[i][j];
				//전체합 result 배열의 마지막 셀에 저장
				result[score.length][score[i].length] += score[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
		System.out.println("개선 for 구문으로 출력");
		for(int[] arr  : result) {  //인덱스 사용. 
			for(int a : arr) {
				System.out.printf("%5d", a);
			}
			System.out.println();
		}
			
	}
}
