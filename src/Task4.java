import java.util.Scanner;

public class Task4 {

//    Последовательность Фибоначчи образуется так: первый и второй члены последовательности равны 1, каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5, 8, 13, ...). Дано натуральное число n.
//    - Найти k-й член последовательности Фибоначчи.
//    - Получить первые n членов последовательности Фибоначчи.
//    Решить задачу с помощью рекурсивных функций.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите k");
        int k = sc.nextInt(); //k-ый элемент

        int result = fib(k);
        System.out.println(result);

        System.out.println("Введите n");
        int n = sc.nextInt();
        callFib(n); //n первых элементов последовательности
        sc.close();
    }

    //1, 1, 2, 3, 5, 8, 13
    public static int fib(int k){
        int number = 0;
        if (k == 1 || k == 2) {
            number = 1;
        } else {
            number = fib(k - 1) + fib(k - 2); //5-1 5-2
        }
        return number;
    }

    public static int callFib(int n) {
        int result = 0;
        if (n >= 1){
            result = fib(n);
            System.out.print(result + " ");
            n--;
            callFib(n);
        }
        return result;
    }
}
