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
        int[][] matriseSkalert= new int[matrise.length][];
        for(int i=0;i<matrise.length;i++){
            matriseSkalert[i] = new int[matrise[i].length];
        }
        for(int i=0;i<matriseSkalert.length;i++){
            for(int j=0;j<matriseSkalert[i].length;j++) {
                matriseSkalert[i][j]=matrise[i][j]*tall;
            }
        }
        return matriseSkalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        boolean erLik = true;
        int i = 0;
        int j = 0;
        while (erLik) {
            for (i = 0; i < a.length; i++) {
                for (j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]) {
                        erLik = false;
                    }
                }
            }
            erLik = false;
        }
        if (a[i-1][j-1] == b[i-1][j-1]) {
            erLik = true;
        }
        return erLik;


//        if (a == 0 && b == 0)
//            return true;
//        if (a == 0 || b == 0)
//            return false;
//
//        if (a.length != b.length)
//            return false;


        // TODO
		// throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
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
