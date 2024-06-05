class Sixth {
    public static void main(String[] args) {
        int len = args.length;
        if (len == 0) {
            System.out.println("No Values");
        } else {
            int i;
            for (i = 0; i < len; i++) {
                System.out.println(args[i]);
            }
        }
    }
}