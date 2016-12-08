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
	
	Reproduktor reproduktor = new Reproduktor(name1, country1, city1, adress1, house_num1, telephone1, e_mail1);
	Painting painting = new Painting(NAME, YOC, COST, ARTIST, ORIGIN_Artist);
	
	//@Test
	@Before
	public void checkConnection(){
		System.out.println("test connection");
		assertNotNull(manager.getConnection());
	}
	
	@Test
	public void checkAddReproduktor() {
		// TODO Auto-generated method stub
		System.out.println("Add reproductor");
		
		manager.clear();
		assertEquals(1, manager.addReproductor(reproduktor));
		manager.clear();
		
	}
	
	@Test
	public void checkAddPainting() {
		// TODO Auto-generated method stub
		System.out.println("Add painting");
		
		manager.clear();
		manager.addReproductor(reproduktor);
		assertEquals(1, manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail()));
		manager.clear();
	}
	
	
	
	
	@Test
	public void checkSelectAllReproduktors() {
		// TODO Auto-generated method stub
		System.out.println("select all reproductors");
		
		manager.clear();
		manager.addReproductor(reproduktor);
		assertEquals(1,manager.getAllReproductor().size());
		manager.clear();
	}
	
	@Test
	public void checkSelectAllPaintings() {
		// TODO Auto-generated method stub
		System.out.println("select all paintings");
		
		manager.clear();
		manager.addReproductor(reproduktor);
		manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail());
		assertEquals(1, manager.getAllPaintings().size());
		manager.clear();
	}

	
	@Test
	public void checkGetReproductorIdByName() {
		// TODO Auto-generated method stub
		System.out.println("Get reproductor id");

		manager.clear();
		manager.addReproductor(reproduktor);
		manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail());
		manager.clear();
	}
	
	@Test
	public void checkGetFromReproduktor() {
		// TODO Auto-generated method stub
		System.out.println("Get from reproductor");

		manager.clear();
		manager.addReproductor(reproduktor);
		
		reproduktor.setId(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		painting.setIdReproduktor(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		
		
		manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail());
		
		assertEquals(1,manager.getFromReproduktor(reproduktor).size());
		manager.clear();
	}
	
	@Test
	public void checkDeleteReproductorFromPaintin() {
		// TODO Auto-generated method stub
		System.out.println("Delete reproductor from paintings");
		
		manager.clear();
		manager.addReproductor(reproduktor);
		manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail());
		
		reproduktor.setId(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		painting.setIdReproduktor(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		
		assertEquals(1, manager.deleteReproductorFromPaintin(painting));
		manager.clear();
	}
	
	
	@Test
	public void checkUpdateReproductor() {
		System.out.println("Update reproductor");
		manager.clear();
		manager.addReproductor(reproduktor);
		Reproduktor r = new Reproduktor();
		r = reproduktor;
		r.setCountry("Poland");
		
		reproduktor.setId(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		painting.setIdReproduktor(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		
		assertEquals(1, manager.updateReproductor(reproduktor, r));
		
		manager.clear();
	}
	
	
	@Test
	public void checkUpdatePainting() {
		System.out.println("Update painting");
		
		manager.clear();
		manager.addReproductor(reproduktor);
		manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail());
		Painting p = new Painting();
		p.setName("NAME");
		p.setArtist("ARTIST");
		p.setYoc(1852);
		p.setCost(125);
		p.setOrigin_artist("ORIGIN");
		
		reproduktor.setId(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		painting.setId(manager.getPaintingIdByName(painting.getName(), painting.getYoc()));
		painting.setIdReproduktor(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		
		assertEquals(1, manager.UpdatePainting(painting, p));
		
		manager.clear();
	}
	
	@Test
	public void checkDeletePainting() {
		System.out.println("Delete painting");

		manager.clear();
		manager.addReproductor(reproduktor);
		manager.addPainting(painting, reproduktor.getName(), reproduktor.getE_mail());
		
		Reproduktor reproduktor2 = new Reproduktor("Imie", "Poland", "Gdansk", "Addsess", "23a", "+48546451684", "nowy@mail.com");
		Painting painting2= new Painting("Obraz", 2015, 251, "Nowy Artysta", "Dziwny Obraz");
		manager.addReproductor(reproduktor2);
		manager.addPainting(painting2, reproduktor2.getName(), reproduktor2.getE_mail());
		
		reproduktor.setId(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		painting.setId(manager.getPaintingIdByName(painting.getName(), painting.getYoc()));
		painting.setIdReproduktor(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		
		reproduktor2.setId(manager.getReproductorIdByName(reproduktor2.getName(), reproduktor2.getE_mail()));
		painting2.setId(manager.getPaintingIdByName(painting2.getName(), painting2.getYoc()));
		painting2.setIdReproduktor(manager.getReproductorIdByName(reproduktor2.getName(), reproduktor2.getE_mail()));
		
		
		
		assertEquals(1, manager.deletePainting(painting));
		
		assertEquals(-1, manager.getPaintingIdByName(painting.getName(), painting.getYoc()));
		
		assertEquals(1, manager.getAllPaintings().size());
		
		manager.clear();
		
	}
	
	//@Test
	@After
	public void checkDeleteReproductor() {
		// TODO Auto-generated method stub
		System.out.println("Delete reproductor");
		
		manager.clear();
		manager.addReproductor(reproduktor);
		
		Reproduktor reproduktor2 = new Reproduktor("Imie", "Poland", "Gdansk", "Addsess", "23a", "+48546451684", "nowy@mail.com");
		manager.addReproductor(reproduktor2);
		
		reproduktor.setId(manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		reproduktor2.setId(manager.getReproductorIdByName(reproduktor2.getName(), reproduktor2.getE_mail()));
		
		
		assertEquals(1, manager.deleteReproductor(reproduktor));
		assertEquals(-1, manager.getReproductorIdByName(reproduktor.getName(), reproduktor.getE_mail()));
		assertEquals(1, manager.getAllReproductor().size());
		
		manager.clear();
	}
}