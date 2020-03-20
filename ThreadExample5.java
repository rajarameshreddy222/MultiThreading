package MultiThreading;

public class ThreadExample5 extends Thread 
{
	   public void run()
	   {
		   System.out.println("child : "+Thread.currentThread().getPriority());
	   }
	   
		public static void main(String[] args)
		{

			ThreadExample5 obj=new ThreadExample5();
			obj.start();
			Thread.currentThread().setPriority(1);  
			System.out.println("Main : "+Thread.currentThread().getPriority());
			
		}
}
