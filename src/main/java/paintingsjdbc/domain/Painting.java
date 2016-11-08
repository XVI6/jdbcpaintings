package paintingsjdbc.domain;

public class Painting {
	
	private long id;
	
	private String name;
	private int yoc;
	private long idReproduktor;
	
	public Painting() {
		super();
	}
	
	public Painting(String name, int yoc) {
		super();
		this.name = name;
		this.yoc = yoc;
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

	public long getIdReproduktor() {
		return idReproduktor;
	}

	public void setIdReproduktor(long idReproduktor) {
		this.idReproduktor = idReproduktor;
	}
	
	
	
}
