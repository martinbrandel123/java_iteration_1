package Hero;

import Case.Items;

public abstract class Personnage {
    private String classe;
    private String name;
    private int life;
    private int attack;
    private int basicAttack;
    private Items item;

    public Personnage(String pClasse,String pName, int pLife, int pAttack){
        this.classe = pClasse;
        this.name = pName;
        this.life = pLife;
        this.basicAttack = pAttack;
        this.item = new Items();
        this.attack = pAttack;
    }
    // getter / setter


    public Items getItem(){
        return this.item;
    }
    public void setItem(Items pItem){
        this.item = pItem;
    }

    public void setLife(int life) {
        this.life += life;
        if(this.life > 20){
            this.life = 20;
        }
    }
    public void setAttack(int nmbr) {
        this.attack = this.basicAttack + nmbr;
    }
    public int getAttack(){
        return this.attack;
    }
    public String toString() {
        return "***** Votre Personnage *****"+ "\n"
                +"=> Force d'attaque : " + this.attack + "\n"
                +"=> Vie : " + this.life + "/20" + "\n"
                + getItem() ;
    }
}
