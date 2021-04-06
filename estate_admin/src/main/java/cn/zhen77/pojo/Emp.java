package cn.zhen77.pojo;

import java.io.Serializable;

/**
 * @author : zhen77
 * @date: 2021/4/6 - 04 - 06 - 17:36
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Emp implements Serializable {
    private Integer id;

    private String name;

    private String photo;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Emp(Integer id, String name, String photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }

    public Emp() {
    }
}
