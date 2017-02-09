package zoo;

public class Cat extends Animal {

	boolean endangered;
	boolean nocturnal;
	
	

	public Cat(int age, String name, String enclosure,
			String species, String breed, String size, int heightCm,
			int weightKg, int wasteCounter, String sex, boolean endangered, boolean nocturnal)
	{
	super(age, name, enclosure,
			species, breed, size, heightCm,
			weightKg, wasteCounter, sex);	
	this.endangered = endangered;
	this.nocturnal = nocturnal;
	
	}
	
	
	
	@Override
	public void growth(){}
	

//	public void nutrition(){}



}
