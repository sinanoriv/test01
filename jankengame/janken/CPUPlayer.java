package jankengame.janken;

import java.util.Random;

public class CPUPlayer extends Player {

    private Random rand = new Random();

    @Override
    Hand selectHand() {
        System.out.println("■CPUの番です");
        int choice = rand.nextInt(3);
        switch (choice) {
            case 0:
                hand = new Guu();
                break;
            case 1:
                hand = new Choki();
                break;
            case 2:
                hand = new Paa();
                break;
        }
        return hand;
    }
}
