public class DrawHorizontalLine {

    public static void main(String[] args) {
        new DrawHorizontalLine().printString(8);
    }


    public void printString(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
