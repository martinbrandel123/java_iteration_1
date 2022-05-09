package Case.Weapon;

import Case.Case;

public class Massues extends Case {
    // Attributs
    private String name;
    private int attack;

    //Constructeur
    public Massues(String pName, int pAttack){
        this.name = pName;
        this.attack = pAttack;
    }
    public Massues() {
        this.name = "Massue de merde";
        this.attack = 0;
    }

    public int getAttack(){
        return this.attack;
    }

    public String toString(){
        return " arme type : " + this.name + " | valeur d'attaque : " + this.attack;
    }
}
