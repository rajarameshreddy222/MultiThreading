package MultiThreading;

public class ThreadExample6 extends Thread 
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
			ThreadExample6 obj=new ThreadExample6();
			obj.start(); 
			Thread.currentThread().setPriority(1);
			for(int i=0;i<=15;i++)
			   {
				   System.out.println("Main");
			   }
		}

}
