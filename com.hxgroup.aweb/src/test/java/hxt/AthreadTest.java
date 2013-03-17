package hxt;

public class AthreadTest {
	
	
	public static  int fk = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			AthreadTest test = new AthreadTest();
			for(int i =0; i< 5;i++){
				new Aa(test).start();
				new Bb(test).start();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}
	
	
	
	public  synchronized static void m1(String name){
		
			fk++;
			System.out.println(name+" m1 "+ fk);
			
		
	}
	
	
	public synchronized  void m2(String name){
		
			fk++;
			System.out.println(name+   " m2 "+ fk);
			
			
	}
	
	public static class Aa extends Thread {
		
		AthreadTest test = null;
		
		public Aa(AthreadTest test){
			this.test = test;
		}
		
		@Override
		public void run() {
			super.run();
			
			for(int i = 0;i<1500;i++){
				
				try {
					
					sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				test.m2(currentThread().getName());
			}
			
		}
		
	}
	
	public static class Bb extends Thread {
		
		AthreadTest test = null;
		
		public Bb(AthreadTest test){
			this.test = test;
		}
		
		
		@Override
		public void run() {
			super.run();
			
			for(int i = 0 ;i<1500;i++){
				
				try {
					
					sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				AthreadTest.m1(currentThread().getName());
				
				
			}
		}
		
		
	}

}
