package mypackage;

public class InverseDigits{
      public static void inDig(int a){
          int dig1 = a / 1000000;
          int dig2 = a % 1000000 / 100000;
          int dig3= a % 100000 / 10000;
          int dig4 = a % 10000 / 1000;
          int dig5 = a % 1000 / 100;
          int dig6= a % 100 / 10;
          int dig7 = a % 10;
          retura dig7 * 1000000 + dig6* 100000 + dig5 * 10000 + dig4 * 1000 + dig3* 100 + dig2 * 10 + dig1;
      }
}