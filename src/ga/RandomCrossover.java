package ga;
import java.util.*;
public class RandomCrossover implements ICrossover {

	IMatchValidator matchValidator = new MatchValidator();
	
	
	@Override
	public IGenome crossover(IGenome[] parents, IGenomeFactory childFactory) {
		int numGenes;
		
		
		if(parents == null || parents.length == 0)
		{
			throw new GAException("no parents");
		}
		
		
		if(matchValidator.canCrossover(parents))
		{
			numGenes = parents[0].size();
		}
		else
		{
			throw new SpeciesMismatchException();
		}
		
		
		//get the arrays of genes
		IGene[] childGenes = new IGene[numGenes];
		
		
		//copy child genes
		for(int i=0; i<numGenes; i++)
		{
			int parent = (new Random()).nextInt(parents.length);
			childGenes[i] = parents[parent].getGenes()[i];
		}
		
		
		IGenome child = childFactory.construct(childGenes);
		return child;
	}

}
