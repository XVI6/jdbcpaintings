package paintingsjdbc.domain;

public class Painting {
	
	private long id;
	
	private String name;
	private int yoc;
	private String artist;
	private String origin_artist;
	private int cost;
	private long idReproduktor;
	
	public Painting() {
		super();
	}
	
	public Painting(String name, int yoc, String artist, String origin_artist, int cost) {
		super();
		this.name = name;
		this.yoc = yoc;
		this.artist = artist;
		this.origin_artist = origin_artist;
		this.cost = cost;
	}
	
	public Painting(String name, int yoc, String artist, String origin_artist, int cost, long idReproduktor) {
		super();
		this.name = name;
		this.yoc = yoc;
		this.artist = artist;
		this.origin_artist = origin_artist;
		this.cost = cost;
		this.idReproduktor = idReproduktor;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYoc() {
		return yoc;
	}

	public void setYoc(int yoc) {
		this.yoc = yoc;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getOrigin_artist() {
		return origin_artist;
	}

	public void setOrigin_artist(String origin_artist) {
		this.origin_artist = origin_artist;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public long getIdReproduktor() {
		return idReproduktor;
	}

	public void setIdReproduktor(long idReproduktor) {
		this.idReproduktor = idReproduktor;
	}
	
	
	
}
