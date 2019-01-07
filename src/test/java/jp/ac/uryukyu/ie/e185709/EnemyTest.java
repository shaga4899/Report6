package jp.ac.uryukyu.ie.e185709;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    /**
     * 「ランダムで手を出している」ことを確認。
     */
    @Test
    void setRandomHand() {

        Enemy ene = new Enemy("トム");
        String enemyHand = ene.setRandomHand();
        assertEquals(enemyHand, ene.getHand());
    }
}