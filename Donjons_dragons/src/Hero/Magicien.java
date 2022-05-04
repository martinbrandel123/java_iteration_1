package Hero;

import Hero.Weapon.Weapon;

public class Magicien {
    // Attributs
    private String name;
    private int life;
    private int attack;
    //private Sort sort;

    //Constructeur
    public Magicien(String pName, int pLife, int pAttack){
        this.name = pName;
        this.life = pLife;
        this.attack = pAttack;
        //this.sort = pSort;
    }
    public Magicien(){
        this.name = "magicien sans nom";
        this.life = 1;
        this.attack = 10;
    }
    public Magicien(String pName){
        this.name = pName;
        this.life = 5;
        this.attack = 5;
    }

    // Accesseurs / Mutateurs
    public String getName(){
        return this.name;
    }

    // to String
    public String toString() {
        return "Magicien : " + this.name + "  |  Votre vie : " + this.life ;
    }
}
