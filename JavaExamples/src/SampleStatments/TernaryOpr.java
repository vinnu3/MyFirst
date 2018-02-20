package SampleStatments;

import java.util.Scanner;

public class TernaryOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n value: ");
		
		int n = sc.nextInt();
		
System.out.println("Enter the m value: ");
		
		int m = sc.nextInt();
		
		 n = m<n?m:n;
		System.out.println(n);
	}

}
