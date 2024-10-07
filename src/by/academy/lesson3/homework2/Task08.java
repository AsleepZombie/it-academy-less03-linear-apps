package by.academy.lesson3.homework2;

public class Task08 {
    public static void main(String[] args) {
        int a = 5, b = 9;

        System.out.printf("среднее арифметическое %s^3 и %s^3 = %s\n",
                a, b, (Math.pow(a,3) + Math.pow(b,3)) / 2);
        System.out.printf("среднее геометрическое %s и %s = %s\n",
                a, b, Math.sqrt(Math.abs(a * b)));
    }
}
