package patterns.behavioral.examples.strategy;

public class TeXCompositor implements Compositor
{
	@Override
	public int compose( float[] natural, float[] stretch, float[] shrink,
			int componentCount, int lineWidth, int[] breaks )
	{
		System.out.println( "TeXCompositor.compose()" );
		return 0;
	}
}
