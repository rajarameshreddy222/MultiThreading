package MultiThreading;



public class ThreadExample2  extends Thread 
{
	 public void run()
	   {
		   System.out.println("child thread");
	   }
	   public void run(int a)
	  
	   {
		   System.out.println("overloaded run method");
	   }

		public static void main(String[] args)
		{
			ThreadExample2 obj=new ThreadExample2();
			obj.start(); 
			
			
		}

}
