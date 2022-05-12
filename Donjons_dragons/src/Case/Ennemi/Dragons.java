package Case.Ennemi;
import Case.Case;

public class Dragons extends Ennemi  {

    public Dragons (){
        super("Dragon", 20, 5);
    }
    @Override
    public String toString() {
        return "UN DRAGON SAUVAGE ! ATTAQUE LE !";
    }
}
