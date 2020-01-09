package rpg;

public class Game {


	public static void main(String[] args) {
	Player bob = new Player();
	BadGuy jo = new BadGuy();
		
		
	while (true) {
		bob.stats();
		if (bob.die() == false) {
			print("Your Player attacks first");
			int dmg = bob.attack();
			int def = jo.defend();
			print("You did "+dmg+" damage");
			if(jo.die() == false) {
				print("Wasn't enough to kill him");
				
				                       
			}
			break;
		}
		else {
			print("You died");
		}
	}
		
		
		

	
	/*BadGuy jo = new BadGuy();
	jo.stats();
	int dmg = jo.attack();
	print(dmg);
	int def = jo.defend();
	print(def);
	jo.stats();
	jo.take_dmg(34);
	jo.stats();
	boolean die = jo.die();
	print(die);*/
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
