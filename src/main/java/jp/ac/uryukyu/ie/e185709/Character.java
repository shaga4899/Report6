package jp.ac.uryukyu.ie.e185709;
/**
 * 元となるキャラクターのクラス。
 *  String name; //自分の名前
 *  String[] hand; //自分の出した手
 */

public class Character {

    public String name;
    public String hand;

    public Character(String name){
        this.name = name;
    }

    public String getHand(){return this.hand;}
    public void handSetter(String hand){
        this.hand = hand;
    }

    public String getName(){return this.name;}

}
