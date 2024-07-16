//  Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays 
//  the number of years and days for the minutes.


import java.util.*;
public class QH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m,d,y;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no. of mintes");
		 m=sc.nextInt();
		 y=m/(365*24*60);
		 d=(m%(365*24*60))/(24*60);
		 System.out.println(m+" minutes is approx."+y+" year and"+d+" days");
		 

	}

}
