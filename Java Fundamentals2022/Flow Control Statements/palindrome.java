import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int Num,reverse=0,temp;
			System.out.println("Enter Number");
		     Num=sc.nextInt();
		     temp=Num;
		 	while(Num>0)
			   {
				   int Rem= Num % 10;
				   reverse= reverse*10 + Rem;
				   Num = Num/10;
			   }
		if(temp==reverse)
			System.out.println(" palindrome");
		else
			System.out.println(" not palindrome");
		}
		
		
	}
}
