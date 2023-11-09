package test1108;
/*
 * 소숫점이하 자리수까지 반올림하여 출력하기
 *    round(double 실수값,int 소숫점이하자리수)
 * 소숫점이하 자리수에서 버림하여 출력하기
 *    truncate(double 실수값,int 소숫점이하자리수)
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1));  //3.1
		System.out.println(round(3.1215,2));  //3.12
		System.out.println(round(3.1215,3));  //3.122
		System.out.println();
		System.out.println(truncate(3.15345,1));  //3.1
		System.out.println(truncate(3.15345,2));  //3.15
		System.out.println(truncate(3.15345,3));  //3.153
		System.out.println(truncate(3.15345,4));  //3.1534
	}
	
	private static double round(double num, int posNum) {
		double tempCalc = Math.pow(10, posNum);
		num = Math.round(num * tempCalc)/tempCalc;
		return num;
	}
	
	private static double truncate(double num, int posNum) {
		double tempCalc = Math.pow(10, posNum);
		num = num * tempCalc;
		String tmp = num + "";
		if (tmp.indexOf('.') >= 0)	tmp = tmp.substring(0, tmp.indexOf('.'));
		
		return (Double.parseDouble(tmp)/tempCalc);
	}
}
