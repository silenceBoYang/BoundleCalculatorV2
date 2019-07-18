package algorithm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoundleAlgorithm {
    //用来存储最终给用户的bundle list
    List<Integer> tempListForUser = new ArrayList<>();
    //这个是bundle的copy,方便去计算
    List<Integer> tempboundleList = new ArrayList<>();

    public List getFilledBoundleList(int orderItem, List<Integer> list) {

        List<Integer> orderReversedBoundle = changeListOrder(list);

        int orderNumbers = orderItem;
        int totalNumber = 0;
        int h = 0;
        while (h < orderReversedBoundle.size()) {
            totalNumber = orderItem;
            tempboundleList.clear();
            tempListForUser.clear();
            //把bundle的list给这个暂时的list，方便去计算
            for (int r = h; r < orderReversedBoundle.size(); r++) {
                tempboundleList.add(orderReversedBoundle.get(r));
            }
            //根据用户的orderitem 和 bundle 去计算需要给用户的bundle。
            calculateList(totalNumber);

            int sum = 0;
            //计算一下给user的list的总的orderItem是多少
            for (int g = 0; g < tempListForUser.size(); g++) {
                sum += tempListForUser.get(g);
            }
            //如果这个总的orderItem等于用户输入的orderItem，那就终止循环。
            if (sum == orderNumbers) {
                break;
            }
            h++;
        }
        //如果计算完的这个数小于而且不等于用户输入的orderItem,那就在加一个bundle。
        sum(orderNumbers);
        return tempListForUser;
    }

    public List changeListOrder(List<Integer> arrayList) {
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        return arrayList;
    }

    public void calculateList(int totalNumber) {
        for (int i = 0; i < tempboundleList.size(); i++) {
            int temp = totalNumber / tempboundleList.get(i);
            if (temp > 0) {
                for (int j = 0; j < temp; j++) {
                    tempListForUser.add(tempboundleList.get(i));
                }
                totalNumber = totalNumber - tempboundleList.get(i) * temp;
            }
        }
    }

    public void sum(int orderNumbers) {
        int sums = 0;
        for (int g = 0; g < tempListForUser.size(); g++) {
            sums += tempListForUser.get(g);
        }
        if (sums < orderNumbers) {
            tempListForUser.add(tempboundleList.get(tempboundleList.size() - 1));
        }
    }
}
