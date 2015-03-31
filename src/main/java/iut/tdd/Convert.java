package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		try {
			int num = Integer.parseInt(input);
			if (num < 17) {
				if (num == 0)
					return "zéro";
			}
			 
			return null;
		}
		
		catch (Exception e) {return null;}

		}
	public static String text2num(String input) {
		return null;
	}
}