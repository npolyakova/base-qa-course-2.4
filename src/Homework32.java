import java.util.Scanner;

public class Homework32 {
    //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше? pi*r^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите радиус круга");
        double r = sc.nextDouble();
        System.out.println("Введите сторону квадрата");
        double a = sc.nextDouble();
        sc.close();

        double cSquare = Math.PI * r * r;
        double sSquare = Math.pow(a, 2); //a * a

        if (cSquare > sSquare) {
            System.out.println("Площадь круга больше площади квадрата");
        }
        else if (cSquare == sSquare){
            System.out.println("Площадь квадрата равна площади круга");
        }
        else {
            System.out.println("Площадь квадрата больше площади круга");
        }
    }
}
