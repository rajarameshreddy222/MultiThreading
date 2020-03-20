package MultiThreading;



public class ThreadExample1 extends Thread
	{

		public void run()
		{
			for(int i=0;i<20;i++)
			System.out.println("child thread");
		}

		public static void main(String[] args)
		{
			ThreadExample1 obj=new ThreadExample1();
			obj.start();   
	         for(int i=0;i<20;i++)
			 System.out.println("main thread");
			
			
		}
}
