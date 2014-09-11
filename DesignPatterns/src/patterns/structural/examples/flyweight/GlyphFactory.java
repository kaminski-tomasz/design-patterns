package patterns.structural.examples.flyweight;

public class GlyphFactory
{
	private final int NCHARCODES = 128;
	private Character[] character = new Character[NCHARCODES];

	public GlyphFactory()
	{
		for( int i = 0; i < character.length; i++ )
		{
			character[i] = null;
		}
	}

	public Character createCharacter( char c )
	{
		if( character[c] == null )
		{
			character[c] = new Character( c );
		}
		return character[c];
	}

	public Row createRow()
	{
		return new Row();
	}

	public Column createColumn()
	{
		return new Column();
	}
}
