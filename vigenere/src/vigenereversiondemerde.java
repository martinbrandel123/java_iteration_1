public class vigenereversiondemerde {

    public void test (){
        String dico = "abcdefhijkl";
        System.out.println(dico.indexOf("c"));
        System.out.println("--------------------------------");

        String[] wordToCrypt;
        String[] wordToEncrypt = new String[6];
        String[] alphabet;
        int[] key;
        String newWord = "";

        alphabet=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        wordToCrypt=new String[]{"c","a","m","p","u","s"};
        String mdp = "abcabc";
        key = new int[]{0,1,2,0,1,2};

        for (int i = 0; i < wordToCrypt.length; i++){
            for (int j = 0; j < alphabet.length; j++){
                if(wordToCrypt[i].equals(alphabet[j])){
                    wordToEncrypt[i] = alphabet[j + key[i]];                }
            }
        }
        for (int i = 0; i < wordToCrypt.length; i++){
            for (int j = 0; j < alphabet.length; j++){
                if(wordToEncrypt[i].equals(alphabet[j])){
                    newWord += alphabet[j - key[i]];
                }
            }
        }
        System.out.println(newWord);
    }

}
