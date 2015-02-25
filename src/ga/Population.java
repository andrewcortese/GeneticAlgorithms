package ga;

import java.util.*;

public class Population implements IPopulation {

	private ArrayList<IIndividual> members;
	private int numGenesPerIndividual;
	
	/**
	 * Construct a population with the specifies number of individuals.
	 * Each individual will have the specifies genome size and their genes will have random values.
	 * @param numIndividuals
	 * @param numGenesPerIndividual
	 */
	public Population(int numIndividuals, int numGenesPerIndividual)
	{
		this.members = new ArrayList<IIndividual>();
		this.numGenesPerIndividual = numGenesPerIndividual;
	}
	
	/**
	 * Construct an EMPTY population with the specifies genome size
	 * @param numGenesPerIndividual the genome size of each individual
	 */
	public Population(int numGenesPerIndividual)
	{
		this.members = new ArrayList<IIndividual>();
		this.numGenesPerIndividual = numGenesPerIndividual;
	}
	
	/**
	 * Size of the genome of each individual in this population.
	 * @return the number of genes in the genome
	 */
	public int getNumGenesPerIndividual() {
		return numGenesPerIndividual;
	}

	/**
	 * 
	 * @param numGenesPerIndividual
	 */
	public void setNumGenesPerIndividual(int numGenesPerIndividual) {
		this.numGenesPerIndividual = numGenesPerIndividual;
	}


	@Override
	public void add(IIndividual newIndividual) {
		members.add(newIndividual);
	}

	@Override
	public int count() {
		return members.size();
	}

	@Override
	public IIndividual get(int index) {
		return members.get(index);
	}

	@Override
	public Iterator<IIndividual> getIterator() {
		Iterator<IIndividual> iterator = members.iterator();
		return iterator;
	}
	
	/**
	 * Create a shallow copy of this population.
	 * Each individual in the new population will have the same genetic information as the corresponding
	 *  	individual in this one.
	 *  
	 *  @return a shallow copy of this population, whose members are shallow copies of the members of thie one.
	 */
	@Override
	public IPopulation clone()
	{
		int numGenes = this.getNumGenesPerIndividual();
		IPopulation population2 = new Population(numGenes);
		Iterator<IIndividual> iterator = this.getIterator();
		for(IIndividual i = iterator.next(); iterator.hasNext(); i = iterator.next())
		{
			int[] genes = new int[numGenes];
			System.arraycopy(i.getGenome().getGeneIntegerValues(), 0, genes, 0, numGenes);
			population2.add(new SimpleIndividual(new Genome(genes)));
		}
		
		return population2;
	}
	
	
	public String toString()
	{
		String populationString = new String();
		Iterator<IIndividual> iterator = this.getIterator();
		while(iterator.hasNext())
		{
			IIndividual i = iterator.next();
			populationString += i.toString() + "\n";
		}
		
		return populationString;
	}

}
