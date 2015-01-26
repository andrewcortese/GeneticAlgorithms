package ga;


public interface IGenome {

	public int[] getGenes();
	public int getNumGenes();
	public boolean numGenesDivisibleBy(int factor);
	
	
}
