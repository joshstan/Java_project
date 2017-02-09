package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import zoo.Cat;

public class TestCat {
	
	Cat cat = new Cat( 2, "Tigress", "Jungle", "Tiger", "Bengal",
			"large", 135, 311, 0, "Female", true, false);
	
	
	

	

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	
	//Name
	@Test
	public void setNameTest(){
		cat.setName("Tiggy");
		assertTrue(cat.getName().equals("Tiggy"));
	}
	
	@Test
	public void getNameTest(){
		assertEquals( "Tigress", cat.getName());
	}
	
	//Age
	@Test
	public void setAgeTest(){
		cat.setAge(4);
		assertEquals(4, cat.getAge()); //unsure why this is not working.
	}
	
	@Test
	public void getAgeTest(){
		assertEquals(2,cat.getAge()); //is this the right assert?
	}
	
	@Test
	public void setEnclosureTest(){
		cat.setEnclosure("Forest");
		assertTrue(cat.getEnclosure().equals("Forest"));
	}

	
	@Test
	public void getEnclosureTest(){
		assertEquals("Jungle", cat.getEnclosure());
	}
	
	@Test
	public void setSpeciesTest(){
		cat.setSpecies("Lion");
		assertTrue(cat.getSpecies().equals("Lion"));
	}

	
	@Test
	public void getSpeciesTest(){
		assertEquals( "Tiger", cat.getSpecies());
	} 
	
	

}
