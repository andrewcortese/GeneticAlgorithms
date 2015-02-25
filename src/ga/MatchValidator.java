package ga;

public class MatchValidator implements IMatchValidator {

	public boolean canCrossover(IIndividual[] parents)
	{
		boolean valid = true;
		int genomeSize = -1;
		IIndividual first;
		if(parents == null || parents.length == 0)
		{
			//NOTE: should this be true or false?
			return true;
		}
		else
		{
			first = parents[0];
			genomeSize = first.getGenome().size();
		}
		
		for(IIndividual i : parents)
		{
			//if the genomes are different sizes, not valid
			if(i.getGenome().size() != genomeSize)
			{
				valid = false;
			}
			
			//if the genomes are different types, not valid
			if(false == i.getGenome().getClass().equals(first.getGenome().getClass()))
			{
				valid = false;
			}
			
			//if the individuals are different types, not valid
			if(false == i.getClass().equals(first.getClass()))
			{
				valid = false;
			}
			
			
			 
		}
		
		return valid;
	}
	
}
