//  Write a java program that reads an integer between 0 and 1000 and adds all the digits in the 
//  integer. For example, if an integer is 749, the sum of all its digits is 20. 


import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three digit no.");
		num=sc.nextInt();
		int sum=0,rem;
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		sum=sum+rem;
		System.out.println("Enter a three digit no. "+sum);

	}

}
