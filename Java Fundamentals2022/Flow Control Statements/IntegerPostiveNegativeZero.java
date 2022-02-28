//Write a program to check if a given integer number is Positive, Negative, or Zero.
import java.util.Scanner;

public class IntegerPostiveNegativeZero {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int Num;
			System.out.println("Enter Number");
		     Num=sc.nextInt();
		 if(Num>0) {
			 System.out.println("Number is postive"); 
		 }
		 else if (Num<0) {
			 System.out.println("Number is Negative");
		 }
		 else  {
			 System.out.println("Number is Zero");	 
		 }
		}
	}
}
