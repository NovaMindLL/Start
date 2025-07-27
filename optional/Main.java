package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
         * Optional<String> name = Optional.ofNullable(null);
         * System.out.println(name);
         */
        /*
         * Optional<String> emptyOptional = Optional.empty();
         * System.out.println(emptyOptional);
         */
        /*
         * Optional<String> name = Optional.of();
         * System.out.println(name.get());
         */

        /*
         * Optional<Object> empty = Optional.empty();
         * if (empty.isPresent()) {
         * System.out.println(empty.get());
         */
        /*
         * Optional<String> name = Optional.of("Jon");
         * name.ifPresent(val -> System.out.println(val));
         */
        /*
         * Optional<Object> empty = Optional.empty();
         * empty.ifPresent(val -> System.out.println(val));
         */
        Optional<Object> empty = Optional.empty();
        System.out.println((empty.orElse("Blank")));
    }
}
