/**
 * task115
 */
public class Task115 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a.equals(b);
        boolean b2 = d != b;
        boolean b3 = c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
