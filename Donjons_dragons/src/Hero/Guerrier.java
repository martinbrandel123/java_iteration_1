package Hero;
import Case.Case;
import Case.Equipement;
import Case.Weapon.Weapon;

public class Guerrier extends Personnage{
    // Attributs
    private Case weapon;
    //Constructeur
    public Guerrier(String pClasse, String pName) {
        super(pClasse, pName,10, 10);
        this.weapon = new Weapon();
    }




    // Accesseurs / Mutateurs
    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //to string
    @Override
    public String toString() {
        return super.toString() + this.weapon;
    }
}
