package MultiThreading;

public class ThreadExample7 extends Thread 
{
	   public void run()
	   {
		   for(int i=0;i<=15;i++)
		   {
			   System.out.println("child");
		   }
	   }
	   
		public static void main(String[] args)
		{
			ThreadExample7 obj=new ThreadExample7();
			obj.start(); 
			Thread.currentThread().setPriority(10);
			for(int i=0;i<=15;i++)
			   {
				   System.out.println("Main");
			   }
		}

}
