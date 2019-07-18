package service;

public class OrderItemFiller {
    public boolean isInteger(String input) {
        boolean isNumber = false;
        try {
            if (Integer.parseInt(input) > 0) {

                isNumber = true;
            }
        } catch (Exception e) {
            isNumber = false;
        }
        return isNumber;
    }
}
