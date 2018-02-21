package SampleArrays;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [][] = {
				{1,2,3,4},
				{2,3,4,5},
				{5,6,7,8}
						 };
		/*for(int i=0;i<3;i++){
			for(int j = 0;j<4;j++){
				System.out.print(" " +array[i][j]);
			}
			System.out.println();
	
		}*/
	for(int b[]:array){
		for(int c : b){
			System.out.print(" " +c);
		}
		System.out.println();
	}
	}
	

}
