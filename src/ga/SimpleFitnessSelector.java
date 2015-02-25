package ga;


public class SimpleFitnessSelector implements IFitnessSelector {

	public boolean isFit(IIndividual individual)
	{
		IGenome genome = individual.getGenome();
		int[] genes = genome.getGeneIntegerValues();

		int sum = 0;
		for(int gene : genes)
		{
			sum+=gene;
		}
		
		if(sum > 5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
