package by.academy.lesson3.homework1;

public class Task10 {
    public static void main(String[] args) {
        doMath();
    }
    public static void doMath() {
        int len = 8;
        System.out.println("длинна ребра куба: " + len);

        System.out.printf("площадь грани = %s\n", len * len);
        System.out.printf("площадь полной поверхности = %s\n", len * len * 6);
        System.out.printf("объём куба = %s\n", Math.pow(len, 3));
    }
}
