package Hero;
import Case.Sort.Eclairs;
import Case.Sort.Sort;
import Case.Weapon.Weapon;

public class Magicien extends Personnage{
    // Attributs
    private Sort sort;
//Constructeur
    public Magicien(String pClasse, String pName) {
        super(pClasse, pName, 10, 15);
        this.sort = new Sort();
    }
    // Accesseurs / Mutateurs
    @Override
    public void setSort(Sort sort) {
        this.sort = sort;
    }
    // to String
    public String toString() {
        return super.toString() + " " + this.sort;
    }

}
