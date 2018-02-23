package mypackage;

public class Ascension{
      public static boolean isAsc(int a){
            int dig4 = a / 1000;
            int dig3 = (a % 1000) / 100;
            int dig2  = (a %100 ) / 10;
            int dig1 =  (a%10);
            return dig4 < dig3 && dig3 < dig2 && dig2 < dig1;
      }
}