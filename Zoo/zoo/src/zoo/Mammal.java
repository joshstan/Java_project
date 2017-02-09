package zoo;

public abstract class Mammal extends Animal implements Run {
	
	String lifeCycle;
      
	
	                     //Constructors// 
	Mammal(int age, String name, String enclosure, String species, 
			String breed,String size, int heightCm, int weightKg, 
			int wasteCounter, String sex)
	{	
		super(age, name, enclosure,
				species, breed, size, heightCm,
				weightKg, wasteCounter, sex);
	};
	
	
	
                        ////Methods////
	
	public void growth(){};
	public void sprint(){};
	
	
	//Life Cycle
	public String getLifeCycle(){
		return lifeCycle;
	}
	public void setLifeCycle(String lifeCycle){
	this.lifeCycle = lifeCycle;
	}
	

}
