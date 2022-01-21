package tp_algo_base_java;

import java.util.ArrayList;
import java.util.List;

public class Tp10 {
	
	public static void afficher(List<String> lst) {
		for (String s : lst) {
			System.out.println(s) ;
		}
	}
	
	public static boolean estVide(List<String> lst) {
		if (lst.size()==0) return true;
		return false;
	}

	public static boolean present(List<String> lst, String m) {
		for (String s: lst) {
			if (s.equals(m)) return true;
		}
		return false;
	}
	
	public static int occurrences(List<String> lst, String m) {
		int res=0;
		for (String s: lst) {
			if (s.equals(m)) res++;
		}
		return res;
	}
	
	public static String concatenation(List<String> lst) {
		String res="";
		for (String s: lst) {
			res += s;
		}
		return res;
	}
	
	public static boolean memeMot(List<String> lst) {
		if (estVide(lst)) return true;
		String m = lst.get(0);
		for (String s: lst) {
			if (!s.equals(m)) return false;
		}
		return true;
	}
	
	public static boolean present(List<String> lst, char x) {
		for (String s: lst) {
			for (int i=0; i<s.length(); i++)
				if (s.charAt(i) == x) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// création d'une liste de String
		List<String> lst =  new ArrayList<String>();

		// ajout d'éléments à cette liste
		lst.add("un");
		lst.add("deux");
		lst.add("trois");
		
		afficher(lst);

		System.out.println(estVide(lst));
		List<String> lst2 =  new ArrayList<String>();
		System.out.println(estVide(lst2));
		
		System.out.println(present(lst, "deux"));
		System.out.println(present(lst, "quatre"));
		
		System.out.println(occurrences(lst, "deux"));
		System.out.println(occurrences(lst, "quatre"));
		lst.add("deux");
		System.out.println(occurrences(lst, "deux"));
		
		System.out.println(concatenation(lst));
		
		System.out.println(memeMot(lst));
		System.out.println(memeMot(lst2));
		List<String> lst3 =  new ArrayList<String>();
		lst3.add("abc"); lst3.add("abc"); lst3.add("abc");
		System.out.println(memeMot(lst3));
		
		System.out.println(present(lst, 'z'));
		System.out.println(present(lst, 'x'));
	}

}
