package mypackage;

public class Ascension{
      public static void isAsc(int a){
            if(((a - a%1000)/1000)<(a%1000-(a%1000)%100 )){
                   a=a%1000;
                   if(((a - a%100)/100)<(a%100-(a%100)%10 )){
                   	a=a%100;
                   	 if(((a - a%10)/10)<(a%10)){
                           System.out.println("yes");
                   	 }
                   	 else{System.out.println("nope");}
                   }
                   else{System.out.println("nope");}
            }
            else{System.out.println("nope");}

      }
}