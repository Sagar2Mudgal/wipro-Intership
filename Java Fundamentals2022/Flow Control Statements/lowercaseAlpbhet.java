import java.util.Scanner;

public class lowercaseAlpbhet {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
		char Character;
		System.out.println("Enter Character");
		Character=sc.next().charAt(0);
		if (Character >= 'a' && Character <= 'z')
			System.out.println((char)(Character-32));				//lowercase to uppercase
	     else
	    	 System.out.println((char)(Character+32)); 			//uppercase to lowercase
	}
	}
}
