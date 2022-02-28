import java.util.Scanner;

public class LastDigitSameNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int Num1,Num2,Reminder1,Reminder2;
			System.out.println("Enter 1st Number");
		     Num1=sc.nextInt();
		     System.out.println("Enter 2nd Number");
		     Num2=sc.nextInt();
	if(Num1==Num2) 
	{
		System.out.println("True");
	}
	else
	{
		Reminder1=Num1%10;
		Reminder2=Num2%10;
		if(Reminder1==Reminder2)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
		
  }
}
}