package chap4;

public class LoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	for 1~10 합 출력	*/
		System.out.println("for");
		int initNum = 1;
		int i = 1;
		int sum = 0;
		for(i=initNum; i<=10; i++) {
			sum += i;
			if(i==10)	System.out.println("sum="+sum);
			else		System.out.print("sum="+sum+",");
		}
		System.out.println("exit 합계="+sum);
		System.out.println();
		

		i=initNum;
		sum = 0;
		while(i<=10) {
			sum += i;
			if(i==10)	System.out.println("sum="+sum);
			else		System.out.print("sum="+sum+",");
			i++;
		}
		System.out.println("exit 합계="+sum);
		System.out.println();


		i=initNum;
		sum = 0;
		do {
			sum += i;
			if(i==10)	System.out.println("sum="+sum);
			else		System.out.print("sum="+sum+",");
			i++;
		} while (i<=10);
		System.out.println("exit 합계="+sum);
		
	}

}
