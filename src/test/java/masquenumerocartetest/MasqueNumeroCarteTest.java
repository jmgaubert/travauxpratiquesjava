package masquenumerocartetest;

import masquenumerocarte.MasqueNumeroCarte;
import moyennetableaudecimaux.MoyenneTableauDecimaux;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MasqueNumeroCarteTest {

        @Test
        @DisplayName("masquer numero de carte")
        public void masquer_numero_carte(){
            String numeroCarte1 = "123456789101112";
            String numeroCarte1M = MasqueNumeroCarte.masquerNumeroCarte(numeroCarte1);
            System.out.println(numeroCarte1M);

            String numeroCarte2 = "123456789012";
            String numeroCarte2M = MasqueNumeroCarte.masquerNumeroCarte(numeroCarte2);
            System.out.println(numeroCarte2M);

            String numeroCarte3 = "1234 5678 9012";
            String numeroCarte3M = MasqueNumeroCarte.masquerNumeroCarte(numeroCarte3);
            System.out.println(numeroCarte3M);

            String numeroCarte4 = "MonNomEstPersonne";
            String numeroCarte4M = MasqueNumeroCarte.masquerNumeroCarte(numeroCarte4);
            System.out.println(numeroCarte4M);

            String numeroCarte5 = "42";
            String numeroCarte5M = MasqueNumeroCarte.masquerNumeroCarte(numeroCarte5);
            System.out.println(numeroCarte5M);

            Assertions.assertThat(MasqueNumeroCarte.masquerNumeroCarte(numeroCarte1)).isEqualTo("###########1112");
            Assertions.assertThat(MasqueNumeroCarte.masquerNumeroCarte(numeroCarte2)).isEqualTo("########9012");
            Assertions.assertThat(MasqueNumeroCarte.masquerNumeroCarte(numeroCarte3)).isEqualTo("##########9012");
            Assertions.assertThat(MasqueNumeroCarte.masquerNumeroCarte(numeroCarte4)).isEqualTo("#############onne");
            Assertions.assertThat(MasqueNumeroCarte.masquerNumeroCarte(numeroCarte5)).isEqualTo("42");

        }


}
