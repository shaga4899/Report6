package jp.ac.uryukyu.ie.e185709;
import java.util.Scanner;

/**
 * 自分のクラス。
 *  String name; //自分の名前
 *  String[] hand; //自分の出した手
 */

public class Me extends Character{
    Scanner scanner = new Scanner(System.in);
    private String[] hand;

    /**
     * コンストラクタ。名前を指定する。
     * @param name
     */
    public Me(String name) {
        super(name);
    }

    /**
     * 左手と右手を決めるためのメソッド
     */
    public void handSetter() {
        System.out.println("右手は何にする？");
        String right= scanner.next();
        System.out.println("左手は何にする？");
        String left = scanner.next();

        String[] str = {left, right};
        this.hand = str.clone();
    }

    /**
     * 右手と左手を返すメソッド
     */
    public String[] getMyHand(){
        return this.hand;
    }

    /**
     * 左手と右手のどちらにするかを決めるためのメソッド
     */
    public String decideHand(){
        System.out.println("右手：" + this.hand[0]);
        System.out.println("左手：" + this.hand[1]);
        System.out.println("どっちにする？右手なら0,左手なら1");

        return this.hand[scanner.nextInt()];
    }
}
