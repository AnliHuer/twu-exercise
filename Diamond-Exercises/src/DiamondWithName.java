

public class DiamondWithName {
    public static void main(String[] args) {
        new DiamondWithName().printString(3);
    }

    private void printString(int n) {

        for (int i = 1; i < n; i++) {
            String str = "";

            for (int j = i; j < n; j++) {
                str += " ";
            }

            for (int j = 0; j < 2 * i - 1; j++) {

                str += "*";
            }

            System.out.println(str);
        }

        System.out.println("DanPing");


        int i = n - 1;
        while (i > 0) {
            String str = "";

            for (int j = i; j < n; j++) {
                str += " ";
            }

            for (int j = 0; j < 2 * i - 1; j++) {

                str += "*";
            }

            System.out.println(str);
            i--;
        }
    }
}
