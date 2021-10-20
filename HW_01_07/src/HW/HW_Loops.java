package HW;

public class HW_Loops {
    public static void main(String[] args) {

        System.out.println("---------------------------------Task1---------------------------------");
        System.out.println();
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++ ){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("---------------------------------Task2---------------------------------");
        System.out.println();
        for (int i = 10; i > 0; i --) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++ ){

                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("---------------------------------Task3---------------------------------");
        System.out.println();
        for (int i = 10; i > 0; i --) {
            for (int j = 0; j < 10 - i; j++){
                System.out.print("  ");
            }
            for (int j = i - 1; j >= 0; j--){
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++ ){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();

        }

    }

}

