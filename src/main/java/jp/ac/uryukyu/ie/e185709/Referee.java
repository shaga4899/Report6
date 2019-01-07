package jp.ac.uryukyu.ie.e185709;
/**
 * キャラクターメソッド以外で使う処理メソッドを記述しているクラス。
 */
public class Referee {
    /**
     * ジャンケンの判定を行うメソッド
     */
    public String hantei(String myHand, String enemyHand){
        String result;

        if(myHand == "グー"){
            if(enemyHand == "グー"){
                result = "あいこ!";
            }else if(enemyHand == "チョキ"){
                result = "あなたの勝ち！";
            }else{
                result = "相手の勝ち!";
            }
        }else if(myHand == "チョキ"){
            if(enemyHand == "グー"){
                result = "相手の勝ち!";
            }else if(enemyHand == "チョキ"){
                result = "あいこ！";
            }else{
                result = "あなたの勝ち!";
            }
        }else{
            if(enemyHand == "グー"){
                result = "あなたの勝ち!";
            }else if(enemyHand == "チョキ"){
                result = "相手の勝ち!";
            }else{
                result = "あいこ！";
            }
        }

        return result;
    }

    /**
     * ジャンケンで手を出すメソッド。
     */
    public void pon(String[] myHands,String enemyHand){

        System.out.println("二人「ジャン・ケン・ポン！」");
        for(int x = 0; x < myHands.length; x++){
            System.out.print("私の手" + x + " ： ");
            System.out.println(myHands[x]);
        }
        System.out.println("相手の手は" + enemyHand);
        System.out.println("自分「(ニヤリ...)」");
    }
}
