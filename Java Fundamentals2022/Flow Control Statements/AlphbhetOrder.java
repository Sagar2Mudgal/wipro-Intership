import java.util.Scanner;

public class AlphbhetOrder {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			char Character1,Character2;
			System.out.println("Enter 1st Character");
			Character1=sc.next().charAt(0);
			System.out.println("Enter 2nd Character");
			Character2=sc.next().charAt(0);
			if(Character1>Character2) {
				System.out.println(Character2+ "," + Character1);
			}
			else {
				System.out.println(Character1+ "," + Character2);
			}
	}
  }
}
