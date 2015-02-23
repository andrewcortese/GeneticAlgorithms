package ga;
/**
 * 
 */

/**
 * @author Andrew
 *
 */
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int populationSize = 144;
		final int numGenes = 6;
		final int numGenerations = 50;
		
		IMutator mutator = new SimpleMutator();
		SimpleReproductionController recombinator = new SimpleReproductionController(mutator);
		
		IFitnessSelector selector = new SimpleFitnessSelector();
		
		//construct population 1 with random genes
		ArrayList<IIndividual> population = new ArrayList<IIndividual>();
		for(int i=0; i<populationSize; i++)
		{
			population.add(new SimpleIndividual(new SimpleGenome(randomGenome(numGenes))));
		}
		
		//construct population 2 with identical genes to population 1
		//i.e. individual 1 in pop1 has the same starting genes as individual 1 in pop2.
		ArrayList<IIndividual> population2 = new ArrayList<IIndividual>();
		for(IIndividual i : population)
		{
			int[] genes = new int[numGenes];
			System.arraycopy(i.getGenome().getGenes(), 0, genes, 0, numGenes);
			population2.add(new SimpleIndividual(new SimpleGenome(genes)));
		}
		
		
		
		//initial print
		for(IIndividual i: population)
		{
			System.out.println(i.getGenome().toString());
		}
		
		
		//reproduce pop1 using two-parent recombination
		for(int i=0; i<numGenerations; i++)
		{
			ArrayList<IIndividual> offspring = new ArrayList<IIndividual>();
			while(offspring.size() < populationSize)
			{
				System.out.println(offspring.size() + "/" + populationSize);
				Random r = new Random();
				int index1 = -1;
				int index2 = -1;
				boolean fit = false;
				
				//choose first parent
				while(!fit)
				{
					index1 = r.nextInt(populationSize);
					if(selector.isFit(population.get(index1)))
					{
						fit=true;
					}
					
				}
				
				//choose second parent
				fit=false;
				while(!fit || index1==index2)
				{
					index2 = r.nextInt(populationSize);
					if(selector.isFit(population.get(index2)))
					{
						fit=true;
					}
					
				}
				
				//reproduce
				IGenome[] parents = new IGenome[2];
				parents[0] = population.get(index1).getGenome();
				parents[1] = population.get(index2).getGenome();
				IGenome[] offsprings = recombinator.reproduce(parents);
				
				offspring.add(new SimpleIndividual(offsprings[0]));
			
			}
			
			population = offspring;
		}
		
		
		
		//reproduce pop2 using three-parent recombination
		
		
		
		
		//print
		for(IIndividual i: population)
		{
			System.out.println(i.getGenome().toString());
		}
		
	}


	
	static int[] randomGenome(int numGenes)
	{
		int[] genes = new int[numGenes];
		for(int i=0; i<numGenes; i++)
		{
			int val = (int)(Math.random()*10);
			genes[i] = val;
		}
		return genes;
	}
}
