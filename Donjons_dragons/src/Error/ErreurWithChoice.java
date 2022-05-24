package Error;

public class ErreurWithChoice extends Exception {

    public ErreurWithChoice() {
        super("erreur");
    }

    @Override
    public String toString() {
        return "ErreurWithChoice";
    }
}
