package zoo;

abstract class Amphibian extends Animal implements Swim{
	
	
	String lifeCycle; //will need to change this to an enum
	
	                  ///////////Constructor//////////////
	Amphibian(){};
	
	                 //////////////Methods///////////////
	
	public void nutrition(){};
	public void growth(){};
	public void submerge(){};
	public void emerge(){};
	public void floating(){};
	
                     ////////Getters & Setters/////////	
	
	//Life Cycle
	public String getLifeCycle(){
		return lifeCycle;
	}
	public void setLifeCycle(String lifeCycle){
	this.lifeCycle = lifeCycle;
	}
}
