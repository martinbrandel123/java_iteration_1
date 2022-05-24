package Case.Ennemi;

import Case.Case;
import Fights.Fights;

public abstract class Ennemi extends Case implements Fights {
    private String name;
    private int life;
    private int basicLife;
    private int attack;

    public Ennemi (String pName, int pLife, int pAttack){
        this.name = pName;
        this.life = pLife;
        this.basicLife = pLife;
        this.attack = pAttack;
    }

    public String getName(){
        return this.name;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getLife(){
        return this.life;
    }

    public void removeLifeFromFight(int attack){
        this.life = this.life - attack;
    };

    public void setAttack(int attack){
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Ennemi{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                '}';
    }
}
