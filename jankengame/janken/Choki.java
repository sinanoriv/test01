package jankengame.janken;

public class Choki extends Hand {

    @Override
    void print() {
        System.out.println("手はチョキです。\n");
    }

    @Override
    boolean judge(Hand h) {
        return h instanceof Paa;
    }

}
