package ga;

public class Gene implements IGene {

	int[] values;
	
	public Gene(int primaryValue)
	{
		this.values = new int[1];
		this.values[0] = primaryValue;
	}
	
	public Gene(int[] values)
	{
		this.values = values;
	}
	
	public Gene()
	{
		this(0);
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}
	
	public int getPrimaryValue(){
		if(values == null || values.length == 0)
		{
			throw new EmptyGeneException();
		}
		return this.getValues()[0];
	}
	
	public void setPrimaryValue(int value)
	{
		if(values != null && values.length > 0)
		{
			this.values[0] = value;
		}
		else
		{
			this.setValues(new int[1]);
			this.values[0] = value;
		}
	}
	
	public Object getGeneticInformation()
	{
		return (Object)(new Integer(this.getPrimaryValue()));
	}
	
	
	
	
}
