package bean;

import java.util.Scanner;

public class CeasarCipher {
	String txt;
	int key;
	char a;
	String ciphertext = "";

	public void caesarCiphar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Plain Text:\n");
		txt = sc.nextLine();
		System.out.println("Enter the Key:\n");
		key = sc.nextInt();

		for (int i = 0; i < txt.length(); i++) {
			a = txt.charAt(i);

			if (a >= 'a' && a <= 'z') {
				a = (char) (a + key);
				if (a > 'z') {
					a = (char) (a + 'a' - 'z' - 1);
				}
				ciphertext = ciphertext + a;
			} else if (a >= 'A' && a <= 'Z') {
				a = (char) (a + key);
				if (a > 'Z') {
					a = (char) (a + 'A' - 'Z' - 1);
				}
				ciphertext = ciphertext + a;
			} else {
				ciphertext = ciphertext + a;
			}

		}
		System.out.println(" ciphertext : " + ciphertext);
	}

	public static void main(String[] args) {
		CeasarCipher c = new CeasarCipher();
		c.caesarCiphar();
	}

}