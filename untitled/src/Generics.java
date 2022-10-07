import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<String> animals = new ArrayList();
        animals.add("Lama");
        animals.add("Toucan");
        animals.add("Lion");

        String animal = animals.get(0);
        System.out.println(animal);
    }

}