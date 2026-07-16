import java.util.Optional;

public class OptionalCountry {

    public static void main(String[] args) {

        String country = null;

        Optional<String> obj = Optional.ofNullable(country);

        System.out.println(obj.orElse("India"));
    }
}