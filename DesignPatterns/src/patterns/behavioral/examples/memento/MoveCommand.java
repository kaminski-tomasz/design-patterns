package patterns.behavioral.examples.memento;

import patterns.behavioral.examples.Point;

public class MoveCommand
{
	private ConstraintSolver.ConstraintSolverMemento state;
	private Point delta;
	private Graphic target;

	public MoveCommand( Graphic target, Point delta )
	{
		this.target = target;
		this.delta = delta;
	}

	public void execute()
	{
		ConstraintSolver solver = ConstraintSolver.getInstance();
		state = solver.createMemento();
		target.move( delta );
		solver.solve();
	}

	public void unexecute()
	{
		ConstraintSolver solver = ConstraintSolver.getInstance();
		target.move( Point.ZERO.sub( delta ) );
		solver.setMemento( state );
		solver.solve();
	}
}
