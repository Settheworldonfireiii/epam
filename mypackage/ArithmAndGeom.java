package mypackage;

public class ArithmAndGeom{
      public static void arAndG(int a){
            int b= 100000;
            double arithm =0 ;
            double geom = 1;
            int curnum;
            

            geom = geom*(double)(a - a%b)/100000;
            curnum=(a - a%b)/100000;
            a=a%b;
            b=b/10;
            arithm+=curnum;
           
            
            geom = geom*(double)(a - a%b)/10000;
            curnum=(a - a%b)/10000;
            a=a%b;
            b=b/10;
            arithm+=curnum;
            
            
            geom = geom*(double)(a - a%b)/1000;
            curnum=(a - a%b)/1000;
            a=a%b;
            b=b/10;
            arithm+=curnum;
           
            
            geom = geom*(double)(a - a%b)/100;
            curnum=(a - a%b)/100;
            a=a%b;
            b=b/10;
            arithm+=curnum;
           
           
            geom = geom*(double)(a - a%b)/10;
            curnum=(a - a%b)/10;
            a=a%b;
            b=b/10;
            arithm+=curnum;
            
            
            arithm +=a;
            geom = geom*(double)a;
            arithm = arithm/6;
            geom= Math.pow(geom, 1.0/6);
              System.out.println("the arithmetic mean is" + arithm +", the geometric one is " + geom);

      }
}