package paintingsjdbc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import paintingsjdbc.domain.*;

public class PaintingManagerTest {
	
	PaintingManager paintingManager = new PaintingManager();
	
	private final static String NAME_1 = "Reproduction The Starry Night";
	private final static int YOC_1 = 2011;
	private final static String ARTIST_1 = "Donald Corporation";
	private final static String ORIGIN_Artist_1 = "Vincent van Gogh";
	private final static int COST_1 = 356;
	
	private final static String name = "name";
	private final static String country = "country";
	private final static String city = "city";
	private final static String adress = "adress";
	
	@Test
	public void checkConnection(){
		assertNotNull(paintingManager.getConnection());
	}
	
	/*
	@Test
	public void checkAddPainting() {
		// TODO Auto-generated method stub
		
		Painting painting = new Painting(NAME_1, YOC_1, ARTIST_1);
		
		assertEquals(1, paintingManager.addPainting(painting));
		
		
		List<Painting> paintings = paintingManager.getAllPainting();
		Painting personRetrieved = paintings.get(0);
		
		assertEquals(NAME_1, personRetrieved.getName());
		assertEquals(YOC_1, personRetrieved.getYoc());
		assertEquals(ARTIST_1, personRetrieved.getArtist());
		
		
	}
	*/
	
}
