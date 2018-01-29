import java.io.*;
import java.util.Scanner;
import mypackage.DinoKilo;
import mypackage.RingSquare;
import mypackage.Ascension;
import mypackage.SumAndProduct;
import mypackage.ArithmAndGeom;
import mypackage.InverseDigits;

public class Test{
	public static void main(String[] args){
           System.out.println("Testing DinoKilo");
           System.out.println("enter the number of grams for a dinosaur");
           Scanner reader = new Scanner(System.in);  
           double a = reader.nextInt();
           a = DinoKilo.kiloGram(a);
           System.out.println("the dinosaur weights " + a +"kilos");
           a=a*1000;
           a = DinoKilo.tOn(a);
           System.out.println("the dinosaur weights " + a +"tons");

           System.out.println("Testing RingSquare");
           System.out.println("enter the number r1 and r2");
           double r1, r2, squarering;
           r1 = reader.nextDouble();
           r2 = reader.nextDouble();
           squarering = RingSquare.squaRe(r1,r2);
           System.out.println(squarering);
           System.out.println("Testing Ascension");
           int f = reader.nextInt();
          System.out.println(Ascension.isAsc(f));
           System.out.println("Testing Sum and Product");
           f = reader.nextInt();
          SumAndProduct.sAndP(f);
          System.out.println("Testing Arithmetic and Geometric mean");
           f = reader.nextInt();
          ArithmAndGeom.arAndG(f);
           System.out.println("Inverse Digits");
           f = reader.nextInt();
          InverseDigits.inDig(f);
	}  
}