package videos_source_code.casting;

public class CastingRepl {
    public static void main(String[] args) {

        // Demonstrate converting an int to a double
        int i = 10;
        double d = i;
        System.out.println("Casted into a double: " + d);

        // Demonstrate casting a double to an int
        int i_2 = (int) d;
        System.out.println("Casted back to an int: " + i_2);

        // Demonstrate casting a double to a float
        float f = (float) d;
        System.out.println("Double casted to float: " + f);

        double d_2 = 10.234;
        short s = (short) d_2;
        System.out.println("Double with Decimal casted to short: " + s);
    }
}
