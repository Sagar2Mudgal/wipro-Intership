import java.util.Scanner;
public class StarPoint {
	public static void main(String[] args) 
	{
		int N,i,j;
		try (Scanner sc = new Scanner(System.in))
		   {
			System.out.println("Enter First Number");
			N=sc.nextInt();
	       }
		for(i=1;i<=N;i++) 
		{
			for(j=1;j<=i;j++) 
			{
			 System.out.print("*");
			 }
			System.out.println();
		}
    }
}
