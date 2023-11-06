public class Main {
    public static void main(String[] args) {
        System.out.println("Loop 1");
        for (int i = 0; i <= 5; i++){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Loop 2");
        for (int i = 5; i >= 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Loop 3");
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}