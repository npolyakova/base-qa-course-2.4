public class Demo {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println(sum);
        sum = countSum(sum);
        sum = countSum(sum);
        sum = countSum(sum);
        countSum(sum);
        sum = countSum(sum);
        countSum(sum);
    }

    public static int countSum(int i) {
        i = i + 2;
        System.out.println(i);
        return i;
    }

}
