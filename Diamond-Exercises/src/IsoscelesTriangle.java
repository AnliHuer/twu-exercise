public class IsoscelesTriangle {
    public static void main(String[] args) {
        new IsoscelesTriangle().printString(3);
    }

    private void printString(int n) {

        int i = 1;
        while (i <= n) {
            String str = "";
            for (int j = i; j <n; j++) {
                str += " ";
            }

            for (int j = 0; j < 2 * i - 1; j++) {

                str += "*";
            }

            System.out.println(str);
            i++;
        }
    }
}
