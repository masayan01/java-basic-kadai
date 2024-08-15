package kadai_026;

import java.util.Scanner;
import java.util.HashMap;

public class Jyanken_Chapter26 {
 
    public String getMyChoice(){
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("自分の手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("グーはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.next();

        if((input.equals("r"))||(input.equals("s"))||(input.equals("p"))){
            scanner.close();
            return input;
        } else{
            continue;
        }
    }    
}



    public String getRandom(){
        String[] aite = {"r","s","p"};
        int t = (int)(Math.floor(Math.random()*2));

        return aite[t];
    }

    public void playGame(){
        HashMap<String,String>choice = new HashMap<>();
            choice.put("r","グー");
            choice.put("s","チョキ");
            choice.put("p","パー");

            String me = this.getMyChoice();
            String you = this.getRandom();

            System.out.println("自分の手は" + choice.get(me) + "対戦相手の手は" + choice.get(you));

            // あいこ
            if((me.equals(you))){
                System.out.println("あいこです");
            }else if((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r"))){
                    System.out.println("自分の勝ちです");
            }else{
                System.out.println("自分の負けです");
            }
            


    }
}
