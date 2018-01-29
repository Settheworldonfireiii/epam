package mypackage;

public class Ascension{
      public static boolean isAsc(int a){
            return ((((a%1000)/100)>(a/1000))&&((((a%1000)%100)/10)>((a%1000)/100))&&((((a%1000)%100)%10)>(((a%1000)%100)/10)));

      }
}