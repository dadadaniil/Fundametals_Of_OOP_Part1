import java.util.Scanner;

public class Test2 {

    static int var1;
    static int var2;

    Test2() {
        var1 = 0;
        var2 = 0;
    }

    Test2(int int1, int int2) {
        var1 = int1;
        var2 = int2;
    }

    public static int getVar1() {
        return var1;
    }

    public static void setVar1(int var1) {
        Test2.var1 = var1;
    }

    public static int getVar2() {
        return var2;
    }

    public static void setVar2(int var2) {
        Test2.var2 = var2;
    }
}
