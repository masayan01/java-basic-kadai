package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21{
   
    public void search(String[] words){

        String result = "";

    HashMap<String,String> map = new HashMap<>();
        map.put("apple","りんご");
        map.put("peach","桃");
        map.put("banana","バナナ");
        map.put("lemon","レモン");
        map.put("pear","梨");
        map.put("kiwi","キウイ");
        map.put("strawberry","いちご");
        map.put("grape","ぶどう");
        map.put("muscat","マスカット");
        map.put("cherry","さくらんぼ");
        

        for(int i = 0; i < words.length; i++ ){
        result = map.get(words[i]);
        if (result == null) {
            result = words[i] + "は辞書にありません。";
          } else {
            result = words[i] + "の意味は" + result + "です。";
    }
    System.out.println(result);
}
}
}