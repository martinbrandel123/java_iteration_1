package Hero;
import Hero.Weapon.Weapon;

public class Guerrier {
    // Attributs
    private String name;
    private int life;
    private int attack;
    private Weapon weapon;
    private String shield;

    //Constructeur
    public Guerrier(String pName, int pLife, int pAttack, Weapon pWeapon, String pShield){
        this.name = pName;
        this.life = pLife;
        this.attack = pAttack;
        this.weapon = pWeapon;
        this.shield = pShield;
    }
    public Guerrier(){
        this.name = "felipe";
        this.life = 1;
        this.attack = 10;
        this.shield = "bouclier de la muerte";
    }
    public Guerrier(String pName){
        this.name = pName;
        this.life = 5;
        this.attack = 5;
        this.shield = "bouclier humain";
    }
    // Accesseurs / Mutateurs
    public Weapon getWeapon(){
        return this.weapon;
    }

    // to String
    public String toString() {
         return  "Guerrier nom : " + this.name + "  |  Bouclier type : " + this.shield  + "  |  Weapon type : " + this.weapon ;
}
}
