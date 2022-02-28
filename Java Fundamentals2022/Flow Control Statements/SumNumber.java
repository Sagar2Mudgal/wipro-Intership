import java.util.Scanner;
public class SumNumber {

	public static void main(String[] args) {
		int a,b,sum;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Number");
			a=sc.nextInt();
			System.out.println("Enter Second Number");
			b=sc.nextInt();
		}
		sum=a+b;
	    System.out.println("Sum of " +a+ " and "+ b +" is "+sum);
	    		
	}

}

