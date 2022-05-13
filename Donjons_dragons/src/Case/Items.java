package Case;

public class Items extends Case {
    //Attributs
    private String name;
    private int itemAttack;
    //Constructeurs
    public  Items(String pName, int pAttack){
        this.name = pName;
        this.itemAttack = pAttack;
    }
    public  Items(){
        this.name = "ARME DE BASE";
        this.itemAttack = 1;
    }

    // getter / setter
    public String getName(){
        return this.name;
    }
    public int getItemAttack(){
        return this.itemAttack;
    }

    public String toString() {
        return "=> Arme {" +
                "Nom='" + this.name + '\'' +
                " | Attaque='" + this.itemAttack + '\'' +
                '}';
    }
}
