package ga;

public class TwoOneCrossover implements ITwoOneCrossoverController {

	private IRandomChance randomChance = new RandomChance();
	private IMatchValidator matchValidator = new MatchValidator();
	
	@Override
	public IGenome crossover(IGenome parent1, IGenome parent2, IGenomeFactory childFactory) {
				
		int numGenes;
	
		IGenome[] parents = {parent1, parent2};
		if(matchValidator.canCrossover(parents))
		{
			numGenes = parent1.size();
		}
		else
		{
			throw new SpeciesMismatchException();
		}
		
		
		//get the arrays of genes
		IGene[] childGenes = new IGene[numGenes];
		IGene[] parent1Genes = parent1.getGenes();
		IGene[] parent2Genes = parent2.getGenes();
		
		
		
		for(int i=0; i<numGenes; i++)
		{
			if(randomChance.rollDie(2) == 0)
			{
				childGenes[i] = parent1Genes[i];
			}
			else
			{
				childGenes[i] = parent2Genes[i];
			}
		}
		
		
		IGenome child = childFactory.construct(childGenes);
		return child;
	}
	
}


