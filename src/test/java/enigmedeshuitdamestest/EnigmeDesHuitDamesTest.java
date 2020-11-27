package enigmedeshuitdamestest;

import enigmedeshuitdames.plateau.Plateau;
import masquenumerocarte.MasqueNumeroCarte;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class EnigmeDesHuitDamesTest {

    @BeforeAll
    static void beforeALL(){
        System.out.println("début session test");
    }

    @AfterAll
    static void afterALL(){
        System.out.println("fin session test");
    }

    long timeAtStart;
    long timeAtEnd;

    @BeforeEach
    void timeAvant(){
        timeAtStart = System.currentTimeMillis();
     }

    @AfterEach
    void timeApres(){
        timeAtEnd = System.currentTimeMillis();
        System.out.println("ce test a pris "+(timeAtEnd-timeAtStart)+"ms");
    }

    @Test
    @DisplayName("pas plus d'une dame pour une ligne")
    public void manipuler_plateau_exercice_1_4() {

        int taillePlateauJeu = 4;

//        boolean[][] plateauTrue = new boolean[taillePlateauJeu][taillePlateauJeu];
//        for (int i = 0;i<taillePlateauJeu;i++) {
//            for (int j = 0; j < taillePlateauJeu; j++) {
//                plateauTrue[i][j] = true;
//            }
//        }

        System.out.println("création plateauJeu1 exercice 1.4");
        Plateau plateauJeu1 = new Plateau(taillePlateauJeu);
        plateauJeu1.positionnerDame(0,0);
        plateauJeu1.positionnerDame(0,2);
        plateauJeu1.positionnerDame(1,1);
        plateauJeu1.positionnerDame(3,3);
        plateauJeu1.representerTableau();
//        System.out.println(plateauJeu1.verifierPasPlusUneDameLigne(0));
//        System.out.println(plateauJeu1.verifierPasPlusUneDameLigne(1));
        Assertions.assertThat(plateauJeu1.verifierPasPlusUneDameLigne(0)).isFalse();
        Assertions.assertThat(plateauJeu1.verifierPasPlusUneDameLigne(1)).isTrue();
//
//        plateauJeu1.enleverDame(0,0);
//        plateauJeu1.representerTableau();
////
//        System.out.println("création plateauJeu4 a partir de plateau 1");
//        Plateau plateauJeu4 = new Plateau(taillePlateauJeu,plateauJeu1);
//        plateauJeu4.representerTableau();
////

//        System.out.println("création plateauJeu2 avec taille "+taillePlateauJeu);
//        Plateau plateauJeu2 = new Plateau(taillePlateauJeu);
//        plateauJeu2.representerTableau();
//
//        System.out.println("création plateauJeu3 avec taille "+taillePlateauJeu );
//        Plateau plateauJeu3 = new Plateau(taillePlateauJeu);
//        plateauJeu3.representerTableau();
//
//        System.out.println("affectation plateauTrue a plateauJeu3");
//        plateauJeu3.setPlateau(plateauTrue);
//        plateauJeu3.representerTableau();
//
//        System.out.println("copie plateauJeu3 dans plateauJeu2");
//        plateauJeu2.copierPlateau(plateauJeu3);
//        plateauJeu2.representerTableau();
//        //////////////////// marchais

    }

    @Test
    @DisplayName("pas plus d'une dame pour une colonne")
    public void manipuler_plateau_exercice_1_5() {

        int taillePlateauJeu = 4;

        System.out.println("création plateauJeu1 exercice 1.5");
        Plateau plateauJeu1 = new Plateau(taillePlateauJeu);
        plateauJeu1.positionnerDame(0,0);
        plateauJeu1.positionnerDame(0,2);
        plateauJeu1.positionnerDame(0,3);
        plateauJeu1.positionnerDame(1,1);
        plateauJeu1.positionnerDame(3,3);
        plateauJeu1.representerTableau();
//        System.out.println(plateauJeu1.verifierPasPlusUneDameColonne(0));
//        System.out.println(plateauJeu1.verifierPasPlusUneDameColonne(3));
        Assertions.assertThat(plateauJeu1.verifierPasPlusUneDameColonne(0)).isTrue();
        Assertions.assertThat(plateauJeu1.verifierPasPlusUneDameColonne(3)).isFalse();


    }

    @Test
    @DisplayName("pas plus d'une dame pour une diagonale droite")
    public void manipuler_plateau_exercice_1_6() {

        int taillePlateauJeu = 4;

        System.out.println("création plateauJeu1 exercice 1.5");
        Plateau plateauJeu1 = new Plateau(taillePlateauJeu);
        plateauJeu1.positionnerDame(0,0);
        plateauJeu1.positionnerDame(0,2);
        plateauJeu1.positionnerDame(0,3);
        plateauJeu1.positionnerDame(1,1);
        plateauJeu1.positionnerDame(3,3);
        plateauJeu1.representerTableau();

        plateauJeu1.verifierPasPlusUneDameDiagonaleDroite(-3);
        plateauJeu1.verifierPasPlusUneDameDiagonaleDroite(-2);
        plateauJeu1.verifierPasPlusUneDameDiagonaleDroite(-1);
        plateauJeu1.verifierPasPlusUneDameDiagonaleDroite(0);
        plateauJeu1.verifierPasPlusUneDameDiagonaleDroite(1);
        plateauJeu1.verifierPasPlusUneDameDiagonaleDroite(2);
        plateauJeu1.verifierPasPlusUneDameDiagonaleDroite(3);
//        System.out.println(plateauJeu1.verifierPasPlusUneDameColonne(0));
//        System.out.println(plateauJeu1.verifierPasPlusUneDameColonne(3));


    }

}
