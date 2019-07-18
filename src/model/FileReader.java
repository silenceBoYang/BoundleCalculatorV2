package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileReader {

    OrderInfoStorage orderInfoStorageTemp = new OrderInfoStorage();

    public OrderInfoStorage getJsonFile(String s) {

        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, OrderInfoStorage.class);

        try {
            List<OrderInfoStorage> lst = mapper.readValue(new File("src/orderInformation.json"), javaType);
            for (OrderInfoStorage orderInfoStorage : lst) {
                if (orderInfoStorage.getFormat().equalsIgnoreCase(s)) {
                    orderInfoStorageTemp = orderInfoStorage;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orderInfoStorageTemp;
    }


}

