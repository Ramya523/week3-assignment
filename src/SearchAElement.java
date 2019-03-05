import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

	
	

public class SearchAElement {
	Scanner sc=new Scanner (System.in);
	HashMap<String, String> hm = new HashMap<String, String>();
	void name()
	{
		System.out.println("enter the first name & last name");
	//	String fname=sc.nextLine();
	//	String lname=sc.nextLine();
       for(int i=0;i<=2;i++)
       {
        hm.put(sc.nextLine(),sc.nextLine());
       }
       System.out.println(hm);
	
       System.out.println("enter first name you want to search");
		 if(hm.containsKey(sc.nextLine())){
	            System.out.println("The hashmap contains key first name");
	        } else {
	            System.out.println("The hashmap does not contains key first name");
	        }
		
	}
	
	public static void main(String[] args) {
		
       
		SearchAElement search=new SearchAElement();
		search.name();
       
		
	}

}
