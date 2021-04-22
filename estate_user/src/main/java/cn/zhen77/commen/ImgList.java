package cn.zhen77.commen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/22 - 04 - 22 - 18:27
 * @Description: org.cm.commen
 * @version: 1.0
 */
public class ImgList {
    public static List<String> getImgList(List<String> list,Integer aimNum){
        ArrayList<String> temp = new ArrayList<>();
        int size = list.size();

        for(int i=0;i<aimNum;i++){
            if (i<size) temp.add(list.get(i));
            else temp.add(null);
        }
        return temp;
    }
}
