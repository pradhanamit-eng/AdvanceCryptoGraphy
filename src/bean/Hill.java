package bean;

import java.util.Arrays;
import java.util.Scanner;

public class Hill 
{
	public static void main(String[] args) {
		int i,j;
		float det=0;
		float mat[][] = new float[3][3];
		String text;
		
		Scanner sc = new Scanner(System.in);
		
		//--Input for matrix-------
		System.out.println("Enter Elements od Matrix Row Wise:");
		for ( i = 0; i < 3; i++) 
			for ( j = 0; j < 3; j++) 
				mat[i][j] = sc.nextFloat();
		System.out.println("Input Matrix");
		for ( i = 0; i < 3; i++) 
		{
			for ( j = 0; j < 3; j++)
			{
				System.out.print("|"+mat[i][j]+" |");
			}
			System.out.println("\n");
		}
		//----Enter Plain text--------	
		System.out.println("Enter the Plain Text Max Length ~|3|~:");
		text = sc.next();
		System.out.println("Plain Text:"+text);
		
		//Encryption  Start
		
		System.out.println("------Tex[0]"+((text.charAt(0))-97));
		System.out.println("------Tex[1]"+((text.charAt(1))-97));
		System.out.println("------Tex[2]"+((text.charAt(2))-97));
		
		int el1 = 0 ,el2= 0,el3= 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int row1 = 0;
		for ( i = 0; i < 3; i++) 
		{
			
				a = (int) ((mat[0][i] * ((text.charAt(0))-97)) % 26 ) ;
				i = i+1;
				b = (int) ((mat[0][i] * ((text.charAt(1))-97)) % 26 ) ;
				i = i+1;
				c = (int) ((mat[0][i] * ((text.charAt(2))-97)) % 26 ) ;
				row1 = a+b+c;
				el1 = row1 % 26 ;
				if(el1<0)
				{
					el1 = el1+26;
				}
				else
				{
					el1 = el1;
				}
				break;
		}	
		System.out.println("RoW Element"+row1);
		System.out.println("El1:"+(char)(el1+97));
		
		int d = 0;
		int e = 0;
		int f = 0;
		int row2 = 0;
		for ( i = 0; i < 3; i++) 
		{
			
				d = (int) ((mat[1][i] * ((text.charAt(0))-97)) % 26 ) ;
				i = i+1;
				e = (int) ((mat[1][i] * ((text.charAt(1))-97)) % 26 ) ;
				i = i+1;
				f = (int) ((mat[1][i] * ((text.charAt(2))-97)) % 26 ) ;
				row2 = d+e+f;
				el2 = row2 % 26 ;
				if(el2<0)
				{
					el2 = el2+26;
				}
				else
				{
					el2 = el2;
				}
				break;
		}	
		System.out.println("RoW Element"+row2);
		System.out.println("El2:"+(char)(el2+97));
		
		
		int g = 0;
		int h = 0;
		int m = 0;
		int row3 = 0;
		for ( i = 0; i < 3; i++) 
		{
			
				g = (int) ((mat[2][i] * ((text.charAt(0))-97)) % 26 ) ;
				i = i+1;
				h = (int) ((mat[2][i] * ((text.charAt(1))-97)) % 26 ) ;
				i = i+1;
				m = (int) ((mat[2][i] * ((text.charAt(2))-97)) % 26 ) ;
				row3 = g+h+m;
				el3 = row3 % 26 ;
				if(el3<0)
				{
					el3 = el3+26;
				}
				else
				{
					el3 = el3;
				}
				break;
		}	
		
		System.out.println("RoW Element"+row3);
		System.out.println("El3:"+(char)(el3+97));
		
		//Encryption end
		
		
		//determinant of Matrix----
		for ( i = 0; i < 3; i++) 
			det = det 
			+ (mat[0][i] * (mat[1][(i + 1) % 3] * mat[2][(i + 2) % 3] 
			- mat[1][(i + 2) % 3] * mat[2][(i + 1) % 3]));
		
		System.out.println("Determinant:|:"+det);
		
		//---Inverse of Matrix
		float[][] invMatrix = new float[3][3];
		System.out.println("Inverse of Matrix:");
		for (i = 0; i < 3; ++i) {
			for (j = 0; j < 3; ++j)
				invMatrix[i][j] =(((mat[(j + 1) % 3][(i + 1) % 3] * mat[(j + 2) % 3][(i + 2) % 3])
						- (mat[(j + 1) % 3][(i + 2) % 3] * mat[(j + 2) % 3][(i + 1) % 3])) / det) ;
			System.out.print("\n");
		}
		for (i = 0; i < 3; ++i) {
			for (j = 0; j < 3; ++j)
			{
				System.out.print(invMatrix[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
		
		
	}

}
