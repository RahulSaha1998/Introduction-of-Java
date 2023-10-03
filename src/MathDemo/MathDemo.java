package MathDemo;

public class MathDemo {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int max = Math.max(x, y);
        System.out.println("Maximum: " + max);

        int min = Math.min(x, y);
        System.out.println("Minimum: " + min);

        int absolute = Math.abs(y);
        System.out.println("Absolute : " + absolute);

        double power = Math.pow(x, y);
        System.out.println("x to the power y : " + power);

        int Round = Math.round(8.4f);
        System.out.println("Round of 8.4 = " + Round);

        double pi = Math.PI;
        System.out.println("Pie = " + pi);

    }
}
