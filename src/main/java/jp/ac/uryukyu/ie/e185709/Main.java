package jp.ac.uryukyu.ie.e185709;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Referee ref = new Referee();
        Scanner scanner = new Scanner(System.in);
        String myDecideHand, enemyHand, result;


        System.out.print("自分の名前を入力してください：");
        Me me = new Me(scanner.next());
        System.out.print("相手の名前を入力してください：");
        Enemy ene = new Enemy(scanner.next());

        me.handSetter();
        ene.setRandomHand();

        ref.pon(me.getMyHand(),ene.getHand());
        myDecideHand = me.decideHand();
        enemyHand = ene.getHand();

        result = ref.hantei(myDecideHand, enemyHand);


        System.out.println(result);
    }
}
