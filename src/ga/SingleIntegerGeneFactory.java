package ga;

public class SingleIntegerGeneFactory implements IGeneFactory {

	@Override
	public IGene construct(Object geneticInformation) {
		
		int value = -1;
		if(Object.class.equals(Integer.class))
		{
			value = (Integer)geneticInformation;
			
		}
		else
		{
			throw new GAException("Cannot cast genetic information to appropriate type");
		}
		
		
		IGene gene = new SingleIntegerGene(value);
		return gene;
	}

	@Override
	public IGene constructRandom() {
		java.util.Random r = new java.util.Random();
		int value = r.nextInt(9);
		IGene gene = new SingleIntegerGene(value);
		return gene;
	}

}
