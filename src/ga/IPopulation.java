package ga;

import java.util.*;

interface IPopulation {

	public IIndividual get(int index);
	public void add(IIndividual newIndividual);
	public int count();
	public Iterator<IIndividual> getIterator();
	public IPopulation clone();

}
