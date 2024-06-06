import java.util.*;

class Tenth {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        char a = my.next().charAt(0);
        if (Character.isLowerCase(a)) {
            System.out.println(a + "->" + Character.toUpperCase(a));
        } else {
            System.out.println(a + "->" + Character.toLowerCase(a));
        }
    }
}