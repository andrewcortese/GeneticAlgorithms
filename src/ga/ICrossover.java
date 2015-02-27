package ga;

public interface ICrossover {

	public IGenome crossover(IGenome[] parents, IGenomeFactory childFactory);
	
}
