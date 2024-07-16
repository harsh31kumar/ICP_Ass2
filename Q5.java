//  Write a java program that reads the radius of a hemisphere and computes the surface area 
//  and volume using the following formulas: 
//  Surface Area of Hemisphere = 3 π r2
//  Volume of a hemisphere = (2/3)πr3
//  Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the 
//  hemisphere. Hint: Use Math.PI.


import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius :");
		rad=sc.nextDouble();
		double area=3*Math.PI*rad*rad;
		System.out.println("Area of Hemisphere is :"+ area);
		double volume=(2/3.0)*Math.PI*Math.pow(rad,area);
		System.out.println("Volume of Hemisphere is :"+ area);


	}

}
