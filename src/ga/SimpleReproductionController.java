package ga;


public class SimpleReproductionController implements IReproductionController {

	IMutator mutator;
	
	public SimpleReproductionController(IMutator mutator)
	{
		this.mutator = mutator;
	}
	
	
	@Override
	public IGenome[] reproduce(IGenome[] parents) {
		
		
		
		
		IGenome[] offsprings = new IGenome[1];
		IGenome offspring;
		
		if(parents == null || parents.length == 0)
		{
			offspring = noParents();
		}
		else if(parents.length == 1)
		{
			offspring = singleParent(parents[0]);
		}
		else if(parents.length == 2)
		{
			offspring = twoParents(parents[0], parents[1]);
		}
		else if(parents.length == 3)
		{
			offspring = threeParents(parents[0], parents[1], parents[2]);
		}
		else
		{
			offspring = threeParents(parents[0], parents[1], parents[2]);
		}
		
		offsprings[0] = offspring;
		return offsprings;
		
	}
	
	
	private IGenome noParents()
	{
		return null;
	}
	
	private IGenome singleParent(IGenome parent)
	{
		return this.mutator.mutate(parent);
	}
	
	private IGenome twoParents(IGenome parent1, IGenome parent2)
	{
		int[] genes1 = parent1.getGenes();
		int[] genes2 = parent2.getGenes();
		int[] newGenes = new int[genes1.length];
		

		if(parent1.numGenesDivisibleBy(2) && parent2.numGenesDivisibleBy(2))
		{
			int currentPosition=0;
			for(int i=0; i<genes1.length/2; i++)
			{
				newGenes[i] = genes1[i];
				currentPosition=i;
			}
			currentPosition++;
			
			for(int i=currentPosition; i<genes2.length; i++)
			{
				newGenes[i] = genes2[i];
			}
		}
		
		else
		{
			
		}
		
		IGenome offspring = new SimpleGenome(newGenes);
		return this.mutator.mutate(offspring);
	}
	
	
	private IGenome threeParents(IGenome parent1, IGenome parent2, IGenome parent3)
	{
		int[] genes1 = parent1.getGenes();
		int[] genes2 = parent2.getGenes();
		int[] genes3 = parent3.getGenes();
		
		int[] newGenes = new int[genes1.length];
		
		if(parent1.numGenesDivisibleBy(3) &&
		   parent2.numGenesDivisibleBy(3) &&
		   parent3.numGenesDivisibleBy(3))
		{
			int currentPosition = 0;
			for(int i=currentPosition; i<genes1.length/3; i++)
			{
				newGenes[i] = genes1[i];
				currentPosition=i;
			}
			
			currentPosition++;
			
			for(int i=currentPosition; i<2*genes2.length/3; i++)
			{
				newGenes[i] = genes2[i];
				currentPosition=i;
			}
			
			currentPosition++;
			
			for(int i=currentPosition; i<genes3.length; i++)
			{
				newGenes[i] = genes3[i];
			}
			
		}
		else
		{
			
		}
		
		IGenome offspring = new SimpleGenome(newGenes);
		return this.mutator.mutate(offspring);
	}

}
