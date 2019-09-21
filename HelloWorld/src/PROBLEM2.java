import java.util.Scanner;
public class PROBLEM2 {

	
	    public static void main (String [] args) {
	 
	        Scanner scnr = new Scanner (System.in);
	         
	        int option;
	        int weight;
	        int height;
	        int bmi;
	        
	        System.out.println("Which formula would you like to use? Type 1 for Inches and pounds or type 2 for meters and Kilograms?");
	        option = scnr.nextInt();
	        
	       if(option<2){
	         
	        System.out.print ("Enter Your Weight in Pounds: ");
	        weight = scnr.nextInt();
	        System.out.print ("Enter Your Height in Inches: ");
	        height = scnr.nextInt();
	        bmi = (weight * 703) / (height * height);
	        System.out.printf("Your Body Mass Index (BMI) is %d\n\n", bmi);
	       }
	       else {
	      
		        System.out.print ("Enter Your Weight in Kilograms: ");
		        weight = scnr.nextInt();
		        System.out.print ("Enter Your Height in Meters: ");
		        height = scnr.nextInt();
		        bmi = (weight) / (height * height);
		        System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bmi);
	       }
		       
	        System.out.println ("BMI VALUES");
	        System.out.println ("Underweight: less than 18.5");
	        System.out.println ("Normal:      between 18.5 and 24.9");
	        System.out.println ("Overweight:  between 25 and 29.9");
	        System.out.println ("Obese:       30 or greater");
	 
	    }
	}