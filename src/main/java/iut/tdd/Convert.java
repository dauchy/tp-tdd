package iut.tdd;

import java.util.HashMap;

public class Convert {
	
	static HashMap <Integer, String> unite = new HashMap<Integer, String>();
	static HashMap <Integer, String> entre10_et20 = new HashMap<Integer, String>();
	static HashMap <Integer, String> dizaine = new HashMap<Integer, String>();
	static boolean euro;
	static boolean doll;
	
	public static String num2text(String input) {
		unite.put(0, "zéro");
		unite.put(1, "un");
		unite.put(2, "deux");
		unite.put(3, "trois");
		unite.put(4, "quatre");
		unite.put(5, "cinq");
		unite.put(6, "six");
		unite.put(7, "sept");
		unite.put(8, "huit");
		unite.put(9, "neuf");
		entre10_et20.put(11, "onze");
		entre10_et20.put(12, "douze");
		entre10_et20.put(13, "treize");
		entre10_et20.put(14, "quatorze");
		entre10_et20.put(15, "quinze");
		entre10_et20.put(16, "seize");
		entre10_et20.put(17, "dix-sept");
		entre10_et20.put(18, "dix-huit");
		entre10_et20.put(19, "dix-neuf");
		dizaine.put(10, "dix");
		dizaine.put(20, "vingt");
		dizaine.put(30, "trente");
		dizaine.put(40, "quarante");
		dizaine.put(50, "cinquante");
		dizaine.put(60, "soixante");
		dizaine.put(70, "soixante-dix");
		dizaine.put(80, "quatre-vingt");
		dizaine.put(90, "quatre-vingt-dix");
		
		
		try {
			String[] tab = input.split(" ");
			int num = 0;
			for (String s : tab)
				if (s.length()!=0) {
					if (s.charAt(0)=='$') {
						doll=true;
						s=s.substring(1, s.length());
					}
					if (s.charAt(s.length()-1)=='€') {
						euro=true;
						s=s.substring(0, s.length()-1);
					}
					String[] tab2 = s.split(",");
					if (tab2.length==2)
						if (doll||euro)
							return monnaie(tab2[0], tab2[1]);
						else
							return virgule(tab2[0], tab2[1]);
					else
						num = Integer.parseInt(s);
				}
			if (num < 1000)
				return moins_de_1000(num);
			
			return "tata";
		}
		catch (Exception e) {return e.getMessage();}
	}
	
	public static String monnaie(String av, String ap) {
		int avant = Integer.parseInt(av);
		int apres = Integer.parseInt(ap);
		
		if (ap.length()== 1)
			apres=apres*10;
		if (ap.length()>2)
			apres=apres/(10*(ap.length()-2));
		if (euro) {
			return moins_de_1000(avant)+" euro "+moins_de_1000(apres);
		} else if (doll) {
			return moins_de_1000(avant)+" dollar "+moins_de_1000(apres);
		}
		return "toto";
	}

	public static String virgule(String av, String ap) {
		int avant = Integer.parseInt(av);
		int apres = Integer.parseInt(ap);
		
		if (ap.length()== 1)
			apres=apres*10;
		if (ap.length()>2)
			apres=apres/(10*(ap.length()-2));
		return moins_de_1000(avant)+" virgule "+moins_de_1000(apres);
	}
	
	public static String moins_de_1000(int num) {
		if (num < 100)
			return moins_de_100(num);
		else if (num == 100)
			return "cent";
		else if (num/100 ==1) {
			return "cent "+moins_de_100(num%100);
		} else if (num%100 == 0) {
			return unite.get(num/100)+" cents";
		}
		else {
			return unite.get(num/100)+" cents "+moins_de_100(num%100);
		}		
	}
	
	public static String moins_de_100(int num) {
		if (num < 10 && num >=0) {
			return unite.get(num);
		}
		else if (num>10 && num < 20) {
			return entre10_et20.get(num);	
		}
		else if (num%10 == 0) {
			return dizaine.get(num);
		}
		else if (num/10 != 7 && num/10 != 9)
			if (num % 10 == 1)
				return dizaine.get(num-(num%10))+"-et-un";
			else
				return dizaine.get(num-(num%10))+"-"+unite.get(num%10);
		else if (num/10 == 7)
			return dizaine.get(num-(num%10)-10)+"-"+entre10_et20.get(num-60);
		else if (num/10 == 9)
			return dizaine.get(num-(num%10)-10)+"-"+entre10_et20.get(num-80);
		 
		return null;
	}
	
	public static String text2num(String input) {
		return null;
	}
}