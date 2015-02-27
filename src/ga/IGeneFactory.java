package ga;

public interface IGeneFactory {

	public IGene construct(Object geneticInformation);
	public IGene constructRandom();
	
}
