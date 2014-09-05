package patterns.structural.examples;

public class Rect
{
	public static final Rect ZERO = new Rect();

	private Point origin;
	private float width;
	private float height;

	public Rect()
	{
		origin = new Point( 0.0f, 0.0f );
		width = 0.0f;
		height = 0.0f;
	}

	public Rect( float x, float y, float w, float h )
	{
		this.origin = new Point( x, y );
		this.width = w;
		this.height = h;
	}

	public Rect( Point origin, Point extent )
	{
		this( origin.getX(), origin.getY(), extent.getX() - origin.getX(), extent.getY() - origin.getY() );
	}

	public float getLeft()
	{
		return origin.getX();
	}

	public void setLeft( float x )
	{
		this.origin.setX( x );
	}

	public float getBottom()
	{
		return origin.getY();
	}

	public void setBottom( float y )
	{
		this.origin.setY( y );
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
		return origin;
	}

	public void setOrigin( Point origin )
	{
		this.origin = origin;
	}

	public Point getExtent()
	{
		return new Point( origin.getX() + width, origin.getY() + height );
	}

	public void setExtent( Point extent )
	{
		this.width = extent.getX() - origin.getX();
		this.height = extent.getY() - origin.getY();
	}

	public void moveTo( Point point )
	{
		setOrigin( new Point( point ) );
	}

	public void moveBy( Point point )
	{
		getOrigin().addHere( point );
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
		return "[" + getOrigin() + "; " + getExtent() + "]";
	}
}
