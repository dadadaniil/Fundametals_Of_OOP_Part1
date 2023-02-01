import java.util.ArrayList;

public class Counter {
    private boolean exactDirection = true;
    //    TRUE IS INCREASE
    private int position = 0;


    public void increaseOrDecreaseBy1() {
        if (exactDirection) {
            position++;
            return;
        }
        position--;
    }

    public boolean isExactDirection() {
        return exactDirection;
    }

    public void setExactDirection(boolean exactDirection) {
        this.exactDirection = exactDirection;
    }

    public int getPosition() {
        return position;
    }

    public Counter(boolean exactDirection, int position) {
        this.exactDirection = exactDirection;
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
