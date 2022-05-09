package Case.Sort;

import Case.Case;

public class Bouledefeus extends Case {
    // Attributs
    private String name;
    private int attack;

    // Constructeur

    public Bouledefeus(String pName, int pAttack) {
        this.name = pName;
        this.attack = pAttack;
    }
    public Bouledefeus() {
        this.name = "BOULE DE FEU";
        this.attack = 0;
    }
    public String toString(){
        return " sort type : " + this.name + " | valeur d'attaque : " + this.attack;
    }
}
