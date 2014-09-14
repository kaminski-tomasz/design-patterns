package patterns.behavioral.examples.mediator;

public class FontDialogDirector extends DialogDirector
{
	private Button ok;
	private Button cancel;
	private ListBox fontList;
	private EntryField fontName;

	@Override
	protected void createWidgets()
	{
		this.ok = new Button( this );
		this.cancel = new Button( this );
		this.fontList = new ListBox( this );
		this.fontName = new EntryField( this );
		/*
		 * Zapelnianie pola listBox nazwami dostepnych czcionek,
		 * laczenie widgetow w okno dialogowe (...)
		 */
	}

	@Override
	public void showDialog()
	{
		System.out.println( "FontDialogDirector: showing dialog" );
	}

	@Override
	public void widgetChanged( Widget changedWidget )
	{
		if( changedWidget == fontList )
		{
			System.out.println( "Setting fontName.text = fontList.getSelection()" );
			fontName.setText( fontList.getSelection() );
		}
		else if( changedWidget == ok )
		{
			System.out.println( "Modifying font" );
			/*
			 * Modyfikowanie czcionki i zamykanie okna dialogowego
			 * (...)
			 */
		}
		else if( changedWidget == cancel )
		{
			System.out.println( "Closing the dialog" );
			/*
			 * Zamykanie okna dialogowego (...)
			 */
		}
	}

	public static void pressOk( FontDialogDirector director )
	{
		director.ok.handleMouse( new MouseEvent() );
	}
}
