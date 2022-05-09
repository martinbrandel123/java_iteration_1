package Hero;

public abstract class Personnage {
    private String classe;
    private String name;
    private int life;
    private int attack;


    public Personnage(String pClasse,String pName, int pLife, int pAttack){
        this.classe = pClasse;
        this.name = pName;
        this.life = pLife;
        this.attack = pAttack;
    }
    public  Personnage(String pClasse,String pName){
        this.classe = pClasse;
        this.name = pName;
        this.life = 5;
        this.attack = 5;
    }

    // getter : setter
    public String getClasse(){return this.classe;}
    public String getName(){return this.name;}
    public int getLife(){return this.life;}
    public int getAttack(){return this.attack;}


    public void setLife(int lifeValue){
        if(this.life <= 0 || this.life >= 10){
            this.life = 5;
        }else {
            this.life = lifeValue;
        }
    }
    public void setAttack(int attackValue){
        if(this.attack <= 0 || this.attack >= 10){
            this.attack = 5;
        }else {
            this.life = attackValue;
        }
    }

    public String toString() {
        return this.classe + " : " + this.name + " |";
    }
}
