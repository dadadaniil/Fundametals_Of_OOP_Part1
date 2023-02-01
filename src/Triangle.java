public class Triangle {

     private int firstSide;
     private int secondSide;
     private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public int calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public int square() {
        int perimetr2 = calculatePerimeter() / 2;
        return (int) Math.sqrt(perimetr2 * (perimetr2 - firstSide) * (perimetr2 - secondSide) * (perimetr2 - thirdSide));
    }

    public Object forObjects() {
        Object obj = new Object();
        return obj;
    }

    public  void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public  void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public  void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

}
