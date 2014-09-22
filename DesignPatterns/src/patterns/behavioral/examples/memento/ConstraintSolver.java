package patterns.behavioral.examples.memento;

public class ConstraintSolver
{
	/*
	 * Z³o¿one zmienne stanu i operacje potrzebne do utrzymania po³¹czeñ
	 * (...)
	 */
	private static ConstraintSolver instance;

	private ConstraintSolver()
	{
		instance = null;
	}

	public void solve()
	{
	}

	public void addConstraint( Graphic startConnection, Graphic endConnection )
	{
	}

	public void removeConstraint( Graphic startConnection, Graphic endConnection )
	{
	}

	public class ConstraintSolverMemento
	{
		/*
		 * Prywatne zmienne stanu obiektu ConstraintSolver 
		 * (...)
		 */

		private ConstraintSolverMemento( ConstraintSolver constraintSolver )
		{
		}
	}

	public ConstraintSolverMemento createMemento()
	{
		return new ConstraintSolverMemento( this );
	}

	public void setMemento( ConstraintSolverMemento memento )
	{
	}

	public static ConstraintSolver getInstance()
	{
		if( instance == null )
		{
			instance = new ConstraintSolver();
		}
		return instance;
	}
}
