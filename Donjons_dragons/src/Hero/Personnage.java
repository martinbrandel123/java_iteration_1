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
        this.attack =  pAttack;
       // this.attack = pAttack;
    }

    // getter / setter
    public int getPersonnageAttack() {
        return this.attack;
    }




    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void setSort(Sort sort){
        this.sort = sort;
    };
    public void setLife(int life) {
        this.life += life;
        if(this.life > 20){
            this.life = 20;
        }
    }
    public void setAttack(int weaponAttack) {
        this.attack += weaponAttack;
    }

    public String toString() {
        return "***** Votre Personnage *****"+ "\n"
                +"=> Force d'attaque : " + this.attack + "\n"
            +"=> Vie : " + this.life + "/15" + "\n";
    }
}
