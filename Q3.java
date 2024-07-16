//  Enter the basic salary of an employee of an organization through the keyboard. His dearness 
//  allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic 
//  salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross 
//  salary.



import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Basic_Salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		Basic_Salary=sc.nextInt();
		double DA=Basic_Salary*0.4;
		double HRA=Basic_Salary*0.2;
		double Gross_Salary=Basic_Salary+DA+HRA;
		System.out.println("DA is :"+DA);
		System.out.println("HRA is :"+HRA);
		System.out.println("Gross Salary is :"+Gross_Salary);

	}

}
