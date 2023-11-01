package chap6;
/*
 * Student2 클래스 구현하기
 * 멤버변수 : 학번(studno),국어(kor),영어(eng),수학(math)
 *          이름(name)
 * 구동클래스에 맞도록 메서드,생성자 구현하기
* [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
   =====================
*/

class Student2{
	private int studno, kor, eng, math;
	private String name;
	
	public Student2(String name, int studno) {
		/*
		this.name = name;
		this.studno = studno;
		*/
		this(name, studno, 0,0,0);
	}
	public Student2(String name, int studno, int kor, int eng, int math) {
		/*
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		*/
		setName(name);
		setStudno(studno);
		setKor(kor);
		setEng(eng);
		setMath(math);
	}
	public int getTotScore() {
		// return kor+eng+math;
		return getKor() + getEng() + getMath();
	}
	public float getAvg() {
		return	getTotScore()/3f;
	}
	
	@Override
	public String toString() {
		return String.format("학번:%d\n이름:%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%.2f",
							getStudno(), getName(), getKor(), getEng(), getMath(), getTotScore(), getAvg());
	}
	
	// getter, setter 이용
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Exam6 {
	int num = 100;
	
	public static void main(String[] args) {
		
		Student2 s1 = new Student2("홍길동",1);
		Student2 s2 = new Student2("김삿갓",2,80,90,70);
		Student2 s3 = new Student2("김삿갓",2);
		System.out.println(s1);
		System.out.println("===========");
		System.out.println(s2);
		System.out.println("===========");
		System.out.println(s3);
		System.out.println("===========");
	}
}