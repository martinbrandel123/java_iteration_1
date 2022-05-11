package Hero;
import Case.Sort.Eclairs;
import Case.Sort.Sort;
import Case.Weapon.Weapon;

public class Magicien extends Personnage{
    // Attributs
    private Sort sort;

//Constructeur

    public Magicien(String pClasse, String pName, int pLife, int pAttack) {
        super(pClasse, pName, pLife, pAttack);
        this.sort = new Sort();
    }
    public Magicien(String pClasse, String pName) {
        super(pClasse, pName);
    }

    @Override
    public void setSort(Sort sort) {
        this.sort = sort;
    }


//    private String name;
//    private int life;
//    private int attack;
    //private Sort sort;


//    public Magicien(String pName, int pLife, int pAttack){
//        this.name = pName;
//        this.life = pLife;
//        this.attack = pAttack;
//        //this.sort = pSort;
//    }
//    public Magicien(){
//        this.name = "magicien sans nom";
//        this.life = 1;
//        this.attack = 10;
//    }
//    public Magicien(String pName){
//        this.name = pName;
//        this.life = 5;
//        this.attack = 5;
//    }

    // Accesseurs / Mutateurs
//    public String getName(){
//        return this.name;
//    }
//
    // to String
    public String toString() {
        return super.toString() + " " + this.sort;
    }

}
