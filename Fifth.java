import java.util.*;

class Fifth {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        Integer a = my.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}