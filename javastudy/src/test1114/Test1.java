package test1114;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * SutdaCard, SutdaDeck, Player를 이용하여 다음 구동 클래스를 완성하시오
 [결과]
[1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[6, 7, 5, 4, 5, 8, 9, 10, 2, 3, 10, 4, 1K, 6, 1, 7, 2, 3K, 9, 8K]

게임할 인원수를 입력하세요(최대:10)
5
1등:2번(5,4):9
1등:4번(9,10):9
3등:5번(2,3):5
4등:1번(6,7):3
4등:3번(5,8):3
 */

class SutdaCard {
	final int num;
	final boolean isKwang;

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + ((isKwang) ? "K" : "");
	}
}

class SutdaDeck {
	List<SutdaCard> cards;
	static Map<String, Integer> jokbo;
	static { // static 초기화 블럭
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for (int i = 1; i <= 10; i++) {
			jokbo.put("" + i + i, 3000 + (i * 10));
		}
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}

	public SutdaDeck() {
		cards = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			cards.add(i, new SutdaCard(i % 10 + 1, ((i == 0 || i == 2 || i == 7) ? true : false)));
		}
		System.out.println(cards);
	}

	public SutdaCard getCards(int idx) {
		return cards.remove(idx);
	}

	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println(cards);
		System.out.println();
	}
}

class Player {
	String name;
	SutdaCard card1;
	SutdaCard card2;

	public Player(String name, SutdaCard card1, SutdaCard card2) {
		super();
		this.name = name;
		this.card1 = card1;
		this.card2 = card2;
	}

	public int getScore() {
		int score = 0;
		String cardVal = "" + card1.num + card2.num;

		if (card1.isKwang && card2.isKwang) {
			score = SutdaDeck.jokbo.get("KK");
		} else if (SutdaDeck.jokbo.get(cardVal) != null) {
			score = SutdaDeck.jokbo.get(cardVal);
			// System.out.println(score);
		} else {
			score = (card1.num + card2.num) % 10;
		}
		return score;
	}

	@Override
	public String toString() {
		return name + "(" + card1.num + "," + card2.num + "):" + getScore();
	}

}

public class Test1 {
	public static void main(String[] args) {
		SutdaDeck deck;

		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				deck = new SutdaDeck();
				deck.shuffle(); // 카드섞기

				System.out.println("게임할 인원수를 입력하세요(2~10명)");
				int playCnt = scan.nextInt();

				if (playCnt < 2 || playCnt > 10) {
					System.out.println("인원수를 정확히 입력하세요.");
					continue;
				}

				// Player 생성
				List<Player> p = new ArrayList<>();
				for (int i = 0; i < playCnt; i++) {
					p.add(new Player((i + 1) + "번", deck.getCards(0), deck.getCards(0)));
				}

				Collections.sort(p, (j1, j2) -> j2.getScore() - j1.getScore());
				TreeMap<Integer, String> tm = new TreeMap<>(Comparator.reverseOrder());

				for (Player p1 : p) {
					System.out.println(p1);
					tm.put(p1.getScore(), p1.name);
				}
				
				System.out.println();
				// 등수 산정
				int top = 1;
				for (Map.Entry<Integer, String> tm1 : tm.entrySet()) { // 점수 그룹
					int tempTop = 0;
					int cnt = 0;
					for (Player p1 : p) {
						if(tm1.getKey() == p1.getScore()) {
							System.out.println(
									top + "등 : " + p1.name + "(" + p1.card1.num + "," + p1.card2.num + ") : " + p1.getScore());
							if(cnt>0) tempTop++;
							cnt++;
						}
					}
					top++;
					top += tempTop;
				}

				System.out.println();
				System.out.println("잔여카드 수 : " + deck.cards);

			} catch (Exception ex) {
				System.out.println("오류발생 : " + ex.getMessage());
				scan.next();
			}
		}

	}
}