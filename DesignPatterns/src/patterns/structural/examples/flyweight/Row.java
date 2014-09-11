package patterns.structural.examples.flyweight;

public class Row implements Glyph
{
	@Override
	public void draw( Window window, GlyphContext context )
	{
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
