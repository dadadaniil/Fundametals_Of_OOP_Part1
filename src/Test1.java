public class Test1 {
    static int var1 = 0;
    static int var2 = 0;

    public static int getVar1() {
        return var1;
    }

    public static void setVar1(int var1) {
        Test1.var1 = var1;
    }

    public static int getVar2() {
        return var2;
    }

    public static void setVar2(int var2) {
        Test1.var2 = var2;
    }

    static int sum() {
        return getVar1() + getVar2();
    }

    static int largestValue() {
        return Math.max(getVar1(), getVar2());
    }
}
