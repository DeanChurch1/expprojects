package rpg;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

	public class Player {
		int totalhealth = 28000;
		String name;
		int atk = 10;
		int def = 10;
		String hairColor;
		String race;
		String class_stat;
		int actHealth;
		
		public Player() {
			Scanner input = new Scanner(System.in);
			// makes character
			print("What do you want to name your Player");
			name = input.nextLine();
			
			print("What color is your players hair");
			hairColor = input.nextLine();
			while (true){
				print("Are you a Human, Elf, or Dog");
				race = input.nextLine();
				if(race.contentEquals("Human")|| race.contentEquals("Elf")||race.contentEquals("Dog")) {
					break;
				}
			
			}
			
			
			while (true){
				print("Are you a Warrior, Mage, or Dog");
				class_stat = input.nextLine();
				if(class_stat.equals("Warrior")|| class_stat.equals("Mage")|| class_stat.equals("Dog")) {
					break;
				}
					
			}
			
			if (race.equals("Elf")) {
				def -= 2;
				atk += 2;
			}
			else if (race.equals("Dog")) {
				def += 20;
				atk += 20;
			}
			if (class_stat.equals("Warrior")) {
				def += 5;
				atk -= 2;
				actHealth = totalhealth * 2;
			}
			else if (class_stat.equals("Mage")) {
				def -= 8;
				atk += 10;
				actHealth = totalhealth/2;
			}
			else {
				actHealth = totalhealth * 100;
				def += 20;
				atk += 20;
			}
		}
		
		
	public void stats() {
		print("Health:"+actHealth);
		print("atk:"+atk);
		print("def:"+def);
		print("Hair Color:"+hairColor);
		print("Race:"+race);
		print("Class Stat:"+class_stat);
		
		
	
	}
		
	public int attack() {
		int damage = 0;
		int miss = ThreadLocalRandom.current().nextInt(1,6);
		if (miss == 3) {
			print("You missed");
			return damage;
		}
		int attack = ThreadLocalRandom.current().nextInt(20,42);
		damage = atk * attack + 7;		
		return damage;
		
	}
		
	public void take_dmg(int dmg) {
		int block = defend();
		int totaldmg = 0;
		if (block < 0) {
			print("and took 0 damage");
			totaldmg = 0;
		}
		else {
			totaldmg = dmg - block;			
		}
		actHealth -= totaldmg;
		
	}
	public int defend() {
		int blocked = 0;
		int miss = ThreadLocalRandom.current().nextInt(1,6);
		if (miss == 3) {
			print("You blocked the atk");
			return -1;
		}
		int defend = ThreadLocalRandom.current().nextInt(10,35);
		blocked = def* defend + 17;
		return blocked;
		
		
		
		
	
	}
		
	public boolean die() {
		if (actHealth >0) {
			return false;
			
		}
		else {
			return true;
		}
	}
		
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
