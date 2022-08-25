public class Task1 {

    //Напечатать числа в виде следующей таблицы:
    //5 5 5 5 5 5
    //5 5 5 5 5 5
    //5 5 5 5 5 5
    //5 5 5 5 5 5

    public static void main(String[] args) {
        printNumber(3);
        printNumber(4);
        printNumber(1);
        printNumber(23);
    }

    public static void printNumber(int number) {
        System.out.printf("%d %d %d %d %d %d\n", number, number, number, number, number, number);
    }
}
