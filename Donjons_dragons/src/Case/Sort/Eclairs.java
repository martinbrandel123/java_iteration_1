package Case.Sort;

import Case.Case;

public class Eclairs extends Case {
    // Attributs
    private String name;
    private int attack;

    // Constructeur

    public Eclairs(String pName, int pAttack) {
        this.name = pName;
        this.attack = pAttack;
    }
    public Eclairs() {
        this.name = "ECLAIRS AGROU AGROU";
        this.attack = 0;
    }
    public String toString(){
        return " sort type : " + this.name + " | valeur d'attaque : " + this.attack;
    }
}
