package service;

import model.OrderInfoStorage;

public class OrderInfoParser {
    OrderInfoGettor orderInfoGettor = new OrderInfoGettor();
    OrderInfoStorage orderInfoStorage = new OrderInfoStorage();

    public OrderInfoStorage calculationAnalysis() {
        orderInfoStorage = orderInfoGettor.getOrderInfoStorage();
        return orderInfoStorage;
    }
}
