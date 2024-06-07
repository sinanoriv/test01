package jankengame.janken;

public class Paa extends Hand {

    @Override
    void print() {
        System.out.println("手はパーです。\n");
    }

    @Override
    boolean judge(Hand h) {
        return h instanceof Guu;
    }
}
