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
        for(int i=0;i<matriseSkalert.length;i++){
            for(int j=0;j<matriseSkalert.length;j++) {
                matriseSkalert[i][j]=matrise[i][j]*tall;
            }
        }
        return matriseSkalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

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
