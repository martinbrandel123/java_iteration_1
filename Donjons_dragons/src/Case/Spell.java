package Case;

public class Spell extends Case{
    // Attributs
    private String name;
    private int attack;

    // Constructeur

    public Spell(String pName,int pAttack) {
        this.name = pName;
        this.attack = pAttack;
    }
    public Spell() {
        this.name = "sort de merde";
        this.attack = 0;
    }
    public String toString(){
        return " sort type : " + this.name + " | valeur d'attaque : " + this.attack;
    }
}
