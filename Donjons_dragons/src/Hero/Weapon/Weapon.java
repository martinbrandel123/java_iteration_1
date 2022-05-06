package Hero.Weapon;

public class Weapon {
    // Attributs
    private String name;
    private int attack;

    //Constructeur
    public Weapon(String pName,int pAttack){
        this.name = pName;
        this.attack = pAttack;
    }
    public Weapon() {
        this.name = "arme de merde";
        this.attack = 0;
    }

    public int getAttack(){
        return this.attack;
    }

    public String toString(){
        return " arme type : " + this.name + " | valeur d'attaque : " + this.attack;
    }
}
