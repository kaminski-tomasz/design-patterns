package patterns.behavioral.examples.strategy;

public class SimpleCompositor implements Compositor
{
	@Override
	public int compose( float[] natural, float[] stretch, float[] shrink,
			int componentCount, int lineWidth, int[] breaks )
	{
		System.out.println( "SimpleCompositor.compose()" );
		return 0;
	}
}
