class Person
{
	private int age;
	private String name;
	
	Person()
	{
		age=28;
		name="Quinton";
	}
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(age+" "+name);
	}
}

class PersonDemo
{
	public static void main(String args[])
	{
		Person P=new Person();
		P.display();
		Person P1=new Person(23,"Suryakumar");
		P1.display();
	}
}