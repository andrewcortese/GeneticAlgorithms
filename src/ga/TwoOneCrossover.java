package ga;

public class TwoOneCrossover implements ITwoOneCrossoverController {

	private IRandomChance randomChance = new RandomChance();
	private IMatchValidator matchValidator = new MatchValidator();
	
	@Override
	public IGenome crossover(IGenome parent1, IGenome parent2) {
				
		int numGenes;
	
		if(parent1.size() != parent2.size() ||
		   false == parent1.getClass().equals(parent2.getClass()))
		{
			throw new SpeciesMismatchException();
		}
		else
		{
			numGenes = parent1.size();
		}
		
		
		
		if(numGenes % 2 == 0)
		{
		 
		}
		
		// TODO Auto-generated method stub
		return null;
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
