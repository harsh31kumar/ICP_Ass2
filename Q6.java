//  When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The 
//  distance it travels is given by d = (1/2) gt2
//  Here d is in feet, t is the time in seconds, and g is 32.174.
//  Write a program that asks the user for the number of seconds and then prints out the distance 
//  travelled.


import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. in Seconds");
		t=sc.nextInt();
		d=(1.0/2)*32.174*Math.pow(t, 2);
		System.out.println("Distance Travelled : "+d);
		

	}

}
