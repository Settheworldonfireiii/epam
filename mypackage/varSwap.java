import java.io.*;
import java.util.Scanner;

public class varSwap{
	public static void main(String[] args){
	int a, b;
	Scanner reader = new Scanner(System.in);
        String s = "Enter a number: "
        System.out.println(s);
        a = reader.nextInt();
        System.out.println(s);
        b = reader.nextInt();
        a=a-b;
        b=b+a;       
        a=b-a;
        System.out.println(a);
        System.out.println(b);
                	}

}