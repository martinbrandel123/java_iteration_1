package Case.Potion;

import Case.Case;

public abstract class Potion extends Case {
    private String name;
    private int healt;

    public Potion(String pName, int pHealt){
        this.name = pName;
        this.healt = pHealt;
    }

    public String getName(){
        return this.name;
    }
    public int getHealt(){
        return this.healt;
    }

}
