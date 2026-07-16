import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",");

        sj.add("Java");
        sj.add("Python");
        sj.add("C++");

        System.out.println(sj);
    }
}