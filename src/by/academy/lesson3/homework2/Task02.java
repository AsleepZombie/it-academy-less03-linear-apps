package by.academy.lesson3.homework2;

public class Task02 {
    public static void main(String[] args) {
        double a = 3, b = 4;
        double c;

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("гипотенуза = " + c);
        System.out.printf("периметр = %s\n", a + b + c);
        System.out.printf("площадь = %s", a * b / 2);
    }
}
