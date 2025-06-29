package List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Hey");
        myArrayList.add("This");
        myArrayList.add("Is");

        myArrayList.remove(1);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
