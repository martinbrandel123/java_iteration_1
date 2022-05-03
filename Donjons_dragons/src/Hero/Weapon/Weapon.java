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




    public int getAttack(){
        return this.attack;
    }

    public String toString(){
        return this.name + "  " + this.attack;
    }
}
