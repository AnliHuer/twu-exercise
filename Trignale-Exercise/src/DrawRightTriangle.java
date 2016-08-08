public class DrawRightTriangle {
    public static void main(String[] args) {
        new DrawRightTriangle().printString(8);
    }


    private void printString(int n) {

        for (int i = 1; i <= n; i++) {
            String str = "";

            for (int j = 0; j < i; j++) {
                str += "*";
            }

            System.out.println(str);
        }
    }
}
