package mypackage;

public class ArithmAadGeom{
      public static double ariThm(int a) {
        int dig1 = a / 100000;
        int dig2 = a % 100000 / 10000;
        int dig3= a % 10000 / 1000;
        int dig4 = a % 1000 / 100;
        int dig5 = a % 100 / 10;
        int dig6 = a % 10;
        return (dig6 + dig5 + dig4 + dig3+ dig2 + dig1) / 6.0;
    }

     public static double geOm(int a) {
        int dig1 = a / 100000;
        int dig2 = a % 100000 / 10000;
        int dig3= a % 10000 / 1000;
        int dig4 = a % 1000 / 100;
        int dig5 = a % 100 / 10;
        int dig6 = a % 10;
        return Math.pow((dig6 * dig5 * dig4 * dig3 * dig2 * dig1) , 1/6.0);
    }
}