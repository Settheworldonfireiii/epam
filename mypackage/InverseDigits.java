package mypackage;

public class InverseDigits{
      public static void inDig(int a){
            int b= 1000000;
            int curnum;
            int invrs;
            for(int i =0;i<6;i++){
                  curnum =a - a%b;
                  a=a%b;
                  b=b/10;
                  invrs =curnum*(int)Math.pow(10, i);
            }
            invrs = a * (int)Math.pow(10, 7);
            System.out.println("the inverse number is "  + invrs);

      }
}