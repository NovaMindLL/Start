package innterface;

public interface Sound {

    String getType();

    default void getSound() {
        System.out.println("------");
    }

}
