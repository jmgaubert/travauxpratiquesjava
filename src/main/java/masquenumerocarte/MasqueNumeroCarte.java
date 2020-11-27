package masquenumerocarte;

public class MasqueNumeroCarte {

    String numeroCarte;

    public MasqueNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public static String masquerNumeroCarte(String numeroCarte){
        char[] numeroCarteTemporaire = new char[numeroCarte.length()];

        for (int i=0;i<numeroCarte.length();i++) {
            if(i<numeroCarte.length()-4){
               numeroCarteTemporaire[i]='#';
//               System.out.println("num "+numeroCarteTemporaire[i]);
            }
            else{
               numeroCarteTemporaire[i]=numeroCarte.charAt(i);
//               System.out.println("num "+numeroCarteTemporaire[i]);
            }
        }
        String numeroCarteMasque = String.copyValueOf(numeroCarteTemporaire);
        System.out.println("numero carte : "+numeroCarte+" "+"numero carte masque : " +numeroCarteMasque);

        return numeroCarteMasque;

    }

}
