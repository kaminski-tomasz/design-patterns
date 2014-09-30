package patterns.behavioral.examples.command.commands;

import patterns.behavioral.examples.command.Command;
import patterns.behavioral.examples.command.Document;

public class CutCommand implements Command
{
	private Document document;

	public CutCommand( Document document )
	{
		this.document = document;
	}

	@Override
	public void execute()
	{
		document.cut();
	}
}
