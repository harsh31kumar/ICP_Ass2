//  Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) 


import java.util.Scanner;
public class QH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,x2,x3,y1,y2,y3,side1,side2,side3,s,area;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three points for a Traingle :");
		x1=input.nextDouble();
		y1=input.nextDouble();
		x2=input.nextDouble();
		y2=input.nextDouble();
		x3=input.nextDouble();
		y3=input.nextDouble();
		side1=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2),(0.5));
		side2=Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2),(0.5));
		side3=Math.pow(Math.pow(x1-x3,2)+Math.pow(y1-y3, 2),(0.5));
		s=(side1+side2+side3)/2;
		area=Math.pow(s*(side1)*(s-side2)*(s-side3),(0.5));
		System.out.println("The area of the Tringle is"+area);
		
	}

}