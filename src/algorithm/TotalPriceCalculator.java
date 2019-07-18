package algorithm;
import java.util.List;
import java.util.Map;

public class TotalPriceCalculator {

    public void CalculatePrice(List list, Map map) {
        int totalPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            for (Object key : map.keySet()) {
                if (Integer.parseInt(list.get(i).toString()) == Integer.parseInt(key.toString())) {
                    totalPrice += Integer.parseInt(map.get(key).toString());
                    System.out.println(key + " --- " + map.get(key));
                }
            }
        }
        System.out.println("TotalPrice is " + totalPrice);
    }

}
