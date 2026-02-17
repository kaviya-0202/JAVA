public class encryption {
    public static void main(String[] args) {
        String s = "have a nice day";
        s = s.replaceAll(" ", "");

        int L = s.length();
        int rows = (int)Math.floor(Math.sqrt(L));
        int cols = (int)Math.ceil(Math.sqrt(L));

        if (rows * cols < L) {
            rows++;
        }

        for (int i = 0; i < cols; i++) {
            for (int j = i; j < L; j += cols) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
/* hae and via ecy*/
