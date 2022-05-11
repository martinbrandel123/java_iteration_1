import java.util.Arrays;


public class main {
    public static void main(String args[]){
//        String[] wordToCrypt;
//        wordToCrypt= new String[]{"c","a","m","p","u","s"};
//        String dico = "abcdefghijklmnopqrs";
//       // System.out.println(dico.indexOf("c"));


        String alphabet = "abcdefghijk";
        String mdp = "dgbj";
        String mot = "campuscam";

        for (int i = 0; i < mot.length(); i++) {
            char matching_letter = mdp.charAt(i%mdp.length());
            int decalage = alphabet.indexOf(matching_letter);
            char lettre_a_encoder =  mot.charAt(i);
            int index_lettre_a_encoder = alphabet.indexOf(lettre_a_encoder);

            System.out.println("i : " + i);
            System.out.println("lettre à encoder : " + lettre_a_encoder);
            System.out.println("i%3 : " + i%mdp.length());
            System.out.println("matching letter in mdp : " + matching_letter);
            System.out.println("decalge à appliquer : " + decalage);
            System.out.println("--------------------");
        }


    }
}
