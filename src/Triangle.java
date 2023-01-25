public class Triangle {

    static int firstSide;
    static int secondSide;
    static int thirdSide;

    static int permimetr() {
        return firstSide + secondSide + thirdSide;
    }

    static int square() {
        int perimetr2 = permimetr() / 2;
        return (int) Math.sqrt(perimetr2 * (perimetr2 - firstSide) * (perimetr2 - secondSide) * (perimetr2 - thirdSide));
    }

    static Object forObjects() {
        Object obj = new Object();
        return obj;
    }

    public static void setFirstSide(int firstSide) {
        Triangle.firstSide = firstSide;
    }

    public static void setSecondSide(int secondSide) {
        Triangle.secondSide = secondSide;
    }

    public static void setThirdSide(int thirdSide) {
        Triangle.thirdSide = thirdSide;
    }

}
