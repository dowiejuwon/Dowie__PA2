import java.util.Scanner;

public class Problem1decrypt_Dowie {

public static void main(String[] args) {
		
		System.out.println("Please enter the encrypted number: ");
	       Scanner scnr = new Scanner(System.in);
	       int number = scnr.nextInt();
	       int[] digit = new int[4];
	       int tmp;
	       tmp = number / 1000;
	       number= number % 1000;
	       if(tmp<7){tmp = (tmp+10);
	       }
	       tmp = (tmp - 7);
	       digit[2] = tmp;
	       tmp = number / 100;
	       number= number % 100;
	       if(tmp<7){tmp = (tmp+10);
	       }
	       tmp = (tmp - 7);
	       digit[3] = tmp;
	       tmp = number / 10;
	       number = number % 10;
	       if(tmp<7){tmp = (tmp+10);
	       }
	       tmp = (tmp - 7);
	       digit[0] = tmp;
	       tmp = number;
	       if(tmp<7){tmp = (tmp+10);
	       }
	       tmp = (tmp - 7);
	       digit[1] = tmp;
	       int i=0;
	       String sum="";
	       while(i<4)
	       {
	           sum = sum + Integer.toString(digit[i]);
	           i++;
	       }
	       System.out.println("decrypted number: "+ sum);

	   }
	}
		
