package the_brave_hero;

public class Gameplay {

	public static void main(String[] args) {
		
		Hero Carl = new Hero();
		Monster Gigel = new Monster();
		
		System.out.println("Viata Carl: " + Carl.get_viata());
		System.out.println("Putere Carl: "+ Carl.get_putere());
		System.out.println("Aparare Carl: " + Carl.get_aparare());
		System.out.println("Viteza Carl: "+Carl.get_viteza());
		System.out.println("Noroc Carl: "+Carl.get_noroc());
		
		System.out.println("Viata Gigel: " + Gigel.get_viata());
		System.out.println("Putere Gigel: "+ Gigel.get_putere());
		System.out.println("Aparare Gigel: " + Gigel.get_aparare());
		System.out.println("Viteza Gigel: "+Gigel.get_viteza());
		System.out.println("Noroc Gigel: "+Gigel.get_noroc());

	}

}
