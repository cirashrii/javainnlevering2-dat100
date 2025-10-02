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
        boolean arraySjekk = true;
        int i = 0;
        int j = 0;
        if (a.length == b.length) {
            while (erLik && arraySjekk) {
                for (i = 0; i < a.length; i++) {
                    for (j = 0; j < a[i].length; j++) {
                        if (a[i][j] != b[i][j]) {
                            erLik = false;
                        }
                    }
                }
                arraySjekk = false;
            }
        } else {
            erLik = false;
        }

        return erLik;
		
	}
}
