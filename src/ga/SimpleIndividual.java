package ga;

public class SimpleIndividual implements IIndividual {

	private IGenome genome;
	
	public SimpleIndividual(IGenome genome)
	{
		this.genome = genome;
	}
	
	/**
	 * generates a SimpleIndividual with a random genome
	 */
	public SimpleIndividual()
	{
		
	}
	
	public IGenome getGenome()
	{
		return this.genome;
	}
	
	public String toString()
	{
		return this.getGenome().toString();
	}
	
	
}
