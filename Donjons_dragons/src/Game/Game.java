package Game;
import Menu.Menu;
import Hero.Guerrier;
import Hero.Magicien;

public class Game {
    private Menu menu = new Menu();
    private String hero;
    private String pseudo;

    public void createTheHero() {
        this.hero = menu.chooseTheHero();
        this.pseudo = menu.choosePseudo();

        changeInfos();

        if(hero.equalsIgnoreCase("Guerrier")){
            Guerrier hero = new Guerrier(pseudo);
            menu.displayGuerrierInfo(hero);
        }else if (hero.equalsIgnoreCase("Magicien")){
            Magicien hero = new Magicien(pseudo);
            menu.displayMagicienInfo(hero);
        }
    }
    public void changeInfos(){
        Boolean haveToChangeInfos = menu.isInfoToChange();
        if(haveToChangeInfos){
            String InfoToChange = menu.chooseInfoToChange();
            if(InfoToChange.equals("Classe")){
                hero = menu.chooseTheHero();
            }else if(haveToChangeInfos && InfoToChange.equals("Pseudo")){
                pseudo = menu.choosePseudo();
            }
        }
    }

    public void playGame(){

    }
}
