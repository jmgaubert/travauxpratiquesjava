package enigmedeshuitdames.plateau;

public class Plateau {
    boolean[][] plateau;
//    int taillePlateau;

//    public Plateau(int taillePlateau,Plateau plateau) {
////        this.taillePlateau = taillePlateau;
//        System.out.println(" 2eme constructeur");
////        System.out.println(plateau.plateau.length);
//
////        this.copierPlateau(plateau);
//        for (int i = 0; i < plateau.plateau.length; i++) {
//            System.out.println(" boucle i : "+i);
//            for (int j = 0; j < plateau.plateau.length; j++) {
//                System.out.println(" boucle j : "+j);
//                System.out.println(this.plateau[i][j]+ "-" + plateau.plateau[i][j]);
//                this.plateau[i][j] = plateau.plateau[i][j];
//            }
//        }
//
////        System.out.println("ici" + plateau.plateau.length);
////        for (int i = 0; i < plateau.plateau.length; i++) {
////            for (int j = 0; j < plateau.plateau.length; j++) {
////                System.out.println("la" + plateau.plateau[i][j]);
////                this.plateau[i][j] = plateau.plateau[i][j];
////            }
////        }
//    }

    public Plateau(int taillePlateau) {
        boolean[][] plateauT = new boolean[taillePlateau][taillePlateau];
        for (int i = 0; i < taillePlateau; i++) {
            for (int j = 0; j < taillePlateau; j++) {
                plateauT[i][j] = false;
            }
        }
        this.plateau = plateauT;
    }

    public boolean[][] getPlateau() {
        return plateau;
    }

    public void setPlateau(boolean[][] plateau) {
        this.plateau = plateau;
    }

    public void copierPlateau(Plateau plateau) {
        for (int i = 0; i < plateau.plateau.length; i++) {
            for (int j = 0; j < plateau.plateau.length; j++) {
                this.plateau[i][j] = plateau.plateau[i][j];
            }
        }
    }

    public void representerTableau() {
        System.out.print("    ");
        for (int k = 0; k < plateau.length; k++) {
            System.out.print(k + "   ");
        }
        System.out.println();
        for (int i = 0; i < plateau.length; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < plateau.length; j++) {
                if (plateau[i][j]) {
                    System.out.print(" X |");
                } else {
                    System.out.print("   |");
                }
//                System.out.print(plateau[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void positionnerDame(int i, int j) {
        plateau[i][j] = true;
    }

    public void enleverDame(int i, int j) {
        plateau[i][j] = false;
    }

    public boolean verifierPasPlusUneDameColonne(int colonne) {
        int compteurDames = 0;

        for (int i = 0; i < plateau.length; i++) {
//            System.out.println(plateau[i][colonne]);
            if (plateau[i][colonne]) {
                compteurDames = compteurDames + 1;
            }
        }
        return (compteurDames < 2);
    }

    public boolean verifierPasPlusUneDameLigne(int ligne) {
        int compteurDames = 0;

        for (int i = 0; i < plateau.length; i++) {
//            System.out.println(plateau[ligne][i]);
            if (plateau[ligne][i]) {
                compteurDames = compteurDames + 1;
            }
        }
        return (compteurDames < 2);
    }

    public boolean verifierPasPlusUneDameDiagonaleDroite(int diagonale) {
        int compteurDames = 0;
        int diagonaleValeurAbsolue = diagonale;

        if (diagonale >= 0) {
            for (int i = 0; i < (plateau.length - diagonale); i++) {
                if(plateau[i][i + diagonale]){
                    compteurDames = compteurDames + 1;
                }
                System.out.println(" i:" + i + " j" + (i + diagonale));
            }
        }
        else{
            diagonaleValeurAbsolue = diagonaleValeurAbsolue*-1;
            for (int i = diagonaleValeurAbsolue; i < plateau.length; i++) {
                if(plateau[i][i + diagonale]){
                    compteurDames = compteurDames + 1;
                }
                System.out.println(" i:" + i + " j" + (i + diagonale));}
        }

        System.out.println("diagonale : " + diagonale+" nb dames : "+compteurDames);

        return (compteurDames < 2);

    }
}
