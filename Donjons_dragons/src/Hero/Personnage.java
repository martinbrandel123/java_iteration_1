package Hero;

import Case.Items;
import Fights.Fights;

/**
 * classe Abstraite Personnage qui implements Fights
 */
public abstract class Personnage implements Fights {
    private String classe;
    private String name;
    private int life;
    private int attack;
    private int basicAttack;
    private Items item;

    /**
     * Constructeur Personnage
     * Assigne une valeur à chaque attributs de la classe
     * @param pClasse (String)
     * @param pName (String)
     * @param pLife (int)
     * @param pAttack (int)
     */
    public Personnage(String pClasse,String pName, int pLife, int pAttack){
        this.classe = pClasse;
        this.name = pName;
        this.life = pLife;
        this.basicAttack = pAttack;
        this.item = new Items();
        this.attack = pAttack;
    }
    // getter / setter

    /**
     * getItems renvoie l'item du personnage
     * @return this.item (Items)
     */
    public Items getItem(){
        return this.item;
    }

    /**
     * getAttack renvoie l'attaque du personnage
     * @return this.attack (int)
     */
    public int getAttack(){return this.attack;}

    /**
     * getLife qui renvoie la vie du personnage
     * @return this.life (int);
     */
    public int getLife(){
        return this.life;
    }

    /**
     * setItem modifie litem du personnage
     * modifie l'item du personnage si litem suivant est plus puissant que celui que le personnage a deja
     * @param pItem (Items)
     */
    public void setItem(Items pItem){
        Items previousItem = this.item;  // stock l'item actuel avant de le récuperer
        this.item = pItem; // Recuperer l'item sur la case actuel
        if(previousItem.getItemAttack() > this.item.getItemAttack()){ // si l'attaque de litem equipé est plus grand que celui sur la case
            this.item = previousItem; // Je garde l'ancien item
        }
    }

    /**
     * setLife modifie la vie du personnage
     * modifie la vie du personnage en fonction du parametre, la vie ne peux pas etre superieur a 20
     * @param life (int)
     */
    public void setLife(int life) {
        this.life += life;
        if(this.life > 20){
            this.life = 20;
        }
    }

    /**
     * setAttack modifie lattaque du personnage
     * ajoute les degat de larme au degat dattaque du personnage
     * @param itemAttack (int)
     */
    public void setAttack(int itemAttack) {
        this.attack = this.basicAttack + itemAttack;
    }

    /**
     * removeLifeFromFight modifie la vie du personnage
     * @param attack (int)
     */
    @Override
    public void removeLifeFromFight(int attack){
        this.life = this.life - attack;
    };

    /**
     * toString renvoie les caracteristiques du personnage
     * @return les caracteristiques du personnage (String)
     */
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
