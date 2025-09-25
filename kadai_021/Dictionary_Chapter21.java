package kadai.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dict = new HashMap<>();
	Dictionary_Chapter21() {
		dict.put("apple", "りんご");
		dict.put("peach", "桃");
		dict.put("banana", "バナナ");
		dict.put("lemon", "レモン");
		dict.put("pear", "梨");
		dict.put("kiwi", "キウィ");
		dict.put("strawberry", "いちご");
		dict.put("grape", "ぶどう");
		dict.put("muscat", "マスカット");
		dict.put("cherry", "さくらんぼ");
		
	}
	
	public HashMap<String, String> getDict() {
		return this.dict;
	}
	

}
