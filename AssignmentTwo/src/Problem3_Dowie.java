import java.util.Scanner;

public class Problem3_Dowie {


	   public static void main(String args[]){
	       String[] cat={"Sports","Religion","Fashion","Music","Movies"}; 
	       int[][] answers=new int[5][11];
	       for(int i=0;i<4;i++){
	           for(int j=1;j<=10;j++){
	               answers[i][j]=0; 
	           }
	       }
	       int numPeople;
	       System.out.println("Please rate each category from 1(least important) to 10(most important).");
	       System.out.print("Please enter the amount of people that is going to rate: ");
	       Scanner scnr = new Scanner(System.in);
	       numPeople=scnr.nextInt();
	       int i = 1;
	       while(i<=numPeople){
	           for(int j=0;j<5;j++){ 
	               System.out.print("Person "+i+" "+cat[j]+": ");
	               int a = scnr.nextInt();
	               answers[j][a]=answers[j][a]+1;
	           }
	           i++;
	       }
	       System.out.println("Topic "+"   Total Rating "+"   Avg Rating");
	       int maxPeople=0,minPeople=100000,maxCat=0,minCat=0;
	       for(i=0;i<5;i++)
	       {
	           int total=0,count=0;
	           for(int j=1;j<=10;j++)
	           {
	               total=total+j*answers[i][j]; 
	               count=count+answers[i][j]; 
	           }
	           if(maxPeople<total)
	           {  
	               maxPeople=total;
	               maxCat=i;
	           }
	           if(minPeople>total)
	           {  
	               minPeople=total;
	               minCat=i;
	           }
	           System.out.println(cat[i]+"      "+total+"                 "+(total+0.0)/count);
	       }
	       System.out.print("Max Point Topic "+"Total Rating: ");
	       System.out.println(cat[maxCat]+" "+maxPeople);
	       System.out.print("Min Point Topic "+"Total Rating: ");
	       System.out.println(cat[minCat]+" "+minPeople);
	   }
	}