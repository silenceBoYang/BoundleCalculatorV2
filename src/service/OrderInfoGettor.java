package service;

import model.FileReader;
import model.OrderInfoStorage;
import model.SubmissionFormatParser;
import org.apache.log4j.Logger;
import java.util.Scanner;

public class OrderInfoGettor {
    private static final Logger LOGGER = Logger.getLogger(OrderInfoParser.class);
    OrderInfoStorage orderInfoStorage = new OrderInfoStorage();
    FileReader fileReader = new FileReader();
    OrderItemFiller orderItemFiller = new OrderItemFiller();

    public void getUserInput() {

        while (true) {
            Scanner console = new Scanner(System.in);
            String input = console.nextLine();
            if (input.contains("/")) {
                String[] parts = input.split("/", 2);
                if (SubmissionFormatParser.contains(parts[0].toUpperCase()) && orderItemFiller.isInteger(parts[1])) {
                    String s = SubmissionFormatParser.getFormatCode(parts[0].toUpperCase());
                    orderInfoStorage = fileReader.getJsonFile(s);
                    orderInfoStorage.setOrderItem(Integer.valueOf(parts[1]));
                    break;
                } else {
                    LOGGER.info("Please input the correct brand name and the item number must be greater than 0 ");
                }
            } else {
                LOGGER.info("Please input / between brand and order number");
            }
        }
    }

    public OrderInfoStorage getOrderInfoStorage() {
        getUserInput();
        return orderInfoStorage;
    }
}
