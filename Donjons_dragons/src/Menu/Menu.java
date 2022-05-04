package Menu;
import java.util.Scanner;
import Hero.Guerrier;
import Hero.Magicien;


public class Menu {
    private Scanner input = new Scanner(System.in);

    public String chooseTheHero() {
        System.out.println("Bienvenue ...");
        System.out.println("Pour quitter le jeu entrez 'exit'");
        System.out.println("Pour choisir un Hero entrez : Guerrier ou Magicien ");
        String hero = this.input.nextLine();
        while(!hero.equals("Guerrier") || !hero.equals("Magicien")){
            leaveGame(hero);
            if(hero.equals("Guerrier") || hero.equals("Magicien")){
                System.out.println("Vous avez Choisie : " + hero);
                break;
            }else {
                System.out.println("Il faut choisir !");
                hero = this.input.nextLine();
            }
        }
        return hero;
    }
    public String choosePseudo (){
        System.out.println("=> Vous devez choisir un Pseudo");
        String pseudo = this.input.nextLine();
        leaveGame(pseudo);
        return pseudo;
    }
    public Boolean isInfoToChange(){
        System.out.println("Souhaitez vous changer vos infos ?");
        System.out.println("=> Entrez Oui/Non");
        String haveTochange = this.input.nextLine();
        if(haveTochange.equals("Oui")){
            return true;
        }
        return false;
    }
    public String chooseInfoToChange() {
        System.out.println("Pour changer les infos ?");
        System.out.println("=> entrez Classe / Pseudo ?");
        String haveTochange = this.input.nextLine();
        return haveTochange;
    }







    public void displayGuerrierInfo (Guerrier hero){
        System.out.println(hero);
    }
    public void displayMagicienInfo(Magicien hero) {
        System.out.println("Votre Hero");
        System.out.println("=> " + hero);
    }


    public void leaveGame(String inputValue){
        if(inputValue.equals("exit")){
            System.out.println("Sortie du jeu ...");
            System.exit(0);
        }
    }

}


