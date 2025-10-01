package no.hvl.dat100.tabeller;

public class Tabeller {

	// a) Solfrid
	public static void skrivUt(int[] tabell) {
        int[] timeTab = {8, 10, 14, 16, 22, 26};

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
        System.out.println();

    }

}

	// b) Solfrid
	public static String tilStreng(int[] tabell) {

        System.out.println("Hei");
		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c) Solfrid
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d) Andrea
	public static boolean finnesTall(int[] tabell, int tall) {
        for (int i : tabell) {
            if (i == tall) {
                return false;
            }
        }
    }

	// e) Andrea
	public static int posisjonTall(int[] tabell, int tall){
            for (int i = 0; i < tabell.length; i++) {
                if (tabell[i] == tall) {
                }
            }
        }

	// f) Andrea
	public static int[] reverser(int[] tabell) {
    int[] reverser = new int[tabell.length];
    for (int i=0; i < tabell.length; i++) {

        return reverser;
    }
    }
    

	// g) Grethe
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h) Grethe
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
