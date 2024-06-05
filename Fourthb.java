import java.util.*;

class Fourthb {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        Integer a = my.nextInt();
        Integer b = my.nextInt();
        if (a % 10 == b % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}