package test1101;
/*
 * Test2.java 소스의 Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.
 * [결과]
 * myCoin	youCoin
 * 앞면		앞면
 * 뒷면		앞면
 * 앞면		뒷면
 * 뒷면		앞면
 * 뒷면		앞면
 * 앞면		앞면
 * youCoin 승리
 */

class Coin5 {
	int maxWinLoop = 3;	// 연속승리 제한값
	int mySlide;
	int youSlide;
	int myCoin;
	int youCoin;
	static int myCoinCnt;
	static int youCoinCnt;

	int flip() {
		return (int)(Math.random()*2);
	}
	
	/*
	@Override
	public String toString() {
		//return ((mySlide==0)?"앞면":"뒷면")+"\t"+(youSlide==0)?"앞면":"뒷면";
		return String.format("%s\t%s", ((mySlide==0)?"앞면":"뒷면"), ((youSlide==0)?"앞면":"뒷면"));
	}
	*/
}

public class Test5 {
	public static void main(String[] args) {
		System.out.println("myCoin\tyouCoin");
		
		Coin5 myCoin;
		Coin5 youCoin;
		
		int mySlide = 0;
		int youSlide = 0;
		for(int i=0;i<10;i++) {
			myCoin = new Coin5();
			youCoin = new Coin5();
			
			mySlide = myCoin.flip();
			youSlide = youCoin.flip();
//			myCoin.mySlide = mySlide;
//			youCoin.youSlide = youSlide;
			if(mySlide == 0) {
				Coin5.myCoinCnt++;
			}else {
				Coin5.myCoinCnt=0;
			}
			if(youSlide == 0) {
				Coin5.youCoinCnt++;
			}else {
				Coin5.youCoinCnt=0;
			}
//			System.out.println(myCoin);
//			System.out.println(youCoin);
			
			System.out.println(String.format("%s\t%s", ((mySlide==0)?"앞면":"뒷면"), ((youSlide==0)?"앞면":"뒷면")));
			
			if(Coin5.myCoinCnt >= 3 || Coin5.youCoinCnt >= 3)	break;
		}
		
		System.out.println();
		if((Coin5.myCoinCnt >= 3 && Coin5.youCoinCnt >= 3) || Coin5.myCoinCnt < 3 && Coin5.youCoinCnt < 3) {
			System.out.println("비김");
		}else if(Coin5.myCoinCnt >= 3 && Coin5.youCoinCnt < 3) {
			System.out.println("myCoin 승리");
		}else {
			System.out.println("youCoin 승리");
		}
		
		
	}
}
