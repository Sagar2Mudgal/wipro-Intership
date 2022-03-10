

public class JunitA1Test {
	
   JunitA1 demo1 = new JunitA1();
	
	public void testStringConcat() {
		assertEquals("tomcat", JunitA1.stringConcat("tom", "cat"));
	}

	private void assertEquals(String string, String stringConcat) {
		// TODO Auto-generated method stub
		
	}

}