package Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

import Case.Case;
import Hero.Guerrier;
import Hero.Magicien;
import Hero.Personnage;
import jdk.swing.interop.SwingInterOpUtils;


public class Menu {
    private Scanner input;
    public Menu(){
        this.input = new Scanner(System.in);
    }
    public String chooseTheHero() {
        displayH1("BIENVENUE SUR DONJON & DRAGON !");
        System.out.println("Pour choisir un Hero entrez : Guerrier ou Magicien ");
        String hero = this.input.nextLine();
        while(!(hero.equals("Guerrier") || hero.equals("Magicien"))){
            leaveGame(hero); // si hero = exit donc quitté le jeu
            displayParagraph("Il faut choisir entre Guerrier ou Magicien ?");
            hero = this.input.nextLine();
        }
        if(hero.equals("Guerrier") || hero.equals("Magicien")){
            System.out.println("Vous avez Choisie : " + hero);
        }
        return hero;
    }
    public String choosePseudo (){
        displayH2("Vous devez choisir un Pseudo");
        String pseudo = this.input.nextLine();
        leaveGame(pseudo);
        return pseudo;
    }
    public Boolean isInfoToChange(){
        System.out.println("Souhaitez vous changer vos infos ?");
        displayParagraph("Entrez Oui/Non");
        String haveTochange = this.input.nextLine();
       while(!(haveTochange.equals("Oui") || haveTochange.equals("Non"))){
           displayParagraph("Entrez Oui/Non");
           haveTochange = this.input.nextLine();
       };
        if(haveTochange.equals("Oui")){
            return true;
        }
        return false;
    }
    public String chooseInfoToChange() {
        System.out.println("Pour changer les infos ?");
        System.out.println("=> entrez Classe / Pseudo ?");
        System.out.println("Pour recommencer ?");
        System.out.println("=> entrez Restart");
        String haveTochange = this.input.nextLine();
        return haveTochange;
    }
//    public void displayGuerrierInfo (Guerrier hero){
//        displayH1("Félicitation Votre Hero à été crée !");
//        System.out.println("=> " + hero);
//    }
//    public void displayMagicienInfo(Magicien hero) {
//        displayH1("Félicitation Votre Hero à été crée !");
//        System.out.println("=> " + hero);
//    }
    public void displayPersonnageInfo (Personnage personnage){
        displayH1("Félicitation Votre Hero à été crée !");
        System.out.println("=> " + personnage.toString());
    }
    public int askForMenuChoice(){
        displayH2("MENU");
        System.out.println("1) COMMENCER LA PARTIE !");
        System.out.println("2) Afficher les caractèristiques du Héro");
        System.out.println("3) Modifier les caractèristiques du Héro");
        int menuChoice = 0;
        try{
            menuChoice = this.input.nextInt();
            this.input.nextLine();
            return menuChoice;
        }catch (InputMismatchException e){
            System.out.println("Chiffre seulement");
        }
    return menuChoice;
    }
    public Boolean askForEnter() {
        displayH1("Appuyer sur Entrer pour jettez les dés");
        if(this.input.hasNextLine()){
            this.input.nextLine();
            this.input.hasNextLine();
            return this.input.hasNextLine();
        }
        return false;
    }
    public String askIfPlayAgain(){
        displayH1("SOUHAITEZ VOUS REJOUER UNE PARTIE ?");
        System.out.println("Oui !");
        System.out.println("Non :(");
        String playAgainChoice = this.input.nextLine();
        return playAgainChoice;
    }
    public void displayPosition(int position){
        System.out.println("votre position => " + position);
    }
//    public void displayObj(Case obj){
//        System.out.println("vous avez trouvez "+ obj);
//    }
    public void displayH1(String text){
        System.out.println("-------------------");
        System.out.println(text);
        System.out.println("-------------------");
    }
    public void displayH2(String text){
        System.out.println("-------" + text + "-------");
    }
    public void displayParagraph(String text){
        System.out.println("=> " + text);
    }
    public void displayEndGame(){
        System.out.println(
                "██████╗ ██╗   ██╗███╗   ██╗ ██████╗ ███████╗ ██████╗ ███╗   ██╗███████╗       ██╗       ██████╗ ██████╗  █████╗  ██████╗  ██████╗ ███╗   ██╗███████╗\n" +
                "██╔══██╗██║   ██║████╗  ██║██╔════╝ ██╔════╝██╔═══██╗████╗  ██║██╔════╝       ██║       ██╔══██╗██╔══██╗██╔══██╗██╔════╝ ██╔═══██╗████╗  ██║██╔════╝\n" + "██║  ██║██║   ██║██╔██╗ ██║██║  ███╗█████╗  ██║   ██║██╔██╗ ██║███████╗    ████████╗    ██║  ██║██████╔╝███████║██║  ███╗██║   ██║██╔██╗ ██║███████╗\n" +
                "██║  ██║██║   ██║██║╚██╗██║██║   ██║██╔══╝  ██║   ██║██║╚██╗██║╚════██║    ██╔═██╔═╝    ██║  ██║██╔══██╗██╔══██║██║   ██║██║   ██║██║╚██╗██║╚════██║\n" +
                "██████╔╝╚██████╔╝██║ ╚████║╚██████╔╝███████╗╚██████╔╝██║ ╚████║███████║    ██████║      ██████╔╝██║  ██║██║  ██║╚██████╔╝╚██████╔╝██║ ╚████║███████║\n" +
                "╚═════╝  ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝ ╚══════╝ ╚═════╝ ╚═╝  ╚═══╝╚══════╝    ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝");
    }
    public void leaveGame(String inputValue){
        if(inputValue.equals("exit")){
            displayH1("Sortie du jeu ...");;
            System.out.println("Mais allez la reviens STP STP STP STP");
            System.exit(0);
        }
    }



}




