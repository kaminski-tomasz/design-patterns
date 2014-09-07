package patterns.structural.examples;

/**
 * Rectangle class
 * 
 * @author Tomek
 *
 */
public class Rect
{
	public static final Rect ZERO = new Rect();

	private float x;
	private float y;
	private float width;
	private float height;

	public Rect()
	{
		this.x = 0.0f;
		this.y = 0.0f;
		this.width = 0.0f;
		this.height = 0.0f;
	}

	public Rect( float x, float y, float w, float h )
	{
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}

	public Rect( Point origin, Point extent )
	{
		this( origin.getX(), origin.getY(), extent.getX(), extent.getY() );
	}

	public float getLeft()
	{
		return this.x;
	}

	public void setLeft( float x )
	{
		this.x = x;
	}

	public float getBottom()
	{
		return this.y;
	}

	public void setBottom( float y )
	{
		this.y = y;
	}

	public float getWidth()
	{
		return width;
	}

	public void setWidth( float width )
	{
		this.width = width;
	}

	public float getHeight()
	{
		return height;
	}

	public void setHeight( float height )
	{
		this.height = height;
	}

	public Point getOrigin()
	{
		return new Point( x, y );
	}

	public void setOrigin( Point origin )
	{
		setLeft( origin.getX() );
		setBottom( origin.getY() );
	}

	public Point getExtent()
	{
		return new Point( width, height );
	}

	public void setExtent( Point extent )
	{
		setWidth( extent.getX() );
		setHeight( extent.getY() );
	}

	public void moveTo( Point point )
	{
		setOrigin( point );
	}

	public void moveBy( Point point )
	{
		setOrigin( getOrigin().addHere( point ) );
	}

	public boolean isEmpty()
	{
		return ( width == 0.0f ) || ( height == 0.0f );
	}

	public boolean contains( Point point )
	{
		return ( point.getX() >= getLeft() && point.getX() < getLeft() + getWidth() )
				&& ( point.getY() >= getBottom() && point.getY() < getBottom() + getHeight() );
	}

	@Override
	public String toString()
	{
		return "[ Origin=" + getOrigin() + "; Extent=" + getExtent() + "]";
	}
}
