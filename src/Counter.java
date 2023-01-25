public class Counter {
    static boolean exactDirection=true;
    //    TRUE IS INCREASE
    static int position=0;


    static void increaseOrDecreaseBy1(){
        if (exactDirection){
            position++;
            return;
        }
        position--;
    }

    public static boolean isExactDirection() {
        return exactDirection;
    }

    public static void setExactDirection(boolean exactDirection) {
        Counter.exactDirection = exactDirection;
    }

    public static int getPosition() {
        return position;
    }

    public static void setPosition(int position) {
        Counter.position = position;
    }
}
