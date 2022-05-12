package Game;
import Case.Case;
import Case.Potion.Potion;
import Case.Weapon.Weapon;
import Case.Sort.Sort;
import Hero.Personnage;
import Menu.Menu;

import Hero.Guerrier;
import Hero.Magicien;

import Case.Empty;

import Case.Ennemi.Dragons;
import Case.Ennemi.Gobelins;
import Case.Ennemi.Sorciers;

import Case.Weapon.Massues;
import Case.Weapon.Epees;

import Case.Sort.Eclairs;
import Case.Sort.Bouledefeus;

import Case.Potion.Potionstandards;
import Case.Potion.Potionmagique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Game {
    private Menu menu;
    private String classe;
    private String pseudo;
    private int position ;
    private Personnage personnage;
    private int nbCase ;
    private List<Case> GamePlateau;


    private Case caseVide;
    private Case dragon;
    private Case sorcier;
    private Case gobelin;
    private Case massue;
    private Case epee;
    private Case eclair;
    private Case bouleDeFeu;
    private Case potionStandar;
    private Case potionMagique;


    public Game(){
        this.menu = new Menu();
        this.GamePlateau = new ArrayList<Case>();
        this.caseVide = new Empty();
        this.dragon = new Dragons();
        this.sorcier = new Sorciers();
        this.gobelin = new Gobelins();
        this.massue = new Massues();
        this.epee = new Epees();
        this.eclair = new Eclairs();
        this.bouleDeFeu = new Bouledefeus();
        this.potionStandar = new Potionstandards();
        this.potionMagique = new Potionmagique();
        this.position = 1;
        this.nbCase = 64;
    }
    public void startGame(){
        this.position = 0;
        initializeTheGame();
        createTheHero();
        createMainMenu();
    }

    public void createGamePlateau(){
        GamePlateau.add(potionStandar);
        GamePlateau.add(massue);
        GamePlateau.add(potionMagique);
        GamePlateau.add(potionStandar);
        GamePlateau.add(potionMagique);
        GamePlateau.add(epee);
        GamePlateau.add(eclair);
        GamePlateau.add(potionMagique);
        GamePlateau.add(bouleDeFeu);
        GamePlateau.add(potionStandar);
        GamePlateau.add(massue);
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
        createGamePlateau();
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
                System.out.println(personnage.toString());
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
            this.menu.displayPersonnageInfo(personnage);
        }else if (classe.equalsIgnoreCase("Magicien")){
            this.personnage = new Magicien(classe, pseudo);
            this.menu.displayPersonnageInfo(personnage);
        }
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
                Case currentCaseObj =this.GamePlateau.get(position);
                menu.displayPosition(this.position);
                menu.displayObj(currentCaseObj);
                updatePersonnageStats(currentCaseObj);

                System.out.println("----------------");
                System.out.println(this.personnage);
                System.out.println("----------------");

                this.position += dice;
            }
        }
        if(!isGameInProcesse()){
            menu.displayEndGame();
        }
    }
    public void updatePersonnageStats(Case currentCaseObj){
        if(currentCaseObj instanceof Weapon && personnage instanceof Guerrier){
            this.personnage.setWeapon((Weapon) currentCaseObj);
            this.personnage.setAttack(((Weapon) currentCaseObj).getAttack());
        }else if (currentCaseObj instanceof Sort && personnage instanceof Magicien){
            this.personnage.setSort((Sort) currentCaseObj);
//            this.personnage.setAttack(((Sort) currentCaseObj).getAttack());
        }else if(this.GamePlateau.get(position) instanceof Potion){
            this.personnage.setLife(currentCaseObj.getHealt());
        }
    }
    public boolean isGameInProcesse(){
        boolean res = this.position < nbCase;
        return res;
    }
}
