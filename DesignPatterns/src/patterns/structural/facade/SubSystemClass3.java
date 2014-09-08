package patterns.structural.facade;

/**
 * Example of class which belongs to subsystem
 * 
 * @author Tomek
 *
 */
public class SubSystemClass3
{
	private SubSystemClass2 privateField;

	public void request3()
	{
		if( privateField != null )
		{
			privateField.request2();
		}
		System.out.println( "SubSystemClass3.request3()" );
	}

	public SubSystemClass2 getPrivateField()
	{
		return privateField;
	}

	public void setPrivateField( SubSystemClass2 privateField )
	{
		this.privateField = privateField;
	}
}
