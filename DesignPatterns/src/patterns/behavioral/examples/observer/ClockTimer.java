package patterns.behavioral.examples.observer;

import java.util.Calendar;

public class ClockTimer extends Subject
{
	private int hour;
	private int minute;
	private int second;

	public int getHour()
	{
		return hour;
	}

	public int getMinute()
	{
		return minute;
	}

	public int getSecond()
	{
		return second;
	}

	public void tick()
	{
		Calendar cal = Calendar.getInstance();
		this.hour = cal.get( Calendar.HOUR_OF_DAY );
		this.minute = cal.get( Calendar.MINUTE );
		this.second = cal.get( Calendar.SECOND );
		notifySubject();
	}
}
