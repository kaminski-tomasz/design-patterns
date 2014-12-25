package patterns.behavioral.examples.strategy;

@SuppressWarnings( "unused" )
public class Composition
{
	private Compositor compositor;
	private Component component;
	private int componentCount;
	private int lineWidth;
	private int[] lineBreaks;
	private int lineCount;

	public Composition( Compositor compositor )
	{
		this.compositor = compositor;
	}

	public void repair()
	{
		float[] natural = null;
		float[] stretchability = null;
		float[] shrinkability = null;
		int componentCount = 0;
		int[] breaks = null;

		// Preparing tables with desired components size
		// ...

		int breakCount =
				compositor.compose( natural, stretchability,
						shrinkability, componentCount,
						lineWidth, breaks );

		// Placing components according to row breaking points
		// ...
	}
}
