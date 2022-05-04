package Hero;
import Hero.Weapon.Weapon;

public class Guerrier {
    // Attributs
    private String name;
    private int life;
    private int attack;
    private Weapon weapon;

    //Constructeur
    public Guerrier(String pName, int pLife, int pAttack, Weapon pWeapon){
        this.name = pName;
        this.life = pLife;
        this.attack = pAttack;
        this.weapon = pWeapon;

    }
    public Guerrier(){
        this.name = "guerrier sans nom";
        this.life = 1;
        this.attack = 10;

    }
    public Guerrier(String pName){
        this.name = pName;
        this.life = 5;
        this.attack = 5;

    }
    // Accesseurs / Mutateurs
    public Weapon getWeapon(){
        return this.weapon;
    }

    // to String
    public String toString() {
         return "Guerrier " +  this.name + "  |  Weapon type : " + this.weapon ;
    }
}
