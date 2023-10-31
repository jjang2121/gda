package test1027;

/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
     java Test8 10 20

   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class Test8 {
	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			int[][] cmmn = new int[2][10];
			int k = 0;

			for (int i = 0; i < 2; i++) {
				num[i] = Integer.parseInt(args[i]);
			}

			// 숫자Loop
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + "의 약수 : ");

				// 각 공약수
				k=0;
				for (int j = 1; j <= num[i]; j++) {
					if (num[i] % j == 0) {
						System.out.print(((j == 1) ? "" : ",") + j);
						cmmn[i][k++] = j;
					}
				}
				System.out.println();
			}

			System.out.println("loop end");
			
			
			System.out.println();
			System.out.print(num[0]+"과 "+num[1]+" 의 공약수 : ");
			for(int i=0;i<cmmn[0].length;i++) {
				for(int j=0;j<cmmn[1].length;j++) {
					if(cmmn[0][i] == cmmn[1][j] && cmmn[0][i] > 0 && cmmn[1][j] > 0) {
						
						//System.out.print(cmmn[0][i]+"="+cmmn[1][j]+"/");
						System.out.print(cmmn[0][i]+",");
					}
				}
				
			}
			System.out.println();

		} catch (Exception ex) {
			System.out.println(ex.getMessage() + "\n오류가 발생하였습니다.\n2개의 올바른 숫자를 입력하세요.");
		}

	}
}
