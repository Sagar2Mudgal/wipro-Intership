/*Create an employee class with properties of your choice. Create an object of this class and also create a clone of the same. 
After making the clone, change the properties of the original employee object and 
print the properties of both the original and clone object and note down your observation.
*/

public class Solution4 implements Cloneable {
	private String name;
	
	public Solution4(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Solution4 clone() {
		try {
			return (Solution4) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 emp = new Solution4("Sagar mudgal");
		Solution4 empClone = emp.clone();
		
		empClone.setName("Achal");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}