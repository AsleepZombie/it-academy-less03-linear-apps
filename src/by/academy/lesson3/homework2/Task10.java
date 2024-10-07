package by.academy.lesson3.homework2;

public class Task10 {
    public static void main(String[] args) {
        double a = 8;
        double sqrt3 = Math.sqrt(3);

        System.out.println("сторона равностороннего треугольника = " + a);
        System.out.printf("площадь = %s\n", a * a * sqrt3 / 4);
        System.out.printf("высота = %s\n", a * sqrt3 / 2);
        System.out.printf("радиус вписанной окружности = %s\n", a / (2 * sqrt3));
        System.out.printf("радиус описанной окружности = %s", a / sqrt3);
    }
}
