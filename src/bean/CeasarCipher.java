package bean;

import java.util.Scanner;

public class CeasarCipher {
	public static void main(String[] args) 
	{
		String msg;
		String enc_msg = "";
		int key;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Message:");
		msg = sc.next();
		
		System.out.println("Enter key:");
		key = sc.nextInt();
		
		//------------encryption
		char ch;
		for (int i = 0; i < msg.length(); i++) 
		{ 
			ch = msg.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				ch = (char) (ch + key) ;
				if(ch > 'z')
				{
					ch = (char) (ch - 'z'+'a' -1) ;
				}
				
				enc_msg += ch;
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				ch = (char) (ch + key) ;
				if(ch > 'Z')
				{
					ch = (char) (ch - 'Z'+ 'A' -1) ;
				}
				
				enc_msg += ch;
			}
			else
			{
				enc_msg += ch;
			}
			
		}
		System.out.println("Encrypted Message:"+enc_msg);
		
		//------------decryption
				char ch1;
				String denc_msg = "";
				for (int i = 0; i < msg.length();++i) 
				{ 
					ch1 = enc_msg.charAt(i);
					
					if(ch1>='a' && ch1<='z')
					{
						ch1 = (char) (ch1 - key) ;
						if(ch1 < 'a')
						{
							ch1 = (char) (ch1 - 'z'+'a' +1) ;
						}
						
						denc_msg += ch1;
					}
					else if(ch1 >= 'A' && ch1 <= 'Z')
					{
						ch1 = (char) (ch1 - key) ;
						if(ch1 < 'A')
						{
							ch1 = (char) (ch1 - 'Z'+ 'A' +1) ;
						}
						
						denc_msg += ch1;
					}
					else
					{
						denc_msg += ch1;
					}
					
				}
				System.out.println("Decrypted Message:"+denc_msg);
	}

}