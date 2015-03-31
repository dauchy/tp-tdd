package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		try {
			int num = Integer.parseInt(input);
			if (num < 17) {
				if (num == 0)
					return "zéro";
				else if (num == 1)
					return "un";
				else if (num == 2)
					return "deux";
				else if (num == 3)
					return "trois";
				else if (num == 4)
					return "quatre";
				else if (num == 5)
					return "cinq";
				else if (num == 6)
					return "six";
				else if (num == 7)
					return "sept";
				else if (num == 8)
					return "huit";
				else if (num == 9)
					return "neuf";
				else if (num == 10)
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
			 
			return null;
		}
		
		catch (Exception e) {return null;}

		}
	public static String text2num(String input) {
		return null;
	}
}