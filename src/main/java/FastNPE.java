import java.util.Objects;

/**
 * Created by abhijith.nagarajan on 2/18/15.
 */
public class FastNPE {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {

            normalNPE(null);

        }

        time = System.currentTimeMillis() - time;

        System.out.println(time);

        time = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {

            fastNPE(null);

        }

        time = System.currentTimeMillis() - time;

        System.out.println(time);
    }

    private static void normalNPE(Object obj) {
        try {
            Objects.requireNonNull(obj);
        } catch (NullPointerException allisgood) {
        }
    }

    private static void fastNPE(Object obj) {
        try {
            obj.getClass();
        } catch (NullPointerException allisgood) {
        }
    }
}
