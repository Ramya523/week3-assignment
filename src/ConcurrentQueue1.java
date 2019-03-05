import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  ConcurrentLinkedQueue<Integer>  c = new ConcurrentLinkedQueue<Integer>(); 
		  System.out.println("enter the id");
		  for(int i=0;i<=4;i++)
		  {
			  int id=sc.nextInt();
			  c.add(id);
		  }
		 
		System.out.println(c);
		System.out.println("adding extra element");
		int id=sc.nextInt();
		c.add(id);
		System.out.println(c);

	}

}
