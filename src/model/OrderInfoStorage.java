package model;

import java.util.List;
import java.util.Map;

public class OrderInfoStorage {


    private String format;
    private int orderItem;
    private List<Integer> bundle;
    private int price;
    private Map map;


    public OrderInfoStorage(String format, int orderItem, List<Integer> bundle, Map map) {
        this.format = format;
        this.orderItem = orderItem;
        this.bundle = bundle;
        this.map = map;

    }

    public OrderInfoStorage() {

    }


    public int getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(int orderItem) {
        this.orderItem = orderItem;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List getBundle() {
        return bundle;
    }

    public void setBundle(List bundle) {
        this.bundle = bundle;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
