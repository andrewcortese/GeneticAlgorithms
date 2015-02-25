package ga;

public class TwoOneCrossover implements ITwoOneCrossoverController {

	private IRandomChance randomChance = new RandomChance();
	private IMatchValidator matchValidator = new MatchValidator();
	
	@Override
	public IGenome crossover(IGenome parent1, IGenome parent2, IGenome child) {
				
		int numGenes;
	
		if(parent1.size() != parent2.size() ||
		   false == parent1.getClass().equals(parent2.getClass()) ||
		   false == parent1.getClass().equals(parent2.getClass()))
		{
			throw new SpeciesMismatchException();
		}
		else
		{
			numGenes = parent1.size();
		}
		
		
		IGene[] childGenes = new IGene[numGenes];
		IGene[] parent1Genes = parent1.getGenes();
		IGene[] parent2Genes = parent2.getGenes();
		if(numGenes % 2 == 0)
		{
		 for(int i=0; i<numGenes/2; i++)
		 {
			 childGenes[i] = parent1Genes[i];
		 }
		 for(int j=numGenes/2; j<numGenes; j++)
		 {
			 childGenes[j] = parent2Genes[j];
		 }
		}
		
		child = new Genome(childGenes);
		return child;
	}
	
	
	private IGenome halfwaySplit(IGenome genome1, IGenome genome2)
	{
		
		if(randomChance.rollDie(2) == 1)		
		{
			
			return null;
		}
		else
		{
			
			return null;
		}
	}

}
