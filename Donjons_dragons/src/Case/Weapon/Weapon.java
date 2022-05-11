package Case.Weapon;

import Case.Case;

public class Weapon extends Case {
    private String name;
    private int attack;

    public Weapon(String pName, int pAttack){
        this.name = pName;
        this.attack = pAttack;
    }
    public Weapon() {
        this.name = "ARME DE BASE";
        this.attack = 1;
    }

    @Override
    public String toString() {
        return "Arme {" +
                "Nom='" + this.name + '\'' +
                " | Attaque='" + this.attack + '\'' +
                '}';
    }
}
