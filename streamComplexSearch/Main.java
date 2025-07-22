package streamComplexSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

class Connection {
   private String from;
   private String to;

   public Connection(String from, String to) {
      this.from = from;
      this.to = to;
   }

   public String getFrom() {
      return from;
   }

   public String getTo() {
      return to;
   }
}

public class Main {
  public static void main(String[] args) {
    List<Connection> network = Arrays.asList(
        new Connection(A, B),
        new Connection(A, C),
        new Connection(A, D),
        new Connection(B, C));

        List<String> identity = new ArrayList<>();
        BiFunction<List<String>, Connection, List<String>> accumulator = (strings, connection) -> {
        strings.add(connection.getTo());
        return strings;
        }
        
  }
}
