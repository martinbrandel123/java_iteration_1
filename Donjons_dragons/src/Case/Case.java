package Case;

import Hero.Magicien;
import Hero.Guerrier;
import Hero.Personnage;

public abstract class Case {
    //Attributs

    //Constructeur
//    public Case(){
//    }
//    //methode
    public void interaction(Personnage personnage){
        if(personnage instanceof Magicien){
            System.out.println("Magicien");
        }
        else if (personnage instanceof Guerrier) {
            System.out.println("guerrier");
        }
        ;
    }

    // toString
    public String toString() {
        return "CASE";
    }


}
