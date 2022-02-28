import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		int Num,reverse=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number");
			Num=sc.nextInt();
		}
		while(Num!=0)
	   {
		   int Rem= Num % 10;
		   reverse= reverse*10 + Rem;
		   Num = Num/10;
	   }
	   System.out.println("the reverse number is"  +  reverse );
	}

}
