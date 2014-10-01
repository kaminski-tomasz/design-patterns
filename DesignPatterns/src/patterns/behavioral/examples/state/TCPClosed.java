package patterns.behavioral.examples.state;

public class TCPClosed extends TCPState
{
	private static TCPState instance;

	private TCPClosed()
	{
	}

	public static TCPState getInstance()
	{
		if( instance == null )
		{
			instance = new TCPClosed();
		}
		return instance;
	}

	@Override
	public void activeOpen( TCPConnection connection )
	{
		System.out.println( "Sending SYN" );
		System.out.println( "Receiving SYN" );
		System.out.println( "Receiving ACK" );
		changeState( connection, TCPEstablished.getInstance() );
	}

	@Override
	public void passiveOpen( TCPConnection connection )
	{
		changeState( connection, TCPListen.getInstance() );
	}
}
