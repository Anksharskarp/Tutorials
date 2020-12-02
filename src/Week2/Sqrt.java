package Week2;

public class Sqrt {
    public static void main(String[] args) {
        //Error tolerance: 15 places
        double EPS = 1E-15;
        double c = Double.parseDouble(args[0]);
        double t = c;
        while (Math.abs(t - c / t) > t * EPS)
            t = (c / t + t) / 2.0;
        System.out.println(t);
    }
}