package moyennetableaudecimauxtest;

import moyennetableaudecimaux.MoyenneTableauDecimaux;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sommecarresentiers.SommeCarresEntiers;

import java.math.BigDecimal;

public class MoyenneTableauDecimauxTest {

    @Test
    @DisplayName("somme des carrés d'un tableau d'entier")
    public void somme_des_carres_tableau_entiers(){
        double[] tableauDecimaux1 = {1,1,1,1};
        double[] tableauDecimaux2 = {10,20};
        double[] tableauDecimaux3 = {11,12,13,14,15,16};
        double[] tableauDecimaux4 = {};


        Assertions.assertThat(MoyenneTableauDecimaux.calculerMoyenneDecimaux(tableauDecimaux1)).isEqualTo(1);
        Assertions.assertThat(MoyenneTableauDecimaux.calculerMoyenneDecimaux(tableauDecimaux2)).isEqualTo(15);
        Assertions.assertThat(MoyenneTableauDecimaux.calculerMoyenneDecimaux(tableauDecimaux3)).isEqualTo(13);
        Assertions.assertThat(MoyenneTableauDecimaux.calculerMoyenneDecimaux(tableauDecimaux4)).isInstanceOf(ArithmeticException.class);


    }

}
