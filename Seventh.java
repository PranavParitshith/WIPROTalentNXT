import java.util.Scanner;

class Seventh {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        char a = my.next().charAt(0);
        char b = my.next().charAt(0);
        if (a > b) {
            System.out.println(b + "," + a);
        } else {
            System.out.println(a + "," + b);
        }
    }
}