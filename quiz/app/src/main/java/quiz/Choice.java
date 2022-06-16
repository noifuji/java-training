package quiz;

public class Choice {
    private int index;
    private String text;

    public Choice(int index, String text) {
        this.index = index;
        this.text = text;
    }

    public int getIndex() {
        return this.index;
    }

    public String getText() {
        return this.text;
    }
}
