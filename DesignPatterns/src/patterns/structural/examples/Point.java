package patterns.structural.examples;

public class Point
{
	public static final Point ZERO = new Point();

	private float x;
	private float y;

	public Point()
	{
		this.x = 0.0f;
		this.y = 0.0f;
	}

	public Point( Point other )
	{
		this.x = other.x;
		this.y = other.y;
	}

	public Point( float x, float y )
	{
		this.x = x;
		this.y = y;
	}

	public Point addHere( Point other )
	{
		this.x += other.x;
		this.y += other.y;
		return this;
	}

	public Point subHere( Point other )
	{
		this.x -= other.x;
		this.y -= other.y;
		return this;
	}

	public Point mulHere( Point other )
	{
		this.x *= other.x;
		this.y *= other.y;
		return this;
	}

	public Point divHere( Point other )
	{
		if( other.x != 0.0f && other.y != 0.0f )
		{
			this.x /= other.x;
			this.y /= other.y;
			return this;
		}
		throw new IllegalArgumentException( "Division by zero." );
	}

	public Point add( Point other )
	{
		return new Point( this.x + other.x, this.y + other.y );
	}

	public Point sub( Point other )
	{
		return new Point( this.x - other.x, this.y - other.y );
	}

	public Point mul( Point other )
	{
		return new Point( this.x * other.x, this.y * other.y );
	}

	public Point div( Point other )
	{
		if( other.x != 0.0f && other.y != 0.0f )
		{
			return new Point( this.x / other.x, this.y / other.y );
		}
		throw new IllegalArgumentException( "Division by zero." );
	}

	public float getX()
	{
		return x;
	}

	public void setX( float x )
	{
		this.x = x;
	}

	public float getY()
	{
		return y;
	}

	public void setY( float y )
	{
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "[" + x + ", " + y + "]";
	}

	@Override
	public Object clone()
	{
		try
		{
			return super.clone();
		} catch( CloneNotSupportedException e )
		{
			throw new InternalError();
		}
	}

	@Override
	public boolean equals( Object obj )
	{
		if( obj instanceof Point )
		{
			Point p2d = ( Point )obj;
			return ( getX() == p2d.getX() ) && ( getY() == p2d.getY() );
		}
		return super.equals( obj );
	}

	public static void main( String[] args )
	{
		Point A = new Point( 1, 2 );
		Point B = new Point( 3, 4 );

		System.out.println( A.add( B ) );
		System.out.println( A.sub( B ) );
		System.out.println( A.mul( B ) );
		System.out.println( A.div( B ) );
	}
}
