package Board;

import Case.Case;
import Case.Emptycase;
import Case.Ennemi.Dragons;
import Case.Ennemi.Gobelins;
import Case.Ennemi.Sorciers;
import Case.Potion.Potionmagique;
import Case.Potion.Potionstandards;
import Case.Sort.Bouledefeus;
import Case.Sort.Eclairs;
import Case.Weapon.Epees;
import Case.Weapon.Massues;

import java.util.ArrayList;
import java.util.Arrays;


public class Board {
    // attributs
    private ArrayList<Case> GamePlateau;
    private ArrayList<Case> CaseString;
    private ArrayList<Integer> numberOfInstanceToCreate;
    private Case caseVide;
    private int dice;
    // contructeur
    public Board(){
        this.GamePlateau = new ArrayList<Case>();
        this.CaseString = new ArrayList<Case>();
        this.numberOfInstanceToCreate = new ArrayList<Integer>();
    }
    //methode
    public void createGameBoard(){
        CaseString.addAll(Arrays.asList(
                new Dragons(), new Sorciers(), new Gobelins(),
                new Massues(), new Epees(),
                new Eclairs(), new Bouledefeus(),
                new Potionstandards(), new Potionmagique(),
                new Emptycase()
        ));
        numberOfInstanceToCreate.addAll(Arrays.asList(0, 10, 10, 5, 4, 5, 2, 6, 2, 15));
        GamePlateau.add(new Emptycase());
        while (numberOfInstanceToCreate.size() > 0) {
              dice = (int) Math.floor(Math.random() * numberOfInstanceToCreate.size());
              GamePlateau.add(CaseString.get(dice));
              implementBoard();
           }
    }
    public void implementBoard(){
        int currentNumber = numberOfInstanceToCreate.get(dice);
        currentNumber = currentNumber - 1;
        numberOfInstanceToCreate.set(dice, currentNumber);
        if(numberOfInstanceToCreate.get(dice) <= 0){
            numberOfInstanceToCreate.remove(dice);
            CaseString.remove(dice);
        }
    }
    // getter / setter
    public ArrayList<Case> getBoard(){
        return GamePlateau;
    }
}
