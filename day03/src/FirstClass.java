public class FirstClass {
    public static void main(String[] args) {
        int sum = 0, sum1 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                sum1 += i;
            }
            sum += i;
        }
        System.out.println(sum1);
        System.out.println(sum);
    }
}
