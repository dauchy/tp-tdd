package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		try {
			int num = Integer.parseInt(input);
			if (num < 10 && num >=0) {
				return unite(num);
			}
			else if (num>10 && num < 17) {
				return entre10_et20(num);	
			}
			else if (num%10 == 0)
				return dizaine(num);
			else if (num/10 != 7 && num/10 != 9)
				if (num % 10 == 1)
					return dizaine(num-(num%10))+"-et-un";
				else
					return dizaine(num-(num%10))+"-"+unite(num%10);
			else if (num/10 == 7)
				return dizaine(num-(num%10)-10)+"-"+entre10_et20(num-60);
			else if (num/10 == 9)
				return dizaine(num-(num%10)-10)+"-"+entre10_et20(num-80);
			 
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
	
	public static String entre10_et20 (int i) {
		 if (i == 11)
			 return "onze";
		 else if (i == 12)
			 return "douze";
		 else if (i == 13)
			 return "treize";
		 else if (i == 14)
			 return "quatorze";
		 else if (i == 15)
			 return "quinze";
		 else if (i == 16)
			 return "seize";
		 else if (i >= 17 && i < 20)
			return "dix-"+unite(i-10);
		 
		 return null;
	}
		 
	public static String dizaine (int i) {
		if (i == 10)
			return "dix";
		else if (i == 20)
			return "vingt";
		else if (i == 30)
			return "trente";
		else if (i == 40)
			return "quarante";
		else if (i == 50)
			return "cinquante";
		else if (i == 60)
			return "soixante";
		else if (i == 70)
			return "soixante-dix";
		else if (i == 80)
			return "quatre-vingt";
		else if (i == 90)
			return "quatre-vingt-dix";
		else
			return null;
	}
	
	public static String text2num(String input) {
		return null;
	}
}