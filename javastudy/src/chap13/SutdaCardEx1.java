package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
SutdaCard 클래스 구현
*/

class SutdaCard {
	final int num;
	final boolean isKwang;
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	@Override
	public String toString() {
		return num + ((isKwang)?"K":"");
	}
}

/*
 SutdaDeck 클래스
1. 멤버변수	:	List<SutdaCard> cards;
  				static Map<String, Integer> jokbo;
2. 생성자		:	매개변수 없음
  				sutdaCard 20장을 cards 객체에 저장
				1~10의 숫자를 가진 카드 각각 2장씩.
				1,3,8인 카드 중 한장은 isKwang=true인 카드 생성
3. 멤버메서드	:	SutdaCard pick(int idx)	: cards에서 idx에 해당하는 카드를 제거하여 리턴
				SutdaCard pick()		: cards에서 임의의 카드를 제거하여 리턴
				void shuffle()			: cards를 섞기 기능.
*/

class SutdaDeck {
	List<SutdaCard> cards;
	static Map<String, Integer> jokbo;
	static {	// static 초기화 블럭
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for(int i=1;i<=10;i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060);	jokbo.put("21", 2060);
		jokbo.put("14", 2050);	jokbo.put("41", 2050);
		jokbo.put("19", 2040);	jokbo.put("91", 2040);
		jokbo.put("110", 2030);	jokbo.put("101", 2030);
		jokbo.put("410", 2020);	jokbo.put("104", 2020);
		jokbo.put("46", 2010);	jokbo.put("64", 2010);
	}
	SutdaDeck(){
		cards = new ArrayList<>();
		for(int i=0;i<20;i++) {
//			if(i==0 || i==2 || i==7) 	cards.add(new SutdaCard(i%10+1, true));
//			else						cards.add(new SutdaCard(i%10+1, false));
			cards.add(new SutdaCard(i%10+1, (i==0 || i==2 || i==7)?true:false));
		}
		System.out.println(cards);
	}
	
	SutdaCard pick(int idx) {
		return cards.remove(idx);
	}
	SutdaCard pick() {
		int randNo = (int)(Math.random()*cards.size());
		return cards.remove(randNo);
	}
	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println(cards);
	}
}

/*
Player 클래스
멤버변수	:	name
			SutdaCard card1, card2
생성자	:	멤버값을 받아서 객체 생성
멤버메서드
	int getScore() : card1, card2로 점수 리턴
					 jokbo객체 존재하는 경우 jokbo의 값을 리턴
					 jokbo객체에 없는 경우 (card1.num + card2.num)%10 점수 리턴
	String toString()	:	이름과 카드2장, 점수 출력
			홍길동(2,8k):0점
			김삿갓(4,8):2점
			이몽룡(1k,3k):4000점
*/
class Player {
	final String name;
	SutdaCard card1;
	SutdaCard card2;
	Player (String name, SutdaCard card1, SutdaCard card2) {
		this.name = name;
		this.card1 = card1;
		this.card2 = card2;
	}
	
	int getScore() {
		Integer score = 0;
		if(card1.isKwang && card2.isKwang) {
			score = SutdaDeck.jokbo.get("KK");
		}else {
			score = SutdaDeck.jokbo.get("" + card1.num + card2.num);
			if(score == null) {
				score = (card1.num + card2.num) % 10;
			}
		}
		return score;
	}
	
	@Override
	public String toString() {
		return this.name+"("+card1+","+card2+"):"+getScore();
	}
}

public class SutdaCardEx1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		System.out.println();
		
		List<Player> player = new ArrayList<>();
		player.add(new Player("홍길동", deck.pick(0), deck.pick(0)));
		player.add(new Player("김삿갓", deck.pick(0), deck.pick(0)));
		player.add(new Player("이몽룡", deck.pick(0), deck.pick(0)));
		player.add(new Player("성춘향", deck.pick(0), deck.pick(0)));

		for(Player p : player)
			System.out.println(p);
		
		System.out.println("잔여카드 수 : "+ deck.cards.size()+ "장");
		System.out.println("잔여카드 : "+ deck.cards);
		
		/*
		Player 중 승리자 이름 출력하기
		1등이 한명 : 홍길동 승리
		1등이 2명인 경우 : 홍길동, 김삿갓 비김
		*/
		// 정렬
		player.sort((j1, j2)->j2.getScore() - j1.getScore());
		
		System.out.println(player);
		System.out.println();
		if(player.get(0).getScore() == player.get(1).getScore()) {
			System.out.println(player.get(0).name + ", " + player.get(1).name + " 비김");
		}else {
			System.out.println(player.get(0).name + " 승리");
		}
		
	}
}
