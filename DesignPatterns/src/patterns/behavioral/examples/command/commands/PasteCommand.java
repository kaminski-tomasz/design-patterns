package patterns.behavioral.examples.command.commands;

import patterns.behavioral.examples.command.Command;
import patterns.behavioral.examples.command.Document;

public class PasteCommand implements Command
{
	private Document document;

	public PasteCommand( Document document )
	{
		this.document = document;
	}

	@Override
	public void execute()
	{
		document.paste();
	}
}
