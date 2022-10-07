import java.util.ArrayList;
import java.util.HashMap;

public class Homa {
    public static void main(String[] args) {
        ArrayList<Integer> speeds = new ArrayList<>();
        speeds.add(120);
        speeds.add(110);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;

        for (Integer speed : speeds) {
            sum = sum + speed;
        }
        int middleSpeed = sum / speeds.size();

        System.out.println(middleSpeed);

        speeds.remove((Integer) 110);
        System.out.println(speeds);

        //speeds.clear();
        System.out.println(speeds);

        System.out.println(speeds.isEmpty());

        System.out.println(speeds.contains(60));

        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("S34", "Big stapler");
        officeTool.put("F2523", "Black&White printer in the hall");
        System.out.println(officeTool);
        officeTool.put("F252", "Printer from office 42");
        System.out.println(officeTool);

        for (String check : officeTool.keySet()) {
            System.out.println(check);
        }

        boolean a = officeTool.containsKey("S34");
        System.out.println(a);

        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> mohitoPrice = new ArrayList<>();
        ArrayList<Double> tiramisuPrice = new ArrayList<>();
        ArrayList<Double> ramenPrice = new ArrayList<>();

        mohitoPrice.add(350.0);
        mohitoPrice.add(15.50);
        mohitoPrice.add(13.20);
        menu.put("Mohito", mohitoPrice);

        tiramisuPrice.add(230.0);
        tiramisuPrice.add(8.50);
        tiramisuPrice.add(7.00);
        menu.put("Tiramisu", tiramisuPrice);

        ramenPrice.add(120.0);
        ramenPrice.add(4.00);
        ramenPrice.add(3.20);
        menu.put("Ramen", ramenPrice);

        System.out.println(menu.values());
    }
}