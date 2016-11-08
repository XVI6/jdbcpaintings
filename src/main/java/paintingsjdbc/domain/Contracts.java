package paintingsjdbc.domain;

public class Contracts {
	
	private long idReproductor;
	private long idOrganisation;
	
	
	public Contracts() {
		super();
	}
	
	public Contracts(long idReproductor, long idOrganisation){
		super();
		this.idReproductor = idReproductor;
		this.idOrganisation = idOrganisation;
	}

	public long getIdReproductor() {
		return idReproductor;
	}

	public void setIdReproductor(long idReproductor) {
		this.idReproductor = idReproductor;
	}

	public long getIdOrganisation() {
		return idOrganisation;
	}

	public void setIdOrganisation(long idOrganisation) {
		this.idOrganisation = idOrganisation;
	}
}
