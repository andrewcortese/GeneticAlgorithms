package ga;

public interface IPopulation {

	public IIndividual get(int index);
	public void add(IIndividual newIndividual);
	public int count();
	
}
