public class Task3 {

    //Напечатать полную таблицу сложения в виде:
    //1 + 1 = 2     1 + 2 = 3  ... 1 + 9 = 10
    //2 + 1 = 3     2 + 2 = 4  ... 2 + 9 = 11
    //...
    //9 + 1 = 10   9 + 2 = 11  ... 9 + 9 = 18
    public static void main(String[] args) {
        printRaw(1, 1);
        printRaw(1, 2);
        printRaw(1, 3);
        printRaw(1, 4);
        printRaw(1, 5);
        printRaw(1, 6);
        printRaw(1, 7);
        printRaw(1, 8);
        printRaw(1, 9);
    }

    public static int fun(int a, int b) {
        int sum = b + a;
        System.out.printf("%d + %d = %d   ", b, a, sum);
        a = a + 1;
        return a;
    }

    public static void printRaw(int a, int b) {
        a = fun(a, b);
        a = fun(a, b);
        a = fun(a, b);
        a = fun(a, b);
        a = fun(a, b);
        a = fun(a, b);
        a = fun(a, b);
        a = fun(a, b);
        fun(a, b);
        System.out.println();
    }
}
