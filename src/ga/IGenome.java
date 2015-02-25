package ga;


public interface IGenome {

	public IGene[] getGenes();
	public void setGenes(IGene[] genes);
	public int[] getGeneIntegerValues();
	public int size();
	public boolean numGenesDivisibleBy(int factor);
	public String toString();
	
}
