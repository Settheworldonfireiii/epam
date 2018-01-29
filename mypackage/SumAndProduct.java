package mypackage;

public class SumAndProduct{
      public static void sAndP(int a){
            int b= 10000;
            int  sum =0 ;
            int prod = 1;
            int currnum;
            for(int i =0;i<4;i++){
                  currnum =a - a%b;
                  a=a%b;
                  b=b/10;
                  sum+=currnum;
                  prod = prod*currnum;
            }
            sum+=a;
            prod = prod* a;
              System.out.println("the sum is" + sum +", the product is " + prod);

      }
}