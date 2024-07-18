package candidate;
import java.util.Scanner;
public class Result extends Candidate
{
	int candidate1Votes;
	int candidate2Votes;
	int candidate3Votes;
    
	public void  getcandidatedetails()
    {
      	System.out.println("Enter number either 1 or 2 or 3");
       	System.out.println("To vote for our candidates");
   		Scanner m = new Scanner(System.in);
        int UserSelection=m.nextInt();        
        if(UserSelection==1)
       	{
       		System.out.println("Your vote is registerd successfully");
       		candidate1Votes++;
       	}
		else if(UserSelection==2)
        {
            System.out.println("Your vote is registerd successfully");
            candidate2Votes++;
        }
        else if(UserSelection==3)
       	{
            System.out.println("Your vote is registerd successfully");
            candidate3Votes++;
        }
        else
        {
            System.out.println("give a valid input");
			getcandidatedetails();
		}
	}
	public void result()
   	{
		try
		{
			Thread.sleep(1000);
        	System.out.println("The results are:");
        	System.out.println("Candidate1:" + candidate1Votes + "votes");
       		System.out.println("Candidate2:" + candidate2Votes + "votes");
       		System.out.println("Candidate3:" + candidate3Votes + "votes");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public void getdetails()
	{
		if ( candidate1Votes > candidate2Votes && candidate1Votes > candidate3Votes)
		{
			System.out.println("The winner is Nivedha: " + candidate1Votes + " votes");
		}
		else if ( candidate2Votes > candidate1Votes && candidate2Votes > candidate3Votes)
		{
			System.out.println("The winner is Franklin: " + candidate2Votes + "votes");
		}

		else if( candidate3Votes > candidate1Votes && candidate3Votes > candidate2Votes)
		{
			System.out.println("The winner is Mithuna: " + candidate3Votes + "votes");
		}
		else if( candidate1Votes== candidate2Votes || candidate2Votes== candidate3Votes || candidate3Votes==candidate1Votes)
		{
		     System.out.println("THE ELECTION WAS DRAW");
		}
	}
}
