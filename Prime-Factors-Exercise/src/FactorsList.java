public class FactorsList {
    public static void main(String[] args) {
        new FactorsList().generateFactors(30);
    }

    private void generateFactors (int n){
        int k = 2;

        while (k <= n) {
            if (n % k == 0) {
                System.out.print(k + " ");
                n = n / k;
            } else {
                k++;
            }

        }
    }
}

