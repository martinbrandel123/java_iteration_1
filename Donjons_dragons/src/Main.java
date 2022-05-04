import Game.Game;
import Hero.Guerrier;
import Menu.Menu;


public class Main {
    public static void main(String[] arg){
        Game playGame = new Game();
        playGame.createTheHero();
        //Weapon arc = new Weapon("arc", 3);
        //Guerrier guerrier = new Guerrier("jack", 10, 4, arc,"bouclier" );
        //System.out.println(guerrier);
        //System.out.println(guerrier.getWeapon().getAttack());
    }
}
