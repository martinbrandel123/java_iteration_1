package Case.Sort;
import Case.Equipement;


public class Sort extends Equipement {
    // Attributs
    private String name;
    private int attack;

    // Constructeur
    public Sort (String pName, int pAttack) {
        this.name = pName;
        this.attack = pAttack;
    }
    public Sort () {
        this.name = "ECLAIRS AGROU AGROU";
        this.attack = 1;
    }
    @Override
    public String toString() {
        return "Sort {" +
                "Nom='" + this.name + '\'' +
                " | Attaque='" + this.attack + '\'' +
                '}';
    }

}
