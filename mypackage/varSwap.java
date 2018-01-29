import java.io.*;
import java.util.Scanner;

public class varSwap{
	public static void main(String[] args){
		int a, b;
		Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a number: ");
        a = reader.nextInt();
        System.out.println("Enter a number: ");
        b = reader.nextInt();
        a=a+b;
        b=b-a;
        b=b*(-1);
        a=a-b;
        System.out.println(a);
        System.out.println(b);
                	}

}