package by.academy.lesson3.homework1;

public class Task06 {
    public static void main(String[] args) {
        doMath();

    }
    public static void doMath() {
        double a = 8, b = 7, c = 5;
        double result;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        result = b + Math.sqrt(b * b + 4 * a * c);
        result = result / (2 * a);
        result = result - Math.pow(a, 3) * c + Math.pow(b, -2);
        //or
        //result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))
        //        - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }
}
