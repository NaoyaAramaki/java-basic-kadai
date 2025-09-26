package kadai.kadai_028;

import java.util.Arrays;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String choice = "";		
		Scanner scan = new Scanner(System.in);
		boolean checkFlg = false;
		try {
			do {
				choice = scan.next();
				checkFlg = checkMyChoice(choice);
				if(!checkFlg) {
					System.out.println("入力内容が不正です。r, s, pのいずれかの入力をしてください。");
				}
			} while(!checkFlg);
		} finally {
			scan.close();
		}
		
		return choice;
	};
	
	public boolean checkMyChoice(String choice) {		
		return Arrays.stream(new String[] {"r", "s", "p"}).anyMatch(choice::equals);
	}
	
	public String getRandom() {
		int rsp = (int)(Math.floor(Math.random() * 3));
		return switch(rsp) {
			case 0 -> "p";
			case 1 -> "r";
			case 2 -> "s";
			default -> "";
		};
		
	};
	
	public void playGame(String player, String computer) {
		String playerChoice = toHiragana(player);
		String computerChoice = toHiragana(computer);
		System.out.println("自分の手は" + playerChoice + ",対戦相手の手は" + computerChoice);
		
		switch(player.compareTo(computer)) {
			case 0 -> System.out.println("あいこです");
			case -1, -2, 3 -> System.out.println("自分の勝ちです");
			case 1, 2, -3 -> System.out.println("自分の負けです");
		}
	};
	
	public String toHiragana(String choice) {
		return switch(choice) {
			case "r" -> "グー";
			case "s" -> "チョキ";
			case "p" -> "パー";
			default -> "";
		};
	}

}
