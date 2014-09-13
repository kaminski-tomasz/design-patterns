package patterns.behavioral.examples.iterator;

public class Client
{
	public static void printEmployees( Iterator< Employee > iterator )
	{
		for( iterator.first(); !iterator.isDone(); iterator.next() )
		{
			System.out.println( iterator.currentItem() );
		}
	}

	public static void main( String[] args )
	{
		List< Employee > employees = new ArrayList< Employee >();
		employees.append( new Employee( "Chuck Norris", 54, 150000 ) );
		employees.append( new Employee( "Natalie Portman", 18, 100000 ) );
		employees.append( new Employee( "Al Pacino", 57, 500000 ) );

		printEmployees( employees.createIterator() );
		
		System.out.println( "---" );
		Iterator< Employee > backward = 
				new ReverseListIterator< Employee >( employees );
		printEmployees( backward );

		System.out.println( "---" );
		PrintNEmployees pa = new PrintNEmployees( employees, 2 );
		pa.traverse();

		System.out.println( "---" );
		new Traverser< Employee >( employees )
		{
			@Override
			protected boolean processItem( Employee currentItem )
			{
				System.out.println( currentItem );
				return true;
			}
		}.traverse();
		
		System.out.println( "---" );
		new FilteringTraverser< Employee >( employees )
		{
			@Override
			protected boolean processItem( Employee currentItem )
			{
				System.out.println( currentItem );
				return true;
			}
			
			@Override
			protected boolean test( Employee currentItem )
			{
				return currentItem.getAge() > 50;
			}
		}.traverse();
	}
}
