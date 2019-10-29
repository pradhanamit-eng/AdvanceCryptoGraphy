package bean;

import java.util.Arrays;
import java.util.Scanner;

public class HillCipher {
	static int a;
	static int b;
	static int c;
	static int d;
	static String Pi;
	static String newPi;
	static String newPiWithoutSpace;
	static String plainTxt[] = null;
	static char text;
	static char plain[];
	static int C1, C2;
	static int p1, p2;

	public static void main(String[] args) {
		System.out.println("-----Hill Cipher-----");
		System.out.println("Fix the values of a=4,b=5,c=3,d=4");
		HillCipher hill = new HillCipher();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a:");
		a = sc.nextInt();
		System.out.println("Enter the Value of b:");
		b = sc.nextInt();
		System.out.println("Enter the Value of c:");
		c = sc.nextInt();
		System.out.println("Enter the Value of d:");
		d = sc.nextInt();
		if ((a * d - b * c) % 26 == 1) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("-------------GCD==1 Found---------");
			System.out.println("\n");
			System.out.println("Enter the Plain Text:");
			Pi = sc1.nextLine();
			newPi = Pi.trim();
			newPiWithoutSpace = newPi.replaceAll(" ", "");
			
			int n;
			System.out.println("Enter the Even Index Value to Generate Cipher Text:");
			n=sc.nextInt();
			if(newPiWithoutSpace.length()%2 != 0)
			{
				newPiWithoutSpace = newPiWithoutSpace+"x";
				String[] strArr = newPiWithoutSpace.split("");
				System.out.println("Given Plain Text For Encryption"+Arrays.toString(strArr));
				
				String myNewArray = null;
				
				for (int i = n; i < strArr.length; i++) 
				{
					myNewArray = strArr[i].concat(strArr[i+1]);
					System.out.println(myNewArray);
					text = myNewArray.charAt(0);
					p1 = text - 97;
					System.out.println(text);
					text = myNewArray.charAt(1);
					p2 = text - 97;
					System.out.println(text);
					
					//cipher text
					C1 = (a * p1 + b * p2) % 26;
					C2 = (c * p1 + d * p2) % 26;
					
					//plain text
					p1 = (4*C1-5*C2) % 26;
					if(p1<0)
					{
						p1=p1+26;
					}
					else {
						p1=p1;
					}
					p2 = (4*C2-3*C1) % 26;
					if(p2<0)
					{
						p2=p2+26;
					}
					else {
						p2=p2;
					}
					
					System.out.println("---Cipher Text is:");
					System.out.print((char) (C1 + 97));
					System.out.print((char) (C2 + 97));
					System.out.println("\n");
					System.out.println("---Plain Text is:");
					System.out.print((char) (p1 + 97));
					System.out.print((char) (p2 + 97));
					break;	
				}
			}
			else
			{
				newPiWithoutSpace = newPiWithoutSpace;
				String[] strArr = newPiWithoutSpace.split("");
				System.out.println("Given Plain Text For Encryption"+Arrays.toString(strArr));
				
				String myNewArray = null;
				
				for (int i = n; i < strArr.length; i++) 
				{
					myNewArray = strArr[i].concat(strArr[i+1]);
					System.out.println(myNewArray);
					text = myNewArray.charAt(0);
					p1 = text - 97;
					System.out.println(text);
					text = myNewArray.charAt(1);
					p2 = text - 97;
					System.out.println(text);
					
					//cipher text
					C1 = (a * p1 + b * p2) % 26;
					C2 = (c * p1 + d * p2) % 26;
					
					//plain text
					p1 = (4*C1-5*C2) % 26;
					if(p1<0)
					{
						p1=p1+26;
					}
					else {
						p1=p1;
					}
					p2 = (4*C2-3*C1) % 26;
					if(p2<0)
					{
						p2=p2+26;
					}
					else {
						p2=p2;
					}
					
					System.out.println("---Cipher Text is:");
					System.out.print((char) (C1 + 97));
					System.out.print((char) (C2 + 97));
					System.out.println("\n");
					System.out.println("---Plain Text is:");
					System.out.print((char) (p1 + 97));
					System.out.print((char) (p2 + 97));
					break;
				}	
			}

		} else {
			System.out.println("Enter Values of a,b,c,d such that GCD(ad-bc,26) Should be == 1");
		}

	}

}
