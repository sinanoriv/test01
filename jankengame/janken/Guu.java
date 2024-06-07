package jankengame.janken;

public class Guu extends Hand{
    
    @Override
    void print() {
        System.out.println("手はグーです。\n");
    }

    @Override
    boolean judge(Hand h){
        return h instanceof Choki;  //グーはチョキにかつ
    }

}
