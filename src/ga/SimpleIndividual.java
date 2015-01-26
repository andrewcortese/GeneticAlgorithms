package ga;

public class SimpleIndividual implements IIndividual {

	private IGenome genome;
	
	public SimpleIndividual(IGenome genome)
	{
		this.genome = genome;
	}
	
	public IGenome getGenome()
	{
		return this.genome;
	}
	
}
