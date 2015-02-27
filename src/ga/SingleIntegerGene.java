package ga;

public class SingleIntegerGene implements IGene {

	//FIELDS
	private int value;

	
	//CONSTRUCTORS
	public SingleIntegerGene(int value)
	{
		this.value = value;
	}
	
	/**
	 * Construct a Gene with a random integer value.
	 * The value will be in: minVal <= x <= maxVal
	 * @param minVal the minumum possible value
	 * @param maxVal the maxmimum possible value
	 */
	public SingleIntegerGene(int minVal, int maxVal)
	{
		
	}
	
	//METHODS
	
	
	
	
	
	//INHERITED METHODS FROM IGene
	
	@Override
	public Object getGeneticInformation() {
		return (Object)(new Integer(this.value));
	}
	
	@Override
	public void setGeneticInformation(Object newGeneticInformation) {
		this.value = (Integer)newGeneticInformation;
	}
	
	@Override
	public IGene clone()
	{
		IGene clone = new SingleIntegerGene(this.value);
		return clone;
	}

}
