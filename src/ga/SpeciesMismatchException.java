package ga;

public class SpeciesMismatchException extends GAException {

	public SpeciesMismatchException()
	{
		super("Crossover cannot be applied to the specified parents. Their gene counts do not match");
	}
	
}
