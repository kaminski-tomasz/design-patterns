package patterns.behavioral.examples.command.commands;

import java.util.ArrayList;
import java.util.List;

import patterns.behavioral.examples.command.Command;

public class MacroCommand implements Command
{
	private List< Command > commands;

	public MacroCommand()
	{
		commands = new ArrayList< Command >();
	}

	public void add( Command command )
	{
		commands.add( command );
	}

	public void remove( Command command )
	{
		commands.remove( command );
	}

	@Override
	public void execute()
	{
		for( Command command : commands )
		{
			command.execute();
		}
	}
}
