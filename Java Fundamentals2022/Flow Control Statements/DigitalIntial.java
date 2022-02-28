
public class DigitalIntial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var = '@';
		
		if((var >= 65 && var <= 90) || (var >= 97 && var <= 122) ) {
			System.out.println("Alphabet");
		}
		else if(var >= 48 && var <= 57) {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
	}

}