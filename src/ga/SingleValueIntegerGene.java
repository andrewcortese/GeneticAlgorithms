package ga;

public class SingleValueIntegerGene implements IGene {

	private int value;

	public SingleValueIntegerGene(int value)
	{
		this.value = value;
	}
	
	@Override
	public Object getGeneticInformation() {
		return (Object)(new Integer(this.value));
	}
	
	@Override
	public void setGeneticInformation(Object newGeneticInformation) {
		this.value = (Integer)newGeneticInformation;
	}

}
