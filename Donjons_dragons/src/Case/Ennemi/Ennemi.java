package Case.Ennemi;

import Case.Case;

public class Ennemi extends Case {
    public String name;
    public int life;
    public int attack;

    public Ennemi (String pName, int pLife, int pAttack){
        this.name = pName;
        this.life = pLife;
        this.attack = pAttack;
    }
}
