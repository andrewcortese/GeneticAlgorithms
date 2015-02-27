package ga;

public class GenomeFactory implements IGenomeFactory {

	public IGenome construct(IGene[] genes)
	{
		IGenome genome = new Genome(genes);
		return genome;
	}
	
}
