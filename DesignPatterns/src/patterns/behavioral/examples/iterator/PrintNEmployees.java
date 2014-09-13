package patterns.behavioral.examples.iterator;

public class PrintNEmployees extends Traverser< Employee >
{
	private int count;
	private int total;

	public PrintNEmployees( Traversable< Employee > aggregate, int n )
	{
		super( aggregate );
		this.total = n;
		this.count = 0;
	}

	@Override
	protected boolean processItem( Employee currentItem )
	{
		count++;
		System.out.println( currentItem );
		return count < total;
	}
}
