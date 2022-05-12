package Case.Ennemi;

import Case.Case;

public class Sorciers extends Ennemi {
    public Sorciers (){
        super("Sorcier", 10, 2);
    }
    @Override
    public String toString() {
        return "UN SORCIER ! ATTAQUE LE !";
    }
}
