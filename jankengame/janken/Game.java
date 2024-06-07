package jankengame.janken;

public class Game {
    //フィールドの宣言
    private Player[] players;
    private int round;
    private boolean[] whichWon;

    public Game() {
        //プレイヤーを２人宣言して自分とCPUをいれる
        players = new Player[2];
        players[0] = new PersonPlayer();
        players[1] = new CPUPlayer();
        //使途不明
        whichWon = new boolean[2];
    }

    public void play() {

        round = 1;
        System.out.println("じゃんけんを始めます");

        while (true) {
            System.out.println(round + "回戦\n");
            //handクラスのplayerhandを呼び出す
            Hand playerHand = players[0].selectHand();
            
            //期待した値以外は処理を終了する
            if (playerHand == null) {
                System.out.println("入力値が不正です。終了します。");
                return;
            }
            //自分の選んだ手を表示
            playerHand.print();

            //cpuの処理
            Hand cpuHand = players[1].selectHand();
            //cpuの手
            cpuHand.print();

            System.out.println("■判定");
            whichWon[0] = playerHand.judge(cpuHand);
            whichWon[1] = cpuHand.judge(playerHand);
            if (whichWon[0]) {
                System.out.println("〇あなたの勝ちです​\n");
            } else if (whichWon[1]) {
                System.out.println("●CPUの勝ちです​\n");
            } else {
                System.out.println("△あいこです​\n");
            }
            round++;
        }
    }
}
