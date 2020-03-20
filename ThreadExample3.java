package MultiThreading;

public class ThreadExample3 extends  Thread 

{
	public void run()
	   {
		   System.out.println("child thread");
	   }
	   public void start()
	   {
		   System.out.println("start method of ThreadExample class");
	   }

	public static void main(String[] args) 
	{
		ThreadExample3 obj=new ThreadExample3();
		obj.start(); 
	}

}
