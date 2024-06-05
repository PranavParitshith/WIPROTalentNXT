import java.util.Scanner;

class Fourth {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        Integer a = my.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}