public class Vehicule {
    private String name;
    private int speed;

    public Vehicule(String pName, int pSpeed){
        this.name = pName;
        this.speed = pSpeed;
    }

    public void move(int x){
        this.speed = x;
        System.out.println("deplacement : " + this.speed);
    }
}
