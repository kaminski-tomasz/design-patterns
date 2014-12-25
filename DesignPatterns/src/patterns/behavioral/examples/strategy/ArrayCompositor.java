package patterns.behavioral.examples.strategy;

public class ArrayCompositor implements Compositor
{
	@Override
	public int compose( float[] natural, float[] stretch, float[] shrink,
			int componentCount, int lineWidth, int[] breaks )
	{
		System.out.println( "ArrayCompositor.compose()" );
		return 0;
	}
}
