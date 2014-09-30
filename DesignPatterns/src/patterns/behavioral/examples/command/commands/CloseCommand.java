package patterns.behavioral.examples.command.commands;

import patterns.behavioral.examples.command.Application;
import patterns.behavioral.examples.command.Command;
import patterns.behavioral.examples.command.Document;

public class CloseCommand implements Command
{
	private Application application;

	public CloseCommand( Application application )
	{
		this.application = application;
	}

	@Override
	public void execute()
	{
		Document currentDocument = application.getCurrentDocument();
		if( currentDocument != null )
		{
			application.remove( currentDocument );
			currentDocument.close();
		}
	}
}
