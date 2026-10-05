public class Choinka {
    public static void main(String[] args) {
        int gwiazdki=Integer.parseInt(args[0]);
        for (int i=0; i<=gwiazdki; i++){
            for (int j=0; j<i; j++){
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }
}