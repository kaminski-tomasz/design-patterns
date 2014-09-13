package patterns.behavioral.examples.iterator;

public class Employee
{
	private String name;
	private int age;
	private float salary;

	public Employee()
	{
	}

	public Employee( String name, int age, float salary )
	{
		setName( name );
		setAge( age );
		setSalary( salary );
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge( int age )
	{
		this.age = age;
	}

	public float getSalary()
	{
		return salary;
	}

	public void setSalary( float salary )
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Name: " + getName() + ", age: " + getAge() + ", salary: " + getSalary();
	}
}
