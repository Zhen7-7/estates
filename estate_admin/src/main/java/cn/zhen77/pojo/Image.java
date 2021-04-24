package cn.zhen77.pojo;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-24
 */
public class Image implements Serializable {

    private static final long serialVersionUID=1L;

    private String img;


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Image{" +
        "img=" + img +
        "}";
    }
}
