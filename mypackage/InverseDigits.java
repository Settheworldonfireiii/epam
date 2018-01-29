package mypackage;

public class InverseDigits{
      public static void inDig(int a){
            int b= 1000000;
            int curnum;
            int invrs = 0;

            curnum =(a - a%b)/1000000;
            
            a=a%b;
            b=b/10;
            invrs +=curnum*(int)Math.pow(10, 0);
            

             curnum =(a - a%b)/100000;
             
            a=a%b;
            b=b/10;
            invrs +=curnum*(int)Math.pow(10, 1);
            

             curnum =(a - a%b)/10000;
             
            a=a%b;
            b=b/10;
            invrs +=curnum*(int)Math.pow(10, 2);
            
             curnum =(a - a%b)/1000;
             
            a=a%b;
            b=b/10;
            invrs +=curnum*(int)Math.pow(10, 3);
            

             curnum =(a - a%b)/100;
             
            a=a%b;
            b=b/10;
            invrs +=curnum*(int)Math.pow(10, 4);
           

             curnum =(a - a%b)/10;
             
            a=a%b;
            b=b/10;
            invrs +=curnum*(int)Math.pow(10, 5);
            
            
            invrs += a * (int)Math.pow(10, 6);
            System.out.println("the inverse number is "  + invrs);

      }
}