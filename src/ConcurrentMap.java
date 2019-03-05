import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
	
	Scanner sc=new Scanner(System.in);
	static Map<String,String> map= new ConcurrentHashMap<String,String>();
	//static Map<Long,String> map1= new ConcurrentHashMap<Long,String>();
	public void name()
	{
		System.out.println("enter the first name & last name");
		for(int i=0;i<=1;i++)
		{
		map.put(sc.nextLine(), sc.nextLine());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ConcurrentMap con=new ConcurrentMap();
		con.name();
		
		
		System.out.println("first name and last name:"+map);
		
	}

}
