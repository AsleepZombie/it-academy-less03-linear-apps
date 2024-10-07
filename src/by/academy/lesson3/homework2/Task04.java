package by.academy.lesson3.homework2;

public class Task04 {
    public static void main(String[] args) {
        double x1 = 4, y1 = 9;
        double x2 = 5, y2 = 2;
        double x3 = 7, y3 = 6;
        double line12, line23, line31, p, s;

        //visualise(x1, x2, x3, y1, y2, y3);

        line12 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        line23 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
        line31 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
        p = line12 + line23 + line31;
        System.out.println("периметр = " + p);
        s = Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;
        System.out.println("площадь = " + s);

    }

    private static void visualise(
            double x1, double x2, double x3,
            double y1, double y2, double y3) {
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= 10; j++) {
                if (((j == x1) && (i == y1)) ||
                        ((j == x2) && (i == y2)) ||
                        ((j == x3) && (i == y3)))
                {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.print("\n");
        }
    }
}
