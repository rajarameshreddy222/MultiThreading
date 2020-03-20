package MultiThreading;

public class ThreadExample8 implements Runnable
{
	public void run() 
	{
		
	  for(int i=0;i<=25;i++)
	  {
		  System.out.println("child");
	  }
	}
	
	
	public static void main(String[] args) {
	

		ThreadExample8 obj=new ThreadExample8();
		Thread t=new Thread(obj);
		t.start();
		
		for(int i=0;i<=25;i++)
		  {
			  System.out.println("main");
		  }


		
	}

}
