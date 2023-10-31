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
 [결과]
 90  80  70  240
 95  85  75  255
 70  80  75  225
 75  70  85  230
 70	 75  80  225
 400 390 385 1175
 */
public class Test1 {
	public static void main(String[] args) {
		 int[][] score = {
					{90,80,70},
					{95,85,75},
					{70,80,75},
					{75,70,85},
					{70,75,80}
		 		};
		 
		 int [][] result = new int[score.length+1][];
		 
		 for(int i=0;i<score.length+1;i++) {	// 2차원 방 셋팅
				 result[i] = new int[score[0].length+1];
		 }
		 

		 int[] cols = new int[result[0].length];

		 try {
			 for(int i=0;i<result.length;i++) {
				 int sum = 0;
				 for(int j=0;j<result[i].length;j++) {
					 // System.out.println("result["+i+"].length : "+result[i].length);
					 // 가로 합 계산
					 if(i==result.length-1) {
						 result[i][j] = cols[j];
					 } else {
						 if(j < result[i].length-1) {
							 sum += score[i][j];
							 result[i][j] = score[i][j];
							 //System.out.printf("%3d", result[i][j]);
							 cols[j] += result[i][j];
						 }else if(j == result[i].length-1) {
							 result[i][j] = sum;
							 //System.out.printf("%4d", sum);
							 cols[j] += result[i][j];
						 }
					 }

				 }
				 System.out.println();
			 }
			 
		 }catch(Exception ex) {
			 System.out.println();
			 System.out.println(ex.getMessage());
		 }

		 for(int[] arr : result) {
			 for(int arr1 : arr) {
				 System.out.printf("%5d", arr1);
			 }
			 System.out.println();
		 }
	}
}
