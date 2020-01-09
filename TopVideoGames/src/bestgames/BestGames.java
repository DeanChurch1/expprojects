package bestgames;

public class BestGames {

	public static void main(String[] args) {
		String[] gamelist = {"Borderlands 2", "Halo CE", "Portal 2", "BOTW", "Nioh", "Last of us",
		"Minecraft",
		"Stronghold",
		"MarioKart Wii",
		"MW2",
		"Pokemon Red",
		"Borderlands 3",
		"God of War",
		"Batman series",
		"Pokemon Emerald",
		"lego Series",
		"Madden 16",
		"Skyrim",
		"Dead By Daylight",
		"COD BO2"};
		
		String[][] gameData = {{"Borderlands 2","2012","M"},
				{"Halo CE", "2001", "M"},
				{"Nioh", "2017", "M" },
				{"MW2", "2009", "M"},
				{"Portal 2", "2011", "M"}
		};
		
		for (int row = 0; row < gameData.length; row++) {
			for (int col = 0; col < gameData[row].length; col++) {
				System.out.println(gameData[row][col]+" ");
			}
		}
		}

		/*
		int[] numbers = new int[10];
		int sum = 0;
		for(int i = 0;i<10;i++) {
			
			numbers[i] = i + 1;
			
			print(numbers[i]);
			sum += numbers[i];
			print(sum);
		}
		
		String testStr[] = new String[3];
		testStr[0] = "just";
		testStr[1] = "do";
		testStr[2] = "it";
		
		for(int i = 0;i<testStr.length;i++) {
			numbers[i] = i + 1;
			
			print(testStr[i]);
		}
		
		for (int i = 0;i<gamelist.length;i++) {
			if (gamelist[i] == "fortnite" && gamelist[i] != "Minecraft") {
				print("fail");
			}
		}
	}*/
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
