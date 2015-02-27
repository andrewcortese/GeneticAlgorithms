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
		
		return childFactory.construct(childGenes);
	}
	
	
	
}


