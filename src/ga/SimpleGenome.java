/**
 * 
 */
package ga;

/**
 * @author Andrew
 *
 */
public class SimpleGenome implements IGenome {
	
	
	
	private int[] genes;
	private int numGenes = 0;
	
	public SimpleGenome(int numGenes)
	{
		genes = new int[numGenes];
		this.numGenes = numGenes;
	}
	
	public SimpleGenome(int[] genes)
	{
		this.genes = genes;
		if(genes != null)
		{
			this.numGenes = genes.length;
		}
		else
		{
			this.numGenes = 0;
		}
	}
	
	public void setGenes(int[] genes) 
	{
		this.genes = genes;
	}

	public int[] getGenes()
	{
		return genes;
	}
	
	public int getGene(int index)
	{
		if(index <= this.getNumGenes())
		{
			return this.genes[index];
		}
		else
		{
			return -1;
		}
	}

	public int getNumGenes()
	{
		return this.numGenes;
	}

	public boolean numGenesDivisibleBy(int factor)
	{
		return ((this.getNumGenes() % factor) == 0);
	}
	
	public String toString()
	{
		String s = new String();
		for(int i : this.getGenes())
		{
			s += (i + " ");
		}
		return s;
	}

}
