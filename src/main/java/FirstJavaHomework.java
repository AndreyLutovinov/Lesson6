public class FirstJavaHomework {

    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println((a + b) / (b - a));

        double c = 2.3;

        System.out.println(b / c);
        System.out.println(a - c);
        System.out.println((b + c) * (a + c));

        System.out.println(b > a);
        System.out.println(b < c);
        System.out.println((a - b) <= b);
        System.out.println(99 <= b);

        float maxFloat = Float.MAX_VALUE;
        System.out.println(Float.MAX_VALUE * 5);

        double maxDouble = Double.MAX_VALUE;
        System.out.println(Double.MAX_VALUE * 5);


    }
}

