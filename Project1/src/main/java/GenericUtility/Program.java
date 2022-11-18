package GenericUtility;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.Length;

public class Program {
public static void main(String[] args) {
	System.out.println("Enter the value");
	Scanner sc=new Scanner(System.in);
	int value=sc.nextInt();
	
	for(int i=0;i<value;i++) {
		System.out.print(i);
	}
	
}
}
