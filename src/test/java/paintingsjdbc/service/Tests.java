package paintingsjdbc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import paintingsjdbc.domain.Painting;
import paintingsjdbc.domain.Reproduktor;

public class Tests {
	
	Manager manager = new Manager();
	
	
	
	
	private final static String name1 = "name";
	private final static String country1 = "country";
	private final static String city1 = "city";
	private final static String adress1 = "adress";
	private final static String house_num1 = "25/4a";
	private final static String telephone1 = "+58946853688";
	private final static String e_mail1 = "e_mail@mail.com";
	
	
	private final static String NAME = "Reproduction The Starry Night";
	private final static int YOC = 2011;
	private final static int COST = 356;
	private final static String ARTIST = "AnKnown";
	private final static String ORIGIN_Artist = "Vincent van Gogh";
	
	/*
	private final static String name = "imie";
	private final static String country = "kraj";
	private final static String city = "miasto";
	private final static String adress = "adres";
	private final static String house_num = "2/4a";
	private final static String e_mail = "nowy_mail@mail.com";
	private final static String telephone = "+48645614928";
	
	private final static String NAME1 = "Reproduction Mapa Swiata";
	private final static int YOC1 = 2015;
	private final static int COST1 = 102;
	private final static String ARTIST1 = "Nowy";
	private final static String ORIGIN_Artist1 = "nie znany";
	*/
	
	Reproduktor reproduktor = new Reproduktor(name1, country1, city1, adress1, house_num1, telephone1, e_mail1);
	Painting painting = new Painting(NAME, YOC, COST, ARTIST, ORIGIN_Artist);
	
	//Reproduktor reproduktor1 = new Reproduktor(name, country, city, adress, house_num, telephone, e_mail);
	//Painting painting1 = new Painting(NAME, YOC, COST, ARTIST, ORIGIN_Artist);
	
	@Test
	public void checkConnection(){
		assertNotNull(manager.getConnection());
		System.out.println("connection");
	}
	/*
	@Test
	public void checkAddReproduktor() {
		// TODO Auto-generated method stub
		
		assertEquals(1, manager.addReproductor(reproduktor));
		System.out.println("add reproductor");
		
	}
	
	@Test
	public void checkAddPainting() {
		// TODO Auto-generated method stub
		
		assertEquals(1, manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail()));
		System.out.println("add painting");
	}
	
	*/
	
	
	@Test
	public void checkSelectAllReproduktors() {
		// TODO Auto-generated method stub
		
		assertEquals(1,manager.getAllReproductor().size());
		System.out.println("select all rep");
	}
	
	@Test
	public void checkSelectAllPaintings() {
		// TODO Auto-generated method stub
		
		assertEquals(1, manager.getAllPaintings().size());
		
		System.out.println("select all paint");
	}
	
	@Test
	public void checkGetReproductorIdByName() {
		// TODO Auto-generated method stub
		
		manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail());
		System.out.println("get repr id");
	}
	
	@Test
	public void checkGetFromReproduktor() {
		// TODO Auto-generated method stub
		
		assertEquals(1,manager.getFromReproduktor(reproduktor).size());
		System.out.println("get from rep");
	}
	
	//@Test
	public void checkDeleteReproductorFromPaintin() {
		// TODO Auto-generated method stub
		assertEquals(1, manager.deleteReproductorFromPaintin(painting));
		System.out.println("del rep from paint");
	}
	
	@Test
	public void checkUpdateReproductor() {
		Reproduktor r = new Reproduktor();
		r = reproduktor;
		r.setCountry("Poland");
		assertEquals(1, manager.updateReproductor(reproduktor, r));
		System.out.println("upd rep");
	}
	
	@Test
	public void checkUpdatePainting() {
		Painting p = new Painting();
		p = painting;
		p.setYoc(1852);
		assertEquals(1, manager.UpdatePainting(painting, p));
		System.out.println("upd paint");
	}
	
	/*
	//@Test
	public void checkDeletePainting() {
		assertEquals(1, manager.deletePainting(painting));
		assertEquals(0, manager.getPaintingIdByName(painting.getName(), painting.getYoc()));
		assertEquals(0, manager.getAllPaintings().size());
		System.out.println("delete paint1");
	}
	
	//@Test
	public void checkDeleteReproductor() {
		// TODO Auto-generated method stub
		assertEquals(1, manager.deleteReproductor(reproduktor));
		assertEquals(0, manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		assertEquals(0, manager.getAllReproductor().size());
		System.out.println("delete rep1");
	}
	*/
	
	
	//@Test
	@Before
	public void checkAdd() {
		// TODO Auto-generated method stub
		assertEquals(1, manager.addReproductor(reproduktor));
		System.out.println("add reproductor");
		
		assertEquals(1, manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail()));
		System.out.println("add painting");
	}
	
	
	
	
	@After
	public void checkDelete() {
		assertEquals(1, manager.deletePainting(painting));
		assertEquals(0, manager.getPaintingIdByName(painting.getName(), painting.getYoc()));
		assertEquals(0, manager.getAllPaintings().size());
		System.out.println("delete paint");
		
		assertEquals(1, manager.deleteReproductor(reproduktor));
		assertEquals(0, manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		assertEquals(0, manager.getAllReproductor().size());
		//manager.deleteReproductor(reproduktor);
		System.out.println("delete rep");
	}
	/**/
}