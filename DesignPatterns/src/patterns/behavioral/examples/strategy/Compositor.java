package patterns.behavioral.examples.strategy;

public interface Compositor
{
	public int compose( float[] natural, float[] stretch, float shrink[],
			int componentCount, int lineWidth, int[] breaks );
}
