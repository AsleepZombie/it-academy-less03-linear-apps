package by.academy.lesson3.homework1;

public class Task09 {
    public static void main(String[] args) {
        int i = 4567;
        int result = 1;

        while (i!=0) {
            result = result * (i % 10);
            i = i / 10;
        }

        System.out.println(result);
    }
}
