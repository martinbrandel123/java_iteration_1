package Game;
import Menu.Menu;
import Hero.Guerrier;
import Hero.Magicien;

public class Game {
    private Menu menu;
    private String hero;
    private String pseudo;
    private int position ;

    private int nbCase ;

    public Game(){
        this.menu = new Menu();
        position = 1;
        nbCase = 64;
    }
    public void startGame(){
        this.position = 1;
        initializeTheGame();
        changeInfos();
        createTheHero();
        createMainMenu();
    }
    public void restartGame(){
        String playAgainChoice = menu.askIfPlayAgain();
        while(true){
            if(playAgainChoice.equals("Oui")){
                startGame();
            }else if(playAgainChoice.equals("exit")) {
                menu.leaveGame(playAgainChoice);
            }
          }
        }
    }
    public void initializeTheGame() {
        this.hero = menu.chooseTheHero();
        this.pseudo = menu.choosePseudo();
    }
    public void createMainMenu(){
        int menuChoice = menu.askForMenuChoice();
        switch(menuChoice){
            case 1:
                playGame();
                break;
        }
    }
    public void createTheHero(){
        if(hero.equalsIgnoreCase("Guerrier")){
            Guerrier G = new Guerrier(pseudo);
            this.menu.displayGuerrierInfo(G);
        }else if (hero.equalsIgnoreCase("Magicien")){
            Magicien M = new Magicien(pseudo);
            this. menu.displayMagicienInfo(M);
        }
    }

    public void changeInfos(){
        Boolean haveToChangeInfos = menu.isInfoToChange();
        while(haveToChangeInfos){
            if(haveToChangeInfos){
                String InfoToChange = menu.chooseInfoToChange();
                if(InfoToChange.equals("Classe")){
                    this.hero = menu.chooseTheHero();
                }else if(InfoToChange.equals("Pseudo")){
                    this.pseudo = menu.choosePseudo();
                }else if(InfoToChange.equals("Restart")){
                    this.hero = menu.chooseTheHero();
                    this.pseudo = menu.choosePseudo();
                }
            }
            haveToChangeInfos = menu.isInfoToChange();
        }
    }
    public void playGame(){
        int dice = 0;
        while(isGameInProcesse()){
            Boolean isEnter = menu.askForEnter();
            if(isEnter){
                dice = (int) Math.ceil(Math.random() * 6);
                menu.displayPosition(this.position);
                this.position += dice;
            }
        }
        if(!isGameInProcesse()){
            menu.displayEndGame();
        }
    }
    public boolean isGameInProcesse(){
        boolean res = this.position < nbCase;
        return res;
    }
}
