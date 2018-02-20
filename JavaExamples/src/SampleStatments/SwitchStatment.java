package SampleStatments;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n value: ");
		
		int n = sc.nextInt();
		
		switch(n){
		case 1:
			System.out.println("one");
			break;
		case 15:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("we found it and it's : " +n);
			break;
		default:
			System.out.println("No match");
		
		
		}
	}

}
