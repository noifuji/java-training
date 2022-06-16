/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package janken;

import java.io.*;

public class Main {

  public static void main(String[] args) {
    Player user = new Player("あなた");
    Player com = new Player("あいて");
    Game game = new Game();

    //入力指示表示
    System.out.println("1.グー");
    System.out.println("2.チョキ");
    System.out.println("3.パー");
    System.out.println("あなたの手を選択してください。>");

    //ユーザ入力
    String input = null;
    try {
      BufferedReader inputuser = new BufferedReader(
        new InputStreamReader(System.in)
      );
      input = inputuser.readLine();
    } catch (IOException e) {
      System.out.print("システムエラー");
      System.exit(0);
      return;
    }

    if (input == null) {
      System.out.print("1-3の値を入力してください。");
      System.exit(0);
      return;
    }

    if (input.equals("1")) {
      user.setHand(new Gu());
    } else if (input.equals("2")) {
      user.setHand(new Choki());
    } else if (input.equals("3")) {
      user.setHand(new Pa());
    } else {
      System.out.print("1-3の値を入力してください。");
      System.exit(0);
      return;
    }

    //comの手を生成
    com.createRandomHand();

    //勝敗決定
    int result = game.judge(user, com);

    //結果表示
    //あなたの手:グー
    //相手の手:パー
    //結果:あなたの負け
    System.out.println(
      user.getPlayerName() + "の手:" + user.getHand().getHandName()
    );
    System.out.println(
      com.getPlayerName() + "の手:" + com.getHand().getHandName()
    );
    if (result < 0) {
      System.out.println("結果:" + user.getPlayerName() + "の負け");
    } else if (result > 0) {
      System.out.println("結果:" + user.getPlayerName() + "の勝ち");
    } else {
      System.out.println("結果:あいこ");
    }
  }
}