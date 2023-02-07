import java.util.ArrayList;

public class Main {
    public static void main (String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Abby");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");
        names.add("Jim");

        for (int i = 0; i < names.size(); i ++) {
            String something = names.get(i);
            if (something.contains("i")) {
                names.add(i + 1, "hi!");
                i ++;
            }
        }
        System.out.println(names);
    }
}
