package the_brave_hero;

import java.util.Random;

public class Monster extends Character {
	
	public Monster() {
		
		Random random = new Random();
		
		this.set_viata(random.nextInt(80 - 55 + 1) + 55);
		this.set_putere(random.nextInt(80 - 50 + 1) + 50);
		this.set_aparare(random.nextInt(55 - 35 + 1) + 35);
		this.set_viteza(random.nextInt(60 - 40 + 1) + 40);
		this.set_noroc(random.nextInt(40 - 25 + 1) + 25);
	}
	

}
