package textadventure;

public class Exmethods {
	
	public Exmethods() {
		
		print("hello");
	}
	
	public static void paint() {
		print("            _\r\n" + 
				"           H||\r\n" + 
				"           H||\r\n" + 
				" __________H||___________\r\n" + 
				"[|.......................|\r\n" + 
				"||.........## --.#.......|\r\n" + 
				"||.........   #  # ......|            @@@@\r\n" + 
				"||.........     *  ......|          @@@@@@@\r\n" + 
				"||........     -^........|   ,      - @@@@\r\n" + 
				"||.....##\\        .......|   |     '_ @@@\r\n" + 
				"||....#####     /###.....|   |     __\\@ \\@\r\n" + 
				"||....########\\ \\((#.....|  _\\\\  (/ ) @\\_/)____\r\n" + 
				"||..####,   ))/ ##.......|   |(__/ /     /|% #/\r\n" + 
				"||..#####      '####.....|    \\___/ ----/_|-*/\r\n" + 
				"||..#####\\____/#####.....|       ,:   '(\r\n" + 
				"||...######..######......|       |:     \\\r\n" + 
				"||.....\"\"\"\"  \"\"\"\"...b'ger|       |:      )\r\n" + 
				"[|_______________________|       |:      |\r\n" + 
				"       H||_______H||             |_____,_|\r\n" + 
				"       H||________\\|              |   / (\r\n" + 
				"       H||       H||              |  /\\  )\r\n" + 
				"       H||       H||              (  \\| /\r\n" + 
				"      _H||_______H||__            |  /'=.\r\n" + 
				"    H|________________|           '=>/  \\\r\n" + 
				"                                 /  \\ /|/\r\n" + 
				"                               ,___/|");
	}
	

	
	
	
	public static void print(Object o) {
		//print scope
		System.out.println(o.toString());
	}

	public static void main(String[] args) {
		paint();
		paint();
		
	}
		
		
		
		
		
		
		
		
	}
		/*new Exmethods();
		area(11,84);
		area(110,840);
		double squ = area(3);
		double tri = tri_area(10,50);
		area(squ,tri);
	}
	
	public static void area(double base, double width) {
		double abase = base;
		double awidth = width;
		double answer = abase * awidth;
		
		print(answer);
		}
	
	public static double area(double side){
		double abase = side;
		
		double answer = abase * 4;
		return answer;
	}
	
	public static double tri_area(double base, double height) {
		double answer = base*height/2;
		return answer;
	}
}
*/