package no.hvl.dat100.tabeller;

public class Tabeller {

	// a) Solfrid
	public static void skrivUt(int[] tabell) {
        int[] timeTab = {8, 10, 14, 16, 22, 26};

        for (int i = 0; i < timeTab.length; i++) {
            System.out.print(timeTab[i] + " ");
        }
        System.out.println();

    }

}

	// b) Solfrid
	public static String tilStreng(int[] tabell) {
        int[] tabell = {42, 67, 89};

        String resultat = "[";
        for (int i = 0; i < tabell.length; i++) {
            resultat += tabell[i];
            if (i < tabell.length - 1) {
                resultat += ",";
            }

        }
        resultat += "]";

        System.out.println(resultat);
    }
    }

	// c) Solfrid
	public static int summer(int[] tabell) {
        int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }


	// d) Andrea
	public static boolean finnesTall(int[] tabell, int tall) {
        for (int i : tabell) {
            if (i == tall) {
                return true;
            }
        }
        return false;
        }

	// e) Andrea
	public static int posisjonTall(int[] tabell, int tall){
            for (int i = 0; i < tabell.length; i++) {
                if (tabell[i] == tall) {
                    return i;
                }
            }
            return -1;
        }

	// f) Andrea
	public static int[] reverser(int[] tabell) {
    int[] reverser = new int[tabell.length];
    for (int i=0; i < tabell.length; i++) {
        reverser[i] = tabell[tabell.length - i - 1];
    }
        return reverser;
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
