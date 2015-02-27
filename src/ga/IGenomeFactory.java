package ga;

public interface IGenomeFactory {

	public IGenome construct(IGene[] genes);
	public IGenome constructRandom(IGeneFactory geneFactory, int size);
}
