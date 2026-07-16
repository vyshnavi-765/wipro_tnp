import java.util.StringJoiner;

public class StringJoinerMerge {

    public static void main(String[] args) {

        StringJoiner sj1 = new StringJoiner(",");

        sj1.add("A");
        sj1.add("B");

        StringJoiner sj2 = new StringJoiner(",");

        sj2.add("C");
        sj2.add("D");

        sj1.merge(sj2);

        System.out.println(sj1);
    }
}