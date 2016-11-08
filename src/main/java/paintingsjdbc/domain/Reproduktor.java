package paintingsjdbc.domain;

public class Reproduktor {
	private long id;
	
	private String name;
	private String adress;
	private String telephone;
	private String e_mail;
	
	public Reproduktor() {
		super();
	}
	
	public Reproduktor(String name, String adress, String telephone, String e_mail){
		super();
		this.name = name;
		this.adress = adress;
		this.telephone = telephone;
		this.e_mail = e_mail;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
}
