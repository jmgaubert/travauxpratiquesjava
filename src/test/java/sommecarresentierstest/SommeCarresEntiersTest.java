package sommecarresentierstest;

import moyennetableaudecimaux.MoyenneTableauDecimaux;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import sommecarresentiers.SommeCarresEntiers;

public class SommeCarresEntiersTest {

    @Test
    @DisplayName("somme des carrés d'un tableau d'entier")
    public void somme_des_carres_tableau_entiers(){
        int[] tableauEntiers1 = {1,1,1};
        int[] tableauEntiers2 = {1,2,3};
        int[] tableauEntiers3 = {};
        int[] tableauEntiers4 = {14,9,-9,1,4,3};

        Assertions.assertThat(SommeCarresEntiers.calculerSommeCarresEntiers(tableauEntiers1)).isEqualTo(3);
        Assertions.assertThat(SommeCarresEntiers.calculerSommeCarresEntiers(tableauEntiers2)).isEqualTo(14);
        Assertions.assertThat(SommeCarresEntiers.calculerSommeCarresEntiers(tableauEntiers3)).isEqualTo(-1);
        Assertions.assertThat(SommeCarresEntiers.calculerSommeCarresEntiers(tableauEntiers4)).isEqualTo(384);

    }

}
