package Case.Ennemi;

import Case.Case;

public class Gobelins extends Ennemi  {

    public Gobelins (){
        super("Gobelin", 5, 1);
    }
    @Override
    public String toString() {
        return "UN GOBLIN ! ATTAQUE LE !";
    }
}
