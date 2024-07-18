import person.Person;
import candidate.*;
import java.util.Scanner;
public class Mainvote
{
	public static void main(String args[])
    {
	    Result r=new Result();
	   	r.list();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of person waiting to vote");
		int n=sc.nextInt();
		String[] name=new String[n];
		int[] age=new int[n];
		try
		{
			for(int i=0;i<n;i++)
			{
		   		System.out.println("PERSON:"+ (i+1));
				System.out.println("Enter your name:");
				name[i] = sc.next();
				System.out.println("Enter your age:");
				age[i] = sc.nextInt();
				Person p = new Person(name[i],age[i]);
				int j = p.calculate();
		    	if(j!=1)
		    	{
		        	r.getcandidatedetails();
            	}
        	}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
    	r.getdetails();
    	r.result();
	}
}