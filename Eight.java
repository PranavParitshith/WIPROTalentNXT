import java.util.*;

class Eight {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        char a = my.next().charAt(0);
        if (Character.isAlphabetic(a)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(a)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}