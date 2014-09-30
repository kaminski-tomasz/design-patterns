package patterns.behavioral.examples.command;

import java.util.ArrayList;
import java.util.List;

import patterns.behavioral.examples.command.commands.CloseCommand;
import patterns.behavioral.examples.command.commands.CopyCommand;
import patterns.behavioral.examples.command.commands.CutCommand;
import patterns.behavioral.examples.command.commands.OpenCommand;
import patterns.behavioral.examples.command.commands.PasteCommand;

public class Application
{
	private List< Menu > menuList = new ArrayList< Menu >();
	private List< Document > documents = new ArrayList< Document >();

	private Menu fileMenu;
	private MenuItem openDocumentMenuItem;
	private MenuItem closeDocumentMenuItem;
	private Menu editMenu;
	private MenuItem copyMenuItem;
	private MenuItem cutMenuItem;
	private MenuItem pasteMenuItem;

	private Document currentDocument;

	public Application()
	{
		createMenus();
	}

	protected void createMenus()
	{
		/*
		 * Creating File Menu
		 */
		fileMenu = new Menu();

		openDocumentMenuItem = new MenuItem();
		closeDocumentMenuItem = new MenuItem();

		openDocumentMenuItem.storeCommand( new OpenCommand( this ) );
		closeDocumentMenuItem.storeCommand( new CloseCommand( this ) );

		fileMenu.addMenuItem( openDocumentMenuItem );
		fileMenu.addMenuItem( closeDocumentMenuItem );

		/*
		 * Creating Edit Menu
		 */
		editMenu = new Menu();

		copyMenuItem = new MenuItem();
		cutMenuItem = new MenuItem();
		pasteMenuItem = new MenuItem();

		editMenu.addMenuItem( copyMenuItem );
		editMenu.addMenuItem( cutMenuItem );
		editMenu.addMenuItem( pasteMenuItem );

		/*
		 * Adding menus to the application
		 */
		menuList.add( fileMenu );
		menuList.add( editMenu );
	}

	public void add( Document document )
	{
		documents.add( document );
		setCurrentDocument( document );
	}

	public void remove( Document document )
	{
		documents.remove( document );
		if( document == currentDocument )
		{
			copyMenuItem.storeCommand( null );
			cutMenuItem.storeCommand( null );
			pasteMenuItem.storeCommand( null );
		}
	}

	public Document getCurrentDocument()
	{
		return currentDocument;
	}

	private void setCurrentDocument( Document document )
	{
		if( currentDocument != document )
		{
			copyMenuItem.storeCommand( new CopyCommand( document ) );
			cutMenuItem.storeCommand( new CutCommand( document ) );
			pasteMenuItem.storeCommand( new PasteCommand( document ) );
		}
		currentDocument = document;
	}

	public static void main( String[] args )
	{
		Application application = new Application();
		/*
		 * open document
		 */
		application.openDocumentMenuItem.invokeCommand();
		/*
		 * do something with document
		 */
		application.copyMenuItem.invokeCommand();
		application.cutMenuItem.invokeCommand();
		application.pasteMenuItem.invokeCommand();
		/*
		 * close document
		 */
		application.closeDocumentMenuItem.invokeCommand();
		/*
		 * try to do something with document...
		 */
		application.copyMenuItem.invokeCommand();
	}
}
