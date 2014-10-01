package patterns.behavioral.examples.observer.lambda;

import patterns.behavioral.examples.observer.ClockTimer;

public class Client
{
	public static void main( String[] args )
	{
		ClockTimer timer = new ClockTimer();

		timer.attach( s -> {
			if( s == timer )
			{
				int hour = timer.getHour();
				int min = timer.getMinute();
				int sec = timer.getSecond();
				System.out.println( "AnalogClock.draw(): hour = " + hour + ", minute = " + min
						+ ", second = " + sec );
			}
		} );

		timer.attach( s -> {
			if( s == timer )
			{
				int hour = timer.getHour();
				int min = timer.getMinute();
				int sec = timer.getSecond();
				System.out.println( "DigitalClock.draw(): (" + hour + ":" + min + ":" + sec + ")" );
			}
		} );

		simulateClockTicks( timer );
	}

	private static void simulateClockTicks( ClockTimer timer )
	{
		for( int i = 0; i < 5; i++ )
		{
			timer.tick();
			try
			{
				Thread.sleep( 1000 );
			} catch( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}
}
