package chap4;

public class LoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	for	*/
		System.out.println("for");
		int initNum = 1;
		int i = 1;
		for(i=initNum; i<=5; i++) {
			if(i==5)	System.out.println("i="+i);
			else		System.out.print("i="+i+",");
		}
		System.out.println("exit i="+i);

		
		/*	while	*/
		System.out.println("\nwhile");
		i = initNum;
		while(i <= 5) {
			if(i==5)	System.out.println("i="+i);
			else		System.out.print("i="+i+",");
			i++;
		}
		System.out.println("exit i="+i);
		
		
		/*	do while	*/
		System.out.println("\ndo while");
		i = initNum;
		do {
			if(i==5)	System.out.println("i="+i);
			else		System.out.print("i="+i+",");
			i++;
		} while(i <= 5);
		System.out.println("exit i="+i);
			
		
	}

}
