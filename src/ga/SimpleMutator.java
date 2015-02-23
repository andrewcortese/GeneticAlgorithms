package ga;

public class SimpleMutator implements IMutator {

	double mutationChanceCoefficient;
	
	
	public SimpleMutator()
	{
		mutationChanceCoefficient = 0.05;
	}
	
	public SimpleMutator(int mutationChanceCoefficient)
	{
		this.mutationChanceCoefficient = mutationChanceCoefficient;
	}
	
	@Override
	public IGenome mutate(IGenome original) {
 
		//hack!
		return original;
		/*
		int[] genes = original.getGenes();
		int[] newGenes = new int[genes.length];
		
		
		for(int i=0; i<genes.length; i++)
		{
			if(isVariation())
			{
				newGenes[i] = doVariation(genes[i]);
			}
		}
		
		return new SimpleGenome(newGenes);
		*/
	}
	
	
	private boolean isVariation()
	{
		return (Math.random() <= mutationChanceCoefficient);
	}

	private int doVariation(int gene)
	{
		int variationAmount = variationAmount();
		return gene + variationAmount;
	}
	
	private int variationAmount()
	{
		double random = Math.random();
		if(random<0.5)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
