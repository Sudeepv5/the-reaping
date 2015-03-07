
public class LoopTest {
	
	
	public LoopTest()
	{
		System.out.println("from base");
	}
	
	public static void main(String[] args)
	{
		LoopTest obja=new LoopTest();
		Nested objb=new LoopTest().new Nested();
	}

	
	public class Nested{
		
		public Nested()
		{
		System.out.println("from nested");
		}
	}
	
}
