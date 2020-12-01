package the_brave_hero;

import java.util.Random;

public class Gameplay {

	public static void main(String[] args) {
		
		Hero Carl = new Hero();
		Monster monstru = new Monster();
		
		//avem 10% sansa sa se activeze cand ataca
		//se poate rezolva asa
		
		Random sansa = new Random();
		Random sansa_rateu = new Random();
		
		//sansa.nextInt(100) < sansa_din_document -> in cazul primei abilitati 10, in cazul scutului 20
		
		//am decis ca sistemul de combat (cine ataca in tura respectiva) sa fie stabilit de paritatea rundei
		
		int primul = 0; //1 este carl, 2 este monstrul
		
		if (Carl.get_viteza() < monstru.get_viteza()) {
			primul = 2;
		} else if (Carl.get_viteza() > monstru.get_viteza()) {
			primul = 1;
		} else if (Carl.get_viteza() == monstru.get_viteza()) {
			if (Carl.get_noroc() < monstru.get_noroc()) {
				primul = 2;
			} else {
				primul = 1;
			}
		}
		
		//System.out.println(primul);
		
		//numar impar == carl ataca
		//numar par == monstrul ataca
		//indiferent de cine este primul
		
		//Damage = Puterea atacatorului – Apararea aparatorului (daca rezultatul este mai mic ca 0 atunci el
		//va fi 0, daca va fi mai mare ca 100 atunci va fi 100)
		
		int damage = 0;
		
		int i = 0;
		
		if (primul == 1) { //primul care ataca e carl
			
			for (i = 1; i <= 20; i++) {
				
				System.out.println("Tura: " + i);
				
				if (i % 2 != 0) {
					
					System.out.println("Carl ataca!");
					
					if (sansa_rateu.nextInt(100) > Carl.get_noroc()) {
						System.out.println("Atacul a ratat! :(");
						continue;
					}
					
					if (sansa.nextInt(100) < 10) { //aici avem sansa de 10% sa folosim forta dragonului
						
						Carl.forta_dragonului();
						damage = Carl.get_putere() - monstru.get_aparare();
						if (damage > 0 && damage <= 100) {
							monstru.set_viata(monstru.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							monstru.set_viata(monstru.get_viata() - damage);
						}
						System.out.println("Monstrul mai are " + monstru.get_viata() + " HP");
						Carl.set_putere(Carl.get_putere()/2);
						
					} else {
						
						damage = Carl.get_putere() - monstru.get_aparare();
						if (damage > 0 && damage <= 100) {
							monstru.set_viata(monstru.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							monstru.set_viata(monstru.get_viata() - damage);
						}
						System.out.println("Monstrul mai are " + monstru.get_viata() + " HP");
						
					}
					
				} else if (i % 2 == 0) {
					
					System.out.println("Monstrul ataca!");
					
					if (sansa_rateu.nextInt(100) > monstru.get_noroc()) {
						System.out.println("Atacul a ratat! :(");
						continue;
					}
					
					if (sansa.nextInt(100) < 20) { //aici avem sansa 20% sa folosim scutul fermecat						
						
						damage = monstru.get_putere() - Carl.get_aparare();
						damage = Carl.scutul_fermecat(damage);
						if (damage > 0 && damage <= 100) {
							Carl.set_viata(Carl.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							Carl.set_viata(Carl.get_viata() - damage);
						}
						System.out.println("Carl mai are " + Carl.get_viata() + " HP");
						
					} else {
						
						damage = monstru.get_putere() - Carl.get_aparare();
						if (damage > 0 && damage <= 100) {
							Carl.set_viata(Carl.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							Carl.set_viata(Carl.get_viata() - damage);
						}
						System.out.println("Carl mai are " + Carl.get_viata() + " HP");
						
					}
					
				}
				
				//aici trebuie sa vedem daca a pierdut cineva inainte sa terminam for-ul
				
				if (Carl.get_viata() <= 0) {
					
					System.out.println("Monstrul a castigat batalia");
					break;
					
				} else if (monstru.get_viata() <= 0) {
					
					System.out.println("Carl a castigat batalia");
					break;
					
				}
				
			}
			
			//daca s-au terminat rundele si nu a murit nimeni, invingatorul este cel cu hp-ul mai mare
			
			if (i == 21) {
				if (Carl.get_viata() > monstru.get_viata()) {
					System.out.println("Carl este invingatorul luptei!");
				} else {
					System.out.println("Monstrul este invingatorul luptei!");
				}
			}
			
		} else if (primul == 2) { //primul care ataca e monstrul
			
			for (i = 2; i <=21; i++) {
				
				System.out.println("Tura " + (i-1));
				
				if (i % 2 == 0) {
					
					System.out.println("Monstrul ataca!");
					
					if (sansa_rateu.nextInt(100) > monstru.get_noroc()) {
						System.out.println("Atacul a ratat! :(");
						continue;
					}
					
					if (sansa.nextInt(100) < 20) { //aici avem sansa 20% sa folosim scutul fermecat
						
						damage = monstru.get_putere() - Carl.get_aparare();
						damage = Carl.scutul_fermecat(damage);
						if (damage > 0 && damage <= 100) {
							Carl.set_viata(Carl.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							Carl.set_viata(Carl.get_viata() - damage);
						}
						System.out.println("Carl mai are " + Carl.get_viata() + " HP");
						
					} else {
						
						damage = monstru.get_putere() - Carl.get_aparare();
						if (damage > 0 && damage <= 100) {
							Carl.set_viata(Carl.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							Carl.set_viata(Carl.get_viata() - damage);
						}
						System.out.println("Carl mai are " + Carl.get_viata() + " HP");
						
					}
					
				} else if (1 % 2 != 0) {
					
					System.out.println("Carl ataca!");
					
					if (sansa_rateu.nextInt(100) > Carl.get_noroc()) {
						System.out.println("Atacul a ratat! :(");
						continue;
					}
					
					if (sansa.nextInt(100) < 10) { //aici avem sansa de 10% sa folosim forta dragonului
						
						Carl.forta_dragonului();
						damage = Carl.get_putere() - monstru.get_aparare();
						if (damage > 0 && damage <= 100) {
							monstru.set_viata(monstru.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							monstru.set_viata(monstru.get_viata() - damage);
						}
						System.out.println("Monstrul mai are " + monstru.get_viata() + " HP");
						Carl.set_putere(Carl.get_putere()/2);
						
					} else {
						
						damage = Carl.get_putere() - monstru.get_aparare();
						if (damage > 0 && damage <= 100) {
							monstru.set_viata(monstru.get_viata() - damage);
						} else if (damage > 100) {
							damage = 100;
							monstru.set_viata(monstru.get_viata() - damage);
						}
						System.out.println("Monstrul mai are " + monstru.get_viata() + " HP");
						
					}
					
				}
				
				//aici trebuie sa vedem daca a pierdut cineva inainte sa terminam for-ul
				
				if (Carl.get_viata() <= 0) {
					
					System.out.println("Monstrul a castigat batalia");
					break;
					
				} else if (monstru.get_viata() <= 0) {
					
					System.out.println("Carl a castigat batalia");
					break;
				}
				
			}
			
			if (i == 22) {
				if (Carl.get_viata() > monstru.get_viata()) {
					System.out.println("Carl este invingatorul luptei!");
				} else {
					System.out.println("Monstrul este invingatorul luptei!");
				}
			}
			
		}
		
	}

}
