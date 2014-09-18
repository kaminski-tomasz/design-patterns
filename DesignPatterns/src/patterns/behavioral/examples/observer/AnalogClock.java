package patterns.behavioral.examples.observer;

public class AnalogClock extends Widget implements Observer
{
	private ClockTimer subject;

	public AnalogClock( ClockTimer subject )
	{
		this.subject = subject;
		this.subject.attach( this );
	}

	@Override
	public void update( Subject theChangedSubject )
	{
		if( theChangedSubject == subject )
		{
			draw();
		}
	}

	@Override
	public void draw()
	{
		int hour = subject.getHour();
		int min = subject.getMinute();
		int sec = subject.getSecond();
		System.out.println( "AnalogClock.draw(): hour = " + hour + ", minute = " + min + ", second = " + sec );
	}

	@Override
	protected void finalize() throws Throwable
	{
		try
		{
			if( subject != null )
			{
				System.out.println( "AnalogClock.finalize(): detache" );
				subject.detach( this );
			}
		} catch( Throwable t )
		{
			throw t;
		} finally
		{
			super.finalize();
		}
	}
}
