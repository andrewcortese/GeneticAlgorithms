package ga;

public class EmptyGeneException extends GAException {

	public EmptyGeneException()
	{
		super("The referenced Gene contains no information. It may not have been properly initialized.");
	}
	
	
	
}
