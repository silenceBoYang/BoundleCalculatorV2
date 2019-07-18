package algorithm;

import model.OrderInfoStorage;
import service.OrderInfoParser;
import java.util.List;

public class BoundleFiller {

    OrderInfoStorage orderInfoStorage = new OrderInfoStorage();
    OrderInfoParser orderInfoParser = new OrderInfoParser();
    BoundleAlgorithm boundleAlgorithm = new BoundleAlgorithm();
    TotalPriceCalculator totalPriceCalculator = new TotalPriceCalculator();

    public void getOrderInfor() {
        orderInfoStorage = orderInfoParser.calculationAnalysis();
        List list = boundleAlgorithm.getFilledBoundleList(orderInfoStorage.getOrderItem(), orderInfoStorage.getBundle());
        totalPriceCalculator.CalculatePrice(list, orderInfoStorage.getMap());
    }

}
