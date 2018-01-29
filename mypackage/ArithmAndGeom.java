package mypackage;

public class ArithmAndGeom{
      public static void arAndG(int a){
            int b= 100000;
            int arithm =0 ;
            double geom = 1;
            int curnum;
            for(int i =0;i<5;i++){
                  curnum=a - a%b;
                  a=a%b;
                  b=b/10;
                  arithm+=curnum;
                  geom = geom*curnum;
            }
            arithm +=a;
            geom = geom*a;
            arithm = arithm/6;
            geom= Math.pow(geom, 1/6);
              System.out.println("the sum is" + arithm +", the product is " + geom);

      }
}