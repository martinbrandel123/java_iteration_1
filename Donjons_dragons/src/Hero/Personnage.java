package Hero;

import Case.Weapon.Weapon;
import Case.Sort.Sort;

public abstract class Personnage {
    private String classe;
    private String name;
    private int life;
    private int attack;

    private Weapon weapon;
    private Sort sort;

    public Personnage(String pClasse,String pName, int pLife, int pAttack){
        this.classe = pClasse;
        this.name = pName;
        this.life = pLife;
        this.attack = pAttack;
    }
    public  Personnage(String pClasse,String pName){
        this.classe = pClasse;
        this.name = pName;
        this.life = 5;
        this.attack = 5;
        this.weapon = new Weapon();
        this.sort = new Sort();
    }

    // getter : setter
    public String getClasse(){return this.classe;}
    public String getName(){return this.name;}
    public int getLife(){return this.life;}
    public int getAttack(){return this.attack;}


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void setSort(Sort sort){
        this.sort = sort;
    };

    public void setLife(int life) {
        this.life = life;
    }

    public String toString() {return this.classe + " : " + this.name + "\n";
    }
}
