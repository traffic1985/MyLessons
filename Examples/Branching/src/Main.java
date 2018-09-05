public class Main {


    static boolean bool = true;


    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            int d =1+ (int) (Math.random()*3);

        switch (d) {
            case 1:
                System.out.println("Камень");
                break;
            case 2:
                System.out.println("Ножицы");
                break;
            case 3:
                System.out.println("Бумага");
                break;
                default:
                    System.out.println("Все");
        }
    }
    }



}
