package MultiThreading;

public class ThreadExample4 extends Thread
{
	 public void run()
	   {
		   System.out.println("child thread");
	   }
	 
	public static void main(String[] args) 
	{
		ThreadExample4 obj=new ThreadExample4();
		obj.run(); 
		

	}

}
