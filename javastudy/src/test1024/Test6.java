package test1024;


//  반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6 {
	public static void main(String[] args) {
		//double pi = 3.141592;
		double pi = Math.round(Math.PI * 1000000)/1000000.0;
		//double pi = Math.PI;
		System.out.println(pi);
	}
}
