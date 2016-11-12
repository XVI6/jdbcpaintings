package paintingsjdbc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import paintingsjdbc.domain.Reproduktor;

public class ReproductorManagerTest {
	
	ReproductorManager reproductorManager = new ReproductorManager();
	
	private final static String name = "name";
	private final static String country = "country";
	private final static String city = "city";
	private final static String adress = "adress";
	private final static String house_num = "25/4a";
	private final static String telephone = "+58946853688";
	private final static String e_mail = "e_mail@mail.com";
	
	
	@Test
	public void checkConnection(){
		assertNotNull(reproductorManager.getConnection());
	}
	
	//create
	@Test
	public void checkAddReproduktor() {
		// TODO Auto-generated method stub
		
		Reproduktor reproduktor = new Reproduktor(name, country, city, adress, house_num, telephone, e_mail);
		
		assertEquals(1, reproductorManager.addReproductor(reproduktor));
		
		
		List<Reproduktor> paintings = reproductorManager.getAllReproductor();
		Reproduktor reproduktorRetrieved = paintings.get(0);
		
		assertEquals(name, reproduktorRetrieved.getName());
		assertEquals(country, reproduktorRetrieved.getCountry());
		assertEquals(city, reproduktorRetrieved.getCity());
		assertEquals(adress, reproduktorRetrieved.getAdress());
		assertEquals(telephone, reproduktorRetrieved.getTelephone());
		assertEquals(e_mail, reproduktorRetrieved.getE_mail());
	}
	
	
	//read
	@Test
	public void checkReadReproduktor() {
		// TODO Auto-generated method stub
		
		List<Reproduktor> reproductors = reproductorManager.getAllReproductor();
		assertEquals(1, reproductors.size());
	}
	/*
	//update
	public void checkUpdateReproduktor() {
		// TODO Auto-generated method stub
		
		Reproduktor reproduktor1 = new Reproduktor(name, country, city, adress, telephone, e_mail);
		Reproduktor reproduktor2 = new Reproduktor(name, country, city, adress, telephone, e_mail);
		
		
		
	}
	*/
		
}
