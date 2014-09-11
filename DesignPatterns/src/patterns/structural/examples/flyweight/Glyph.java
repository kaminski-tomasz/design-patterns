package patterns.structural.examples.flyweight;

public interface Glyph
{
	public void draw( Window window, GlyphContext context );

	public void setFont( Font font, GlyphContext context );

	public Font getFont( GlyphContext context );

	public void first( GlyphContext context );

	public void next( GlyphContext context );

	public boolean isDone( GlyphContext context );

	public Glyph current( GlyphContext context );

	public void insert( Glyph glyph, GlyphContext context );

	public void remove( GlyphContext context );
}
