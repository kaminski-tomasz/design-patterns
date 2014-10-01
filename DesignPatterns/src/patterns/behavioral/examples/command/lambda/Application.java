package patterns.behavioral.examples.command.lambda;

import java.util.ArrayList;
import java.util.List;

import patterns.behavioral.examples.command.Document;
import patterns.behavioral.examples.command.Menu;
import patterns.behavioral.examples.command.MenuItem;

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

		openDocumentMenuItem.storeCommand( ( ) -> {
			String name = askUser();
			if( name != null )
			{
				Document document = new Document( name );
				this.add( document );
				document.open();
			}
		} );

		closeDocumentMenuItem.storeCommand( ( ) -> {
			Document currentDocument = getCurrentDocument();
			if( currentDocument != null )
			{
				remove( currentDocument );
				currentDocument.close();
			}
		} );

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
			/*
			 * Use Lambda expressions
			 */
			copyMenuItem.storeCommand( ( ) -> document.copy() );
			cutMenuItem.storeCommand( ( ) -> document.cut() );
			/*
			 * use method reference (it works, because paste() has
			 * the same interface as command interface
			 */
			pasteMenuItem.storeCommand( document::paste );
		}
		currentDocument = document;
	}

	protected String askUser()
	{
		System.out.println( "Asking user for document name" );
		return "someDocName";
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
