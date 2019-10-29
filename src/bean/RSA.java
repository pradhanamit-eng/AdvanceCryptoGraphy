package bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class RSA {
	
	public static void main(String[] args) {
		
		int p,q,n,z,d=0,e;
		int M;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Encrypt");
		M = sc.nextInt();
		System.out.println("Enter the First Prime Number:");
		p=sc.nextInt();
		System.out.println("Enter the Second Prime Number:");
		q=sc.nextInt();
		
		n = p * q ;
		//quotient function z
		z=(p-1)*(q-1);
		System.out.println("Quotient Function:"+" "+z);
		
		
		//calculation the value of e such that gcd(e,z)==1 and 1<e<z
		for(e=2;e<z;e++)
		{
			if(gcd(e,z)==1)
			{
				break;
			}
		}
		System.out.println("GCD->e="+e);
		
		//calculation of d d= e^-1 mod z
		for (int i = 0; i <= 9; i++) 
		{
			int x= 1+ (i*z);
			if(x%e == 0)
			{
				d=x/e;
				break;
			}
			
		}
		System.out.println("The Value of d="+d);
		//-----Encryption-----
		double C;
		BigInteger MBack;
		
		C = (Math.pow(M, e))% n;
		System.out.println("Encrypted Message is :"+C);
		
		BigInteger N = BigInteger.valueOf(n);
		BigInteger c = BigDecimal.valueOf(C).toBigInteger();
		
		//------Decryption-------
		
		MBack = (c.pow(d)).mod(N);
		System.out.println("Decrypted Message is :"+MBack);
	}
	static int gcd(int e,int z)
	{
		if(e==0)
			return z;
		else
			return gcd(z%e,e);
	}

}
