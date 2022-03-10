import java.util.ArrayList;

import org.junit.Test;

@SuppressWarnings("unused")
public class EmpesloyeeTest {
	Employee e = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Ajay");
		list.add("Vijay");
		list.add("Suresh");
	}
	
	public void testFindName() {
		System.out.println(list);
		assertEquals("FOUND", e.findName(list, "Ajay"));
		System.out.println("tested");
	}

	private void assertEquals(String string, String findName) {
		// TODO Auto-generated method stub
		
	}

}