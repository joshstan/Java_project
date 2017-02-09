package zoo;

abstract class Animal implements livingThings{
	
	private int age;
	private String name;
	private String enclosure; //possibly made into an enum
	private String species;
	private String breed;
	private String size;
	private int weight;
	private int height;
	private String health;
	int foodCounter;// do we need this?
	int wasteCounter;
	
	//for eating
	//if waste counter = weight/2
			//animal.excerete

	
	                      //////////Constructors/////////
	Animal(int age, String name, String enclosure, String species, String breed, String size, int height, int weight){
		
		this.age = age;
		this.name =name;
		this.enclosure = enclosure;
		this.species = species;
		this.breed = breed;
		this.size = size;
		this.height = height;
		this.weight = weight;
	}
	
	Animal(){}
	
	                     ////////////Methods////////////
	
	public void excretion(){
		
		if (wasteCounter > (weight/2))
		setWasteCounter(0);
	}	
	
	public void reproduction(Object a, Object b){
		// if object a == object b? create new object
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
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
		
	//Weight
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	
	//Health
	public String getHealth(){
		return health;
	}
	public void setHealth(String health){
		this.health = health;
	}
	
	//Food Counter
	public int getFoodCounter(){
		return foodCounter;
	}
	public void setFoodCounter(int foodCounter){
		this.foodCounter = foodCounter;
	}
	
	
	//Waste
	public int getWasteCounter(){
		return wasteCounter;
	}
	public void setWasteCounter(int wastecounter){
		this.wasteCounter = wastecounter;
	}
	
	}
		
	
	
	

