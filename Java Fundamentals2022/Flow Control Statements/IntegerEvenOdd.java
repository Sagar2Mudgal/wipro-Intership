import java.util.Scanner;

public class IntegerEvenOdd {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int Num;
			System.out.println("Enter Number");
		     Num=sc.nextInt();
		if(Num % 2 ==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
		}
	}

}
