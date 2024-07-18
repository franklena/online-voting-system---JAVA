package person;
public class Person 
{
	String name;
    int age;
    
    public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public int calculate()
    {
        if(age<18)
		{
			System.out.println("You are not eligible for voting");
			return (1);
		}
		else
		{
			System.out.println("You are eligible for voting");
			return (0);
		}
    } 
}