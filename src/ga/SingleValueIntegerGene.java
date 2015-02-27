package ga;

public class SingleValueIntegerGene implements IGene {

	//FIELDS
	private int value;

	
	//CONSTRUCTORS
	public SingleValueIntegerGene(int value)
	{
		this.value = value;
	}
	
	
	public SingleValueIntegerGene()
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
		IGene clone = new SingleValueIntegerGene(this.value);
		return clone;
	}

}
