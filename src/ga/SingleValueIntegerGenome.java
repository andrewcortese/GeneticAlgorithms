/**
 * 
 */
package ga;

/**
 * @author Andrew
 *
 */
import java.util.*;
public class SingleValueIntegerGenome implements IGenome {
	
	
	private ArrayList<IGene> genes;
	private int size = 0;
	
	public SingleValueIntegerGenome(int numGenes)
	{
		this.genes = new ArrayList<IGene>();
		
		this.size = numGenes;
	}
	
	public SingleValueIntegerGenome(int[] values)
	{
		this.genes = new ArrayList<IGene>();
		for(int i : values)
		{
			this.genes.add(new SingleValueIntegerGene(i));
		}
	
		this.size = this.genes.size();
	}
	

	public int[] getGeneIntegerValues()
	{
		int[] values = new int[this.size()];
		for(int i=0; i<values.length; i++)
		{
			values[i] = ((Integer)this.get(i).getGeneticInformation());
		}
		return values;
	}
	
	public IGene get(int index)
	{
		return genes.get(index);
	}
	
	public int size()
	{
		return this.size;
	}

	public boolean numGenesDivisibleBy(int factor)
	{
		return ((this.size() % factor) == 0);
	}
	
	public String toString()
	{
		String s = new String();
		for(int i : this.getGeneIntegerValues())
		{
			s += (i + " ");
		}
		return s;
	}

}
