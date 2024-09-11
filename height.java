public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = nextInt();
        double[] height = new double[n];

        for (int i = 0; i < n; i++){
            height[i] = sc.nextDouble();
        }

        sc.close();
    }
}