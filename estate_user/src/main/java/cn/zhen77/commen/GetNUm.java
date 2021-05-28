package cn.zhen77.commen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : zhen77
 * @date: 2021/5/19 - 05 - 19 - 13:40
 * @Description: cn.zhen77.commen
 * @version: 1.0
 */
public class GetNUm {
    public static List<Integer> init(int buildingid, int unitid, int floor, int room){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        buildingid = random.nextInt(5)+1;
        list.add(buildingid);
        unitid = random.nextInt(4)+1;
        list.add(unitid);
        floor= random.nextInt(10)+1;
        list.add(floor);
        room = floor*100 + random.nextInt(3)+1;
        list.add(room);
        return list;
    }
}
