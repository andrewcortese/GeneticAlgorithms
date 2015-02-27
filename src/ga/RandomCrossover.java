package ga;
import java.util.*;
public class RandomCrossover implements ICrossover {

	IMatchValidator matchValidator = new MatchValidator();
	
	
	@Override
	public IGenome crossover(IGenome[] parents, IGenomeFactory childFactory) {

		int numGenes;
		
		//validate
		if(matchValidator.canCrossover(parents))
		{
			numGenes = parents[0].size();
		}
		else
		{
			throw new SpeciesMismatchException();
		}
		
		//perform crossover
		IGene[] childGenes = new IGene[numGenes];
		for(int i=0; i<numGenes; i++)
		{
			int parent = (new Random()).nextInt(parents.length);
			childGenes[i] = parents[parent].getGenes()[i];
		}
		
		//construct and return
		IGenome child = childFactory.construct(childGenes);
		return child;
	}

}
