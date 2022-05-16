package Game;
import Board.Board;
import Case.Case;
import Case.Ennemi.Ennemi;
import Case.Potion.Potion;

import Case.Items;
import Case.Sort.Sort;
import Case.Weapon.Epees;
import Case.Weapon.Weapon;
import Hero.Personnage;
import Menu.Menu;

import Hero.Guerrier;
import Hero.Magicien;


public class Game {
    private Menu menu;
    private String classe;
    private String pseudo;
    private int position ;
    private Personnage personnage;
    private int nbCase ;
    private Board board;



    public Game(){
        this.menu = new Menu();
        this.board = new Board();
        this.position = 1;
        this.nbCase = 64;
    }
    public void startGame(){
        this.position = 0;
        initializeTheGame();
        createTheHero();
        createMainMenu();
    }
    public void restartGame(){
        while(true){
            String playAgainChoice = menu.askIfPlayAgain();
            if(playAgainChoice.equals("Oui")){
                startGame();
            }else if(playAgainChoice.equals("Non")) {
                System.exit(0);
            }
            playAgainChoice = "";
          }
        }
    public void initializeTheGame() {
        this.board.createGameBoard();
        this.classe = menu.chooseTheHero();
        this.pseudo = menu.choosePseudo();
    }
    public void createMainMenu(){
        int menuChoice = menu.askForMenuChoice();

        switch(menuChoice){
            case 1:
                playGame();
                break;
            case 2:
                System.out.println(personnage);
                createMainMenu();
                break;
            case 3:
                changeInfos();
                createMainMenu();
                break;
        }
    }
    public void createTheHero(){
        if(classe.equalsIgnoreCase("Guerrier")){
            this.personnage = new Guerrier(classe, pseudo);
        }else if (classe.equalsIgnoreCase("Magicien")){
            this.personnage = new Magicien(classe, pseudo);
        }
        this.menu.displayPersonnageInfo(personnage);
    }
    public void changeInfos(){
        Boolean haveToChangeInfos = menu.isInfoToChange();
        System.out.println(haveToChangeInfos);
        while(haveToChangeInfos){
            if(haveToChangeInfos){
                String infoToChange = menu.chooseInfoToChange();
                switch (infoToChange){
                    case "Classe":
                        this.classe = menu.chooseTheHero();
                        break;
                    case "Pseudo":
                        this.pseudo = menu.choosePseudo();
                        break;
                    case "Restart":
                        this.classe = menu.chooseTheHero();
                        this.pseudo = menu.choosePseudo();
                        break;
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
                dice = (int) Math.ceil(Math.random() * 1);
                Case currentCase = board.getBoard().get(position);
                menu.displayPosition(this.position);
                updatePersonnageStats(currentCase);
                System.out.println(currentCase);
                startFight(currentCase);
                System.out.println(this.personnage);
                System.out.println("$$$$$$$$$$$$$$$$$");

                this.position += dice;
            }
        }
        if(!isGameInProcesse()){
            menu.displayEndGame();
        }
    }

    public void startFight(Case currentCase){

        if(currentCase instanceof Ennemi){
          //  System.out.println((Ennemi) board.getBoard().get(position));
            //int isFight = menu.askForFight();
            //System.out.println(isFight);
            //if(isFight == 1 ){

            //}
  //             this.board.getBoard().get(position);
 //               Boolean isAlive = ((Ennemi) currentCase).removeLifeFromFight(personnage.getItem().getItemAttack());
  //              this.board.getBoard().get(position);
  //              if(!isAlive){
  //                  this.board.getBoard().set(position, null);
  //                  this.board.getBoard().get(position);
   //             };

        }
    }
    public void updatePersonnageStats(Case currentCase){
        if(currentCase instanceof Weapon && personnage instanceof Guerrier){
            this.personnage.setItem((Items) currentCase);
            this.personnage.setAttack(((Items) currentCase).getItemAttack());
        }
        else if (currentCase instanceof Sort && personnage instanceof Magicien){
           // this.personnage.setSort((Sort) currentCaseObj);
           // this.personnage.setAttack();
        }else if(currentCase instanceof Potion){
           this.personnage.setLife(((Potion) currentCase).getHealt());
        }
    }
    public boolean isGameInProcesse(){
        boolean res = this.position < nbCase;
        return res;
    }
}
