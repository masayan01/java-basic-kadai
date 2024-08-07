package Kadai_018;

abstract public class Kato_Chapter18 {
    public String familyName = "加藤";
    protected String givenName;
    public String address = "住所は東京都中野区〇×です";

    public void commonlntroduce(){
        System.out.println("名前は"+ familyName + this.givenName +"です");
        System.out.println(address);
    }

    public void setgivenName(String givenName){
        this.givenName = givenName;
    }
    
    abstract public void eachintroduce();

    public void execIntroduce(){
        commonlntroduce();
        eachintroduce();
    }

}
