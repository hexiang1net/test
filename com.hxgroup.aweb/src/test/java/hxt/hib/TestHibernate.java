package hxt.hib;

import junit.framework.TestCase;


public class TestHibernate extends TestCase{

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		
		
		new Configuration().configure(new File("")).buildSessionFactory();

	}*/
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testBBB(){
		
		assertEquals(true, true);
		System.out.println("===xxxxx");
		
		System.out.println(Math.round(11.3));
		
	}
	
	public void testCC(){
		short s1 = 1;
		s1 =  (short)(s1 + 1);
		
		s1+=1;
		
//		goto;
	}

}
