package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		try {
			int num = Integer.parseInt(input);
			if (num < 10 && num >=0) {
				return unite(num);
			}
			else if (num>=10 && num < 17) {
				if (num == 10)
					return "dix";
				else if (num == 11)
					return "onze";
				else if (num == 12)
					return "douze";
				else if (num == 13)
					return "treize";
				else if (num == 14)
					return "quatorze";
				else if (num == 15)
					return "quinze";
				else if (num == 16)
					return "seize";
			}
			else if (num >= 17 && num < 20)
				return "dix-"+unite(num-10);
			 
			return null;
		}
		
		catch (Exception e) {return null;}
	}
	
	public static String unite (int i) {
		if (i == 0)
			return "zéro";
		else if (i == 1)
			return "un";
		else if (i == 2)
			return "deux";
		else if (i == 3)
			return "trois";
		else if (i == 4)
			return "quatre";
		else if (i == 5)
			return "cinq";
		else if (i == 6)
			return "six";
		else if (i == 7)
			return "sept";
		else if (i == 8)
			return "huit";
		else if (i == 9)
			return "neuf";
		else 
			return null;
	}
	
	public static String text2num(String input) {
		return null;
	}
}