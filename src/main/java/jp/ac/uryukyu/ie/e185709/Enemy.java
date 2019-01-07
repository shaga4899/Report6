package jp.ac.uryukyu.ie.e185709;
import java.util.Random;
/**
 * 相手のクラス。
 *  String name; //相手の名前
 *  String hand; //相手の出した手
 */


public class Enemy extends Character{
    Random rnd = new Random();


    public Enemy(String name){
        super(name);
    }

    public String setRandomHand(){
        int randomCnt = rnd.nextInt(3);

        switch(randomCnt){
            case 0:
                this.hand = "グー";
                break;
            case 1:
                this.hand = "チョキ";
                break;
            case 2:
                this.hand = "パー";
                break;
            default:
                System.out.println("エラー");
        }

        return this.hand;
    }
}
