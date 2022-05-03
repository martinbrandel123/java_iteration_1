package Menu;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public void startGame() {
        System.out.println("Le jeu commence ...");
        System.out.println("Si vous souhaitez quitter le jeu ecrivez : quit");
        System.out.println("Vous devez choisir un Hero entrez : Guerrier ou Magicien ");

        String gameStatment = input.nextLine();
        String hero = input.nextLine();
        while(!hero.equals("G") || !hero.equals("M")){
            if(hero.equals("G") || hero.equals("M")){
                System.out.println("Vous avez Choisie : " + hero);
                if()
                break;
            }else {
                System.out.println("Il faut choisir !");
                hero = input.nextLine();
            }
        }
    }

    public void leaveGame (){
        System.out.println("Vous avez quittez le jeu");

    }

    public Boolean isInGame(){
        String gameStatment = input.nextLine();
        if(gameStatment == "quit"){
            return true;
        }
        return false;
    }


    public String getTypeOfHero (){
        String hero = "ddd";
        return hero;
    }


}
