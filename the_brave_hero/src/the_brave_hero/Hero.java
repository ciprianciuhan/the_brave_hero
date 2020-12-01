package the_brave_hero;

import java.util.Random;

public class Hero extends Character {
	
	public void forta_dragonului() {
		
		//dubleaza puterea eroului
		System.out.println("Eroul a activat Forta Dragonului!");
		
		set_putere(get_putere()*2);
		
	}
	
	public int scutul_fermecat(int damage) {
		
		//injumatateste damage-ul pe care il primeste eroul
		
		System.out.println("Eroul a activat Scutul Fermecat!");
		
		damage /= 2;
		
		return damage;
		
	}
	
	//random.nextInt(max - min + 1) + min
	
	public Hero() {
		
		Random random = new Random();
		
		this.set_viata(random.nextInt(95 - 65 + 1) + 65);
		this.set_putere(random.nextInt(70 - 60 + 1) + 60);
		this.set_aparare(random.nextInt(50 - 40 + 1) + 40);
		this.set_viteza(random.nextInt(50 - 40 + 1) + 40);
		this.set_noroc(random.nextInt(30 - 10 + 1) + 10);
	}

}
