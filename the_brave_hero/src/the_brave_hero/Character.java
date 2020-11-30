package the_brave_hero;

public class Character {
	
	//aici avem atributele pe care toate caracterele le impart
	
	protected int viata;
	protected int putere;
	protected int aparare;
	protected int viteza;
	protected int noroc;
	
	//getteri si setteri
	
	public void set_viata (int viata) {
		this.viata = viata;
	}
	
	public void set_putere (int putere) {
		this.putere = putere;
	}
	
	public void set_aparare (int aparare) {
		this.aparare = aparare;
	}
	
	public void set_viteza (int viteza) {
		this.viteza = viteza;
	}
	
	public void set_noroc (int noroc) {
		this.noroc = noroc;
	}
	
	public int get_viata() {
		return viata;
	}
	
	public int get_putere() {
		return putere;
	}
	
	public int get_aparare() {
		return aparare;
	}
	
	public int get_viteza() {
		return viteza;
	}
	
	public int get_noroc() {
		return noroc;
	}

}
