public class Main {
    public static void main(String[] args) {

        int cartons = 34;
        int count = 10 ;
        while (cartons > 0){
            if(cartons > count){
                System.out.println(count);
            }else if(cartons < count){
                System.out.println(cartons);
            }
            cartons -= count;
       }
    }
}
