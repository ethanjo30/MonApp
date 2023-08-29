package app_Restaurant;

public class Adresse_Resto {

	private int Numero;
	private String Rue;
	private int Code_Postale;
	private String Ville;
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		this.Numero = numero;
	}
	public String getRue() {
		return Rue;
	}
	public void setRue(String rue) {
		this.Rue = rue;
	}
	public int getCode_Postale() {
		return Code_Postale;
	}
	public void setCode_Postale(int code_Postale) {
		this.Code_Postale = code_Postale;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		this.Ville = ville;
	}
	public Adresse_Resto(int numero, String rue, int code_Postale, String ville) {
		super();
		Numero = numero;
		Rue = rue;
		Code_Postale = code_Postale;
		Ville = ville;
	}
	
	
}
