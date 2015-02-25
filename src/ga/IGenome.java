package ga;


public interface IGenome {

	public IGene get(int index);
	public int[] getGeneIntegerValues();
	public int size();
	public boolean numGenesDivisibleBy(int factor);
	
	
}
