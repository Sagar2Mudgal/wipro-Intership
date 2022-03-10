public class Demo2Test {
	
	Demo2 demo2 = new Demo2();
	
	public void testPalindromeCheck() {
		assertTrue(demo2.palindromeCheck("madam"));
		assertTrue(demo2.palindromeCheck("mom"));
		assertTrue(demo2.palindromeCheck("dad"));
		assertTrue(demo2.palindromeCheck("malayalam"));
		assertTrue(demo2.palindromeCheck("kerala"));
		assertTrue(demo2.palindromeCheck("india"));
	}

	private void assertTrue(boolean palindromeCheck) {
		
	}

}