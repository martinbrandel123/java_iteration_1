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
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> caseNumber;
    private ArrayList<Integer> numberOfInstanceToCreate;
    private Case caseVide;
    private int dice;
    // contructeur
    public Board(){
        this.GamePlateau = new ArrayList<Case>();
        this.caseNumber = new ArrayList<Integer>();
        this.numbers = new ArrayList<Integer>();
        this.numberOfInstanceToCreate = new ArrayList<Integer>();
    }
    //methode
    public void createCaseNumberList(){
        numbers.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        numberOfInstanceToCreate.addAll(Arrays.asList(4, 10, 10, 5, 4, 5, 2, 6, 2, 15));
        while (numberOfInstanceToCreate.size() > 0) {
            dice = (int) Math.floor(Math.random() * numberOfInstanceToCreate.size());
            caseNumber.add(numbers.get(dice));
            implementCaseNumber();
        }
    }
    public void createGameBoard(){
        createCaseNumberList();
        GamePlateau.add(new Emptycase());
        for (int i = 0; i < caseNumber.size() - 1; i++) {
            GamePlateau.add(getInstanceOfCase(caseNumber.get(i)));
        }
    }
    public void implementCaseNumber(){
        int currentNumber = numberOfInstanceToCreate.get(dice);
        currentNumber = currentNumber - 1;
        numberOfInstanceToCreate.set(dice, currentNumber);
        if(numberOfInstanceToCreate.get(dice) <= 0){
            numberOfInstanceToCreate.remove(dice);
            numbers.remove(dice);
        }
    }

    public Case getInstanceOfCase(int n){
        return switch (n){
        case 0 ->  new Dragons();
        case 1 ->  new Sorciers();
        case 2 ->  new Gobelins();
        case 3 ->  new Massues();
        case 4 ->  new Epees();
        case 5 ->  new Eclairs();
        case 6 ->  new Bouledefeus();
        case 7 ->  new Potionstandards();
        case 8 ->  new Potionmagique();
        case 9 ->  new Emptycase();
            default -> throw new IllegalStateException("Unexpected value: " + n);
        };
    }
    // getter / setter
    public ArrayList<Case> getBoard(){
        return  GamePlateau;
    }
}
