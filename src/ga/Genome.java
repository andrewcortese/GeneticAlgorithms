/**
 * 
 */
package ga;

/**
 * @author Andrew
 *
 */
import java.util.*;
public class Genome implements IGenome{
	
	
	private ArrayList<IGene> genes;
	private int size = 0;
	
	
	public Genome(IGene[] genes)
	{
		this.setGenes(genes);
	}
	
	public Genome()
	{
		this.genes = new ArrayList<IGene>();
		this.size = 0;
	}
	

	//TODO: move to subclass
	public Genome(int[] values)
	{
		this.genes = new ArrayList<IGene>();
		for(int i : values)
		{
			this.genes.add(new SingleValueIntegerGene(i));
		}
	
		this.size = this.genes.size();
	}
	
	public IGene[] getGenes()
	{
		IGene[] genes = new IGene[this.size];
		for(int i=0; i<size; i++)
		{
			genes[i] = this.genes.get(i).clone();
		}
		return genes;
	}
	
	public void setGenes(IGene[] genes)
	{
		this.genes = new ArrayList<IGene>();
		this.size = genes.length;
		for(IGene g : genes)
		{
			this.genes.add(g);
		}
	}
	
	//TODO: move to subclass
	public int[] getGeneIntegerValues()
	{
		int[] values = new int[this.size()];
		for(int i=0; i<values.length; i++)
		{
			values[i] = ((Integer)this.genes.get(i).getGeneticInformation());
		}
		return values;
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
