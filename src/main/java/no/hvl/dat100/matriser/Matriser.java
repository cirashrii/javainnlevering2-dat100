package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] rad:matrise){
            for(int tall:rad) {
                System.out.println(tall);
            }
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        String streng = "";
        for(int[] rad:matrise){
            for(int tall:rad) {
                streng+=tall+" ";
            }
        streng+="\n";
        }
        return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        if (a == 0 && b == 0)
            return true;
        if (a == 0 || b == 0)
            return false;

        if (a.length != b.length)
            return false;

		
        // TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
