package bean;

import java.util.Scanner;

public class VigenereCipher {
	
	public static void main(String[] args) {
		String plaintxt;
		int key;
		int Pi=0,Ci=0;
		VigenereCipher v = new VigenereCipher();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Plain Text:");
		plaintxt = sc.nextLine();
		System.out.println("Enter Key:");
		key = sc.nextInt();
		//System.out.println(plaintxt.length());
		//Encryption
		System.out.println("------Encryption---Cipher Text----------");
		for (int i = 0; i < plaintxt.length(); i++) 
		{
			Pi = ((plaintxt.charAt(i))-97);
			Ci = (key + Pi)%26;	
				System.out.print((char) (Ci+97));	
		}
		System.out.println("\n");
		System.out.println("-----Decription-------Plain Text---------");
		for (int i = 0; i < plaintxt.length(); i++) 
		{
			Pi = v.alphabetToNumber(plaintxt.charAt(i));
			Ci = (key + Pi)%26;
			Pi = (Ci-key)%26;
			if(Pi<0)
			{
				Pi=Pi+26;
				System.out.print(v.numberToAlphabet(Pi));
			}
			else {
				System.out.print(v.numberToAlphabet(Pi));
			}
		}
	}
	public int alphabetToNumber(char a) {
        return a - 97;
    }

    public char numberToAlphabet(int i) {
        return (char) (i + 97);
    }
	

}