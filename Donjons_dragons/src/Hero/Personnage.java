package Hero;

import Case.Weapon.Weapon;
import Case.Sort.Sort;

import javax.swing.*;

public abstract class Personnage {
    private String classe;
    private String name;
    private int life;
    private int attack;
    private int basicAttack;
    private Weapon weapon;
    private Sort sort;

    public Personnage(String pClasse,String pName, int pLife, int pAttack){
        this.classe = pClasse;
        this.name = pName;
        this.life = pLife;
        this.basicAttack = pAttack;
    }
    // getter / setter
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
    public int setAttack(int weaponAttack) {
        this.attack = this.basicAttack + weaponAttack;
        return this.attack;
    }

    public String toString() {
        return "***** Votre Personnage *****"+ "\n"
                +"=> Force d'attaque : " + this.basicAttack + "\n"
            +"=> Vie : " + this.life + "/20" + "\n";
    }
}
