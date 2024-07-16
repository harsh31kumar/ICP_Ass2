//  Write a java program that reads a Fahrenheit degree in a double value from the console, then 
//  converts it to Celsius and displays the result. The formula for the conversion is as follows:
//  Celsius = (Fahrenheit-32) *(5/9)


import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Faherenheit Degree");
		f=sc.nextDouble();
		double c=(f=32)*(5.0/9);
		System.out.println(f+"faherenheit is"+c+"celcius");

	}

}
