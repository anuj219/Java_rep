package main;
import java.util.Scanner;
// local variable should always be initialized.
public class matrix {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[][] A= {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		int[][] B = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
	
		
		System.out.println("Enter the numbers for A matrix :");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the numbers for B matrix :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		System.out.println("   \n   \n  \n");
		matrix m = new matrix();
		m.multiplication(A,B);
	}
	
	void addition(int[][] A, int[][] B) {
		int[][] C = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				C[i][j] = A[i][j] + B[i][j]; 
			}
		}
		
		System.out.println("\n\n\n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" "+C[i][j]);
			}
			System.out.println();
		}
	}
	//	1,2,3    1,1,1
	//	1,1,1,	 1,1,1
	//	1,1,1    1,1,1
	
	void multiplication(int[][] A, int[][] B)
	{
		int[][] D = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		
		for(int i = 0; i<3; i++)
		{
			for(int z = 0; z<3; z++) {
				int sum1 = 0;
				for(int j = 0; j<3; j++)
				{
					sum1 = sum1 + A[i][j] * B[j][z];
					System.out.println("aij = "+A[i][j]);
					System.out.println("bjk = "+B[i][j]);
					System.out.println("sum1 = "+sum1);
				}
				D[i][z] = D[i][z] + sum1;
			}
			
			
			System.out.println("\n\n\n");
			for(int d=0; d<3; d++) {
				for(int v=0; v<3; v++) {
					System.out.print(" "+D[d][v]);
				}
				System.out.println();
			
			}
		
		}
	
	}
}



//sir's code
//void multiplication(int[][] A,int[][] B) {
//	int[][] C= {
//			{0,0,0},
//			{0,0,0},
//			{0,0,0}
//			};
//	
//	for(int i=0;i<3;i++) {
//		for(int j=0;j<3;j++) {
//			for(int k=0;k<3;k++) {
//				C[i][j]=C[i][j]+A[i][k]*B[k][j];
//		}}}
//	
//	System.out.println("Matrix multiplication: ");
//	for(int i=0;i<3;i++) {
//		for(int j=0;j<3;j++) {
//			System.out.print(" "+C[i][j]);
//		}
//		System.out.println();
//	
//}
//}



