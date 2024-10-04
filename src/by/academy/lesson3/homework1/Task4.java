package by.academy.lesson3.homework1;

public class Task4 {
    public static void main(String[] args) {
        double lil, big, result;
        int n = 45, m = 12;

        System.out.println("в " + n + " маленьких бидонах 80 литров");

        lil = 80d / n;
        big = lil + 12;
        System.out.println("в малельком бидоне " + lil + " литров");
        System.out.println("в большом бидоне " + big + " литров");

        result = big * m;
        System.out.println("в " + m + " больших бидонах " + result + " литров");
    }
}
