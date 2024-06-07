package jankengame.janken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonPlayer extends Player {
    private BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

    @Override
    Hand selectHand() {
        System.out.println("■あなたの番です。​");
        System.out.print("あなたの手を入力してください\n1: グー\n2: チョキ\n3: パー\n入力:");
        try {
            int choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    hand = new Guu();
                    break;
                case 2:
                    hand = new Choki();
                    break;
                case 3:
                    hand = new Paa();
                    break;
                default:
                    return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hand;
    }
}
