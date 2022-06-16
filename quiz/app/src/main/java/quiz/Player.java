package quiz;

public class Player {
    private int correctQuizNum;

    public Player() {
        this.correctQuizNum = 0;
    }

    //正答数:3
    public void showCorrectQuizNum() {
        //TODO:実装する。
        System.out.println("正答数:" + this.correctQuizNum);

    }

    public void setCorrectQuizNum(int correctQuizNum) {
        this.correctQuizNum = correctQuizNum;
    }

    public int getCorrectQuizNum() {
        return this.correctQuizNum;
    }
}
