package patterns.behavioral.examples.state;

public class Client
{
	public static void main( String[] args )
	{
		TCPConnection connection = new TCPConnection();
		connection.passiveOpen();
		connection.send();
		connection.close();
	}
}
