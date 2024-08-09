package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter {

    public static void main(String[] args){

    HashMap<String,String> map = new HashMap<String,String>();
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

        print(map,"apple");
        print(map,"banana");
        print(map,"grape");
        print(map,"orange");

    }

    public static void print(HashMap<String,String>map,String key){
        if(map.containsKey(key)){
            System.out.println(key + "の意味は"+ map.get(key));
        }else{
            System.out.println(key + "は見つかりません。");
        }

    }
    }
