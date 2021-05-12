package cn.zhen77.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : zhen77
 * @date: 2021/5/12 - 05 - 12 - 10:05
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HousingInfo {
    private Housing housing;
    private Housingimg housingimg;

    @Override
    public String toString() {
        return "HousingInfo{" +
                "housing=" + housing +
                ", housingimg=" + housingimg +
                '}';
    }
}
