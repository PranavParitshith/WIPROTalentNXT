import java.util.*;

class Ninth {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        String s = my.next();
        int a = my.nextInt();
        if (s.equals("Male")) {
            if (a <= 0) {
                System.out.println("Invalid");
            } else if (a >= 1 && a <= 58) {
                System.out.println("The percentage of Interest is 8.4%");
            } else {
                System.out.println("The percentage of Interest is 10.5%");
            }
        } else if (s.equals("Female")) {
            if (a <= 0) {
                System.out.println("Invalid");
            } else if (a >= 1 && a <= 58) {
                System.out.println("The percentage of Interest is 8.2%");
            } else {
                System.out.println("The percentage of Interest is 9.2%");
            }
        } else {
            System.out.println("Invaid");
        }
    }
}