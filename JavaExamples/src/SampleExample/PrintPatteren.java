package SampleExample;

import java.util.Scanner;

public class PrintPatteren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in a pyramid :");
		
		int n=sc.nextInt();
		
		System.out.println("Patteren");
		
/*		
 * equal Triangle
 * for(int i=1; i<=n; i++){
			for(int k=n-1;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				
				
					System.out.print(j+" ");
			}
					System.out.println();
				}*/
		
	/*right angle triangle
	 * 	for(int i=1; i<=n; i++){
			
			for(int j=1; j<=i; j++){
				
				
					System.out.print(j+" ");
			}
					System.out.println();
				}*/
	/*	square
	 * for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n; j++){
				
				
					System.out.print(j+" ");
			}
					System.out.println();
				}*/
		/*n=5 
				5
	   4
	  34
	 234
	1234			1 4*/
		for(int i=n;i>=1;i--){
			
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--){
			System.out.print(k+"");
		}
				System.out.println();
	}
}
}
			
			
	

