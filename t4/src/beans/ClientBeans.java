package beans;
public class ClientBeans {
	private String Nom;
	private String Prenom;
	private String Email;
	private String adresse ;
	private double numero;
	public void setNom(String nom) {
		Nom = nom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setNumero(double numero) {
		numero = numero;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNom() {
		return Nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public double getNumero() {
		return numero;
	}
	public String getEmail() {
		return Email;
	}
	public ClientBeans() {
		
		setNom(""); 
		setPrenom("");
		setAdresse("");
		setNumero(0);
		setEmail("");
	}
	
	
	
}
