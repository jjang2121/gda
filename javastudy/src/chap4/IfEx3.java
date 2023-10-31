package chap4;

public class IfEx3 {

//	중첩if
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		if(score >= 60) {
			System.out.println("합격입니다.");
			if(score >= 80) {
				System.out.println("좋은 성적입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
	}

}
