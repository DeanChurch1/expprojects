package dchurch_exampleprojects;

public class Exe9_20 {

	public Exe9_20() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String mystring = "Pizza, Hotdog, icecream, cheese, cheesecake, apple";
		boolean result1 = mystring.contains("Pizza");
		if (mystring.contains("Pizza")) {
			System.out.println("eat here");
		}
		else {
			System.out.println("Don't eat here");
		}
		System.out.println(result1);
		String mystring2 = "hello";
		int result2 = mystring2.lastIndexOf("l");
		System.out.println(result2);
		
		String mystring3 = "the quick brown fox jumped over the lazy dog";
		int result3 = mystring3.length();
		System.out.println(result3);
		String result4 = mystring3.replace("b", "B");
		System.out.println(result4);
		int startpos = mystring3.indexOf("j");
		int endpos = mystring3.indexOf("r ");
		String result5 = mystring3.substring(startpos, endpos+1);
		System.out.println(result5);
		
		if (mystring3.contains("jumped over")) {
			System.out.println("The sentence contains jumped over");	
		}
		else {
			System.out.print("The sentence does not contain jumped over");
		}
		
		//if (mystring3.contains("jumped over")) {
			//int startpos1 = mystring3.indexOf("jumped");
			//int endpos1 = mystring.lastIndexOf("over"+4);
			//String result6 = mystring3.substring(startpos1,endpos1+1);
			//System.out.println(result6);
		//}
		//System.out.println(result5.toUpperCase());
		//System.out.println

	}

}
