package sommecarresentiers;
import java.util.*;

public class SommeCarresEntiers {

    int[] tableauEntier;

    public SommeCarresEntiers(int[] tableauEntier) {
        this.tableauEntier = tableauEntier;
    }

    public static int calculerSommeCarresEntiers(int[] tableauEntier){
        int cumul = 0;

        if(tableauEntier.length == 0){
            return -1;
        }

        for(int i=0;i < tableauEntier.length;i++){
            cumul = cumul + (tableauEntier[i]*tableauEntier[i]);
        }
        return cumul;
    }
}
