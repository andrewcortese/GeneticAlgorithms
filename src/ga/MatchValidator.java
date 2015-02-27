package ga;

public class MatchValidator implements IMatchValidator {

	/**
	 * Method to determine whether a set of parents can crossover.
	 * A set is capable of crossover if
	 *    (1) The number of genes is equivalent
	 *    (2) The IGenome implementations are the same Class
	 *    
	 * @return true if capable, false otherwise
	 */
	public boolean canCrossover(IGenome[] parents)
	{
		boolean valid = true;
		int genomeSize = -1;
		IGenome first;
		if(parents == null || parents.length == 0)
		{
			//NOTE: should this be true or false?
			return true;
		}
		else
		{
			first = parents[0];
			genomeSize = first.size();
		}
		
		for(IGenome i : parents)
		{
			//if the genomes are different sizes, not valid
			if(i.size() != genomeSize)
			{
				valid = false;
			}
			
			//if the genomes are different types, not valid
			if(false == i.getClass().equals(first.getClass()))
			{
				valid = false;
			}	 
		}
		
		return valid;
	}
	
}
