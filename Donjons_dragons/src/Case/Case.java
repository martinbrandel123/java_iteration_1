package Case;

import Hero.Magicien;
import Hero.Guerrier;
import Hero.Personnage;

public abstract class Case {
    //Attributs

    //Constructeur


    public Case() {
    }

    public void interaction(Personnage personnage){

        System.out.println("FONCTION INTERACTIION");
    }

    // toString
    public String toString() {
        return "CASE";
    }


}
