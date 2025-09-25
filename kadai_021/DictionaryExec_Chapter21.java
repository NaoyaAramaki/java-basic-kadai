package kadai.kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("banana");
		words.add("grape");
		words.add("orange");
		
		for(int i = 0; i < words.size(); i++) {
			String meaning = dict.getDict().get(words.get(i));
			if(meaning == null) {
				meaning = "は辞書に存在しません";
			} else {
				meaning = "の意味は" + meaning;
			}
			System.out.println(words.get(i) +  meaning);
		}

	}

}
