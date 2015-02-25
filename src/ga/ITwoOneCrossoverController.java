/**
 * 
 */
package ga;

/**
 * @author Andrew
 *
 */
public interface ITwoOneCrossoverController extends ICrossoverController {
	
	public IGenome crossover(IGenome parent1, IGenome parent2, IGenome child);
	
}
