package Case.Weapon;

import Case.Case;

public class Epees extends Case {
    // Attributs
    private String name;
    private int attack;

    //Constructeur
    public Epees(String pName, int pAttack){
        this.name = pName;
        this.attack = pAttack;
    }
    public Epees() {
        this.name = "Epee de merde";
        this.attack = 0;
    }

    public int getAttack(){
        return this.attack;
    }

    public String toString(){
        return " arme type : " + this.name + " | valeur d'attaque : " + this.attack;
    }
}
