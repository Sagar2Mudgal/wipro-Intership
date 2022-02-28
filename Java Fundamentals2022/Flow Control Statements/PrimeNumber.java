import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int num = 0;
        if(args.length >= 1) {
            num = Integer.parseInt(args[0]);
        }
        else {
            try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Please enter an integer number ");
				num = sc.nextInt();
			}
        }

        if(num == 0 || num == 1) {
    	System.out.println(num + " is neither prime nor composite");
        }
        else {
    	if(isPrime(num))
                System.out.println(num + " is a prime number");
            else
                System.out.println(num + " is a not prime number");
        }
    }

    static boolean isPrime(int num) {
        for(int i=2; i <= num/2; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
}

}
