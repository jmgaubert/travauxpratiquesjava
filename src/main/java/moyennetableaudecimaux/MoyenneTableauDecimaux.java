package moyennetableaudecimaux;

import java.math.BigDecimal;

public class MoyenneTableauDecimaux {

    double[] tableauDecimaux;

    public MoyenneTableauDecimaux(double[] tableauDecimal) {
        this.tableauDecimaux = tableauDecimal;
    }

    public static int calculerMoyenneDecimaux(double[] tableauDecimaux){
        double cumul = 0;

        if(tableauDecimaux.length == 0){
            throw new RuntimeException("tableau vide");
        }

        for(int i=0;i < tableauDecimaux.length;i++){
            cumul = cumul + tableauDecimaux[i];
        }

        int moyenne = (int) cumul / tableauDecimaux.length;
//        System.out.println(cumul);
//        System.out.println(moyenne);

        return moyenne;
    }

}
