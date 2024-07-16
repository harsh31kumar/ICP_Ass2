//  The distance between two cities (in km.) is input through the keyboard. Write a java program 
//  to convert and print this distance in meters, feet, inches and centimetres.


import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter distance in K.M.");
		distance=sc.nextDouble();
		double meter=distance*1000;
		System.out.println(distance+"k.m is"+meter+"meter");
		double feet=distance*3280.8399;
		System.out.println(distance+"k.m is"+feet+"feet");
		double inch=distance*39370.8787;
		System.out.println(distance+"k.m is"+inch+"inches");
		double centimeter=distance*100000;
		System.out.println(distance+"k.m is"+centimeter+"cms");
		

	}

}
