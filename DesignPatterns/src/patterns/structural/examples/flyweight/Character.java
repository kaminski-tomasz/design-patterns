package patterns.structural.examples.flyweight;

public class Character implements Glyph
{
	private char charcode;

	public Character( char c )
	{
		this.charcode = c;
	}

	@Override
	public void draw( Window window, GlyphContext context )
	{
		System.out.println( "Drawing character " + charcode + " in context " + context );
	}

	@Override
	public void setFont( Font font, GlyphContext context )
	{
	}

	@Override
	public Font getFont( GlyphContext context )
	{
		return null;
	}

	@Override
	public void first( GlyphContext context )
	{
	}

	@Override
	public void next( GlyphContext context )
	{
	}

	@Override
	public boolean isDone( GlyphContext context )
	{
		return false;
	}

	@Override
	public Glyph current( GlyphContext context )
	{
		return null;
	}

	@Override
	public void insert( Glyph glyph, GlyphContext context )
	{
	}

	@Override
	public void remove( GlyphContext context )
	{
	}
}
