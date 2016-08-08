public class DrawVerticalLine {
    public static void main(String[] args){
        new DrawVerticalLine().printString(8);
    }

    private void printString(int n) {
        int i = 0;

        while(i < n){
            System.out.println('*');
            i++;
        }
    }
}
