package patterns.behavioral.examples.state;

public class TCPConnection
{
	private TCPState state;

	public TCPConnection()
	{
		this.state = TCPClosed.getInstance();
	}

	void changeState( TCPState state )
	{
		System.out.println( "TCPConnection: Changing state to " + state.getClass().getSimpleName() );
		this.state = state;
	}

	public void activeOpen()
	{
		System.out.println( "TCPConnection: active open" );
		state.activeOpen( this );
	}

	public void passiveOpen()
	{
		System.out.println( "TCPConnection: passive open" );
		state.passiveOpen( this );
	}

	public void close()
	{
		System.out.println( "TCPConnection: close" );
		state.close( this );
	}

	public void send()
	{
		System.out.println( "TCPConnection: send" );
		state.send( this );
	}

	public void acknowledge()
	{
		System.out.println( "TCPConnection: acknowledge" );
		state.acknowledge( this );
	}

	public void synchronize()
	{
		System.out.println( "TCPConnection: synchronize" );
		state.synchronize( this );
	}

	public void processOctet( TCPOctetStream octetStream )
	{
		System.out.println( "TCPConnection: processing octet" );
		state.transmit( this, octetStream );
	}
}
