package rpg;

import java.util.concurrent.ThreadLocalRandom;

public class BadGuy {
	int totalhealth = 500000000;
	int def = 2;
	int atk = 20;
	String name = "Jo";
	int actHealth;
	
	public BadGuy() {
		int actHealth = ThreadLocalRandom.current().nextInt(5,totalhealth);

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
		
	public void take_dmg(int damage) {
		int block = defend();
		int totaldmg = 0;
		if (block < 0) {
			print("and took 0 damage");
			totaldmg = 0;
		}
		else {
			totaldmg = damage - block;			
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
	
	public void stats() {
		print("Health:"+ actHealth);

	}
		
	


	
	
	
	
	
	
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
