public class Task2 {

    //Напечатать числа в виде следующей таблицы:
    //5
    //5 5
    //5 5 5
    //5 5 5 5
    //5 5 5 5 5

    public static void main(String[] args) {
        String five = "5";
        System.out.println(five);

        five = print5(five);
        five = print5(five);
        five = print5(five);
        print5(five);
    }

    public static String print5(String str) {
        System.out.println(str + " 5");
        return str + " 5";
    }
}
