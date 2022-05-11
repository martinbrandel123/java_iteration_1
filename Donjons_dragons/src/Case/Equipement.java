package Case;

public abstract class Equipement extends Case{

    private String name;
    private int attack;

    public Equipement(String pName, int pAttack){
        this.name = pName;
        this.attack = pAttack;
    }

    public Equipement() {
        this.name = "ARME DE BASE";
        this.attack = 1;
    }

    public String toString() {
        return "Arme {" +
                "Nom='" + this.name + '\'' +
                " | Attaque='" + this.attack + '\'' +
                '}';
    }

}
