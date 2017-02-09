package zoo;

public abstract class Animal implements livingThings{
	
	private int age;
	private String name;
	private String enclosure; //possibly made into an enum
	private String species;
	private String breed;
	private String size;
	private int weightKg;
	private int heightCm;
	int wasteCounter;
	private String sex;

	
	                      //////////Constructors/////////
	public Animal(int age, String name, String enclosure, String species, String breed, String size, int heightCm, int weightKg, int wasteCounter, String sex){
		
		this.age = age;
		this.name =name;
		this.enclosure = enclosure;
		this.species = species;
		this.breed = breed;
		this.size = size;
		this.heightCm = heightCm;
		this.weightKg = weightKg;
		this.wasteCounter = wasteCounter;
		this.sex = sex;
	}
	

	
	                     ////////////Methods////////////
	
	public void nutrition(){
		wasteCounter += (weightKg/4);
		excretion();
	}
	
	
	public void excretion(){
		
		System.out.print(wasteCounter);
		if (wasteCounter > (weightKg/2))
		setWasteCounter(0);
		System.out.print(wasteCounter);
	}	
	
	
	public void reproduce(Animal a, Animal b) 
	{
//	     if (man.getSex().equals(woman.getSex()))
//	    		 {
//	                System.out.print("Incompatible Animals due to gender");
//	              }
//	     else {
//	    	       return new ();
//	         }
	}

	
	public void respiration(){};
	public void movement(){};
	public void sensitivity(){}
	

	
	
                        //////Getters & Setters///////
	//Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//Name
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
		
	
	//Enclosure
	public String getEnclosure(){
		return enclosure;
	}
	public void setEnclosure(String enclosure){
		this.enclosure = enclosure;
	}
		
	
	//Species
	public String getSpecies(){
		return species;
	}
	public void setSpecies(String species){
		this.species = species;
	}
		
	
	// Breed
	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
		
	
	
	//Size
	public String getSize(){
		return size;
	}
	public void setSize(String size){
		this.size = size;
	}
	
	
	//Height
	public int getHeight(){
		return heightCm;
	}
	public void setHeight(int heightCm){
		this.heightCm = heightCm;
	}
		
	//Weight
	public int getWeight(){
		return weightKg;
	}
	public void setWeight(int weightKg){
		this.weightKg = weightKg;
	}
	
	
	
	//Sex
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	
	
	//Waste
	public int getWasteCounter(){
		return wasteCounter;
	}
	public void setWasteCounter(int wastecounter){
		this.wasteCounter = wastecounter;
	}
	
	}
		
	
	
	

