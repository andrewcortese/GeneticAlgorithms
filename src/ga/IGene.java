package ga;

public interface IGene {

	public int[] getValues();
	public int getPrimaryValue();
	public void setValues(int[] values);
	public void setPrimaryValue(int value);
}
