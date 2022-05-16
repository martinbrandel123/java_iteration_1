package Hero;

import Case.Items;
import Fights.Fights;

public abstract class Personnage implements Fights {
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
    public int getAttack(){return this.attack;}
    public void setItem(Items pItem){
        Items previousItem = this.item;  // stock l'item actuel avant de le récuperer
        this.item = pItem; // Recuperer l'item sur la case actuel
        if(previousItem.getItemAttack() > this.item.getItemAttack()){ // si l'attaque de litem equipé est plus grand que celui sur la case
            this.item = previousItem; // Je garde l'ancien item
        }
    }

    public void setLife(int life) {
        this.life += life;
        if(this.life > 20){
            this.life = 20;
        }
    }
    public void setAttack(int itemAttack) {
        this.attack = this.basicAttack + itemAttack;
    }

    //public int getAttack(){
    //return this.attack;
    //}

    @Override
    public String toString() {
        return name+" {" +
                "classe='" + classe + '\'' +
                ", life=" + life +"/20" +
                ", attack=" + attack +
                ", "+ getItem()+
                '}';
    }
}
