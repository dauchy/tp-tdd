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
			}
			 
			return null;
		}
		
		catch (Exception e) {return null;}

		}
	public static String text2num(String input) {
		return null;
	}
}