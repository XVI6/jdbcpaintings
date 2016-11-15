package paintingsjdbc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import paintingsjdbc.domain.Painting;
import paintingsjdbc.domain.Reproduktor;

public class Tests {
	
	Manager manager = new Manager();
	
	private final static String name = "name";
	private final static String country = "country";
	private final static String city = "city";
	private final static String adress = "adress";
	private final static String house_num = "25/4a";
	private final static String telephone = "+58946853688";
	private final static String e_mail = "e_mail@mail.com";
	
	
	private final static String NAME_1 = "Reproduction The Starry Night";
	private final static int YOC_1 = 2011;
	private final static int COST_1 = 356;
	private final static String ARTIST_1 = "AnKnown";
	private final static String ORIGIN_Artist_1 = "Vincent van Gogh";
	
	@Test
	public void checkConnection(){
		assertNotNull(manager.getConnection());
	}
	
	/*
	@Test
	public void checkAddReproduktor() {
		// TODO Auto-generated method stub
		
		Reproduktor reproduktor = new Reproduktor(name, country, city, adress, house_num, telephone, e_mail);
		
		assertEquals(1, manager.addReproductor(reproduktor));
		
	}
	*/
	
	@Test
	public void checkAddPainting() {
		// TODO Auto-generated method stub
		
		Painting painting = new Painting(NAME_1, YOC_1, COST_1, ARTIST_1, ORIGIN_Artist_1);
		
		assertEquals(1, manager.addPainting(painting, name, e_mail));
		
	}
	
	
	
	
}
