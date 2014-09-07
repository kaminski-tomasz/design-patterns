package patterns.structural.examples.decorator;

public class Decorator implements VisualComponent
{
	private VisualComponent component;

	public Decorator( VisualComponent component )
	{
		this.component = component;
	}

	@Override
	public void draw()
	{
		component.draw();
	}

	@Override
	public void resize()
	{
		component.resize();
	}
}
