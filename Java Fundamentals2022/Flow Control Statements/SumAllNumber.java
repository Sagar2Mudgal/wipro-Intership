import java.util.Scanner;

public class SumAllNumber{
        public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			int num = scan.nextInt();
			int sum;
			
			for(sum = 0; num > 0; num = num/10) 
			    	sum = sum + (num % 10);
			
			System.out.println(sum);
		}
	}
	

}