package prototype_mode.shallow_copy_model;

import java.io.*;

/**
 * @description: 地址类
 * @author: wuyanbo
 * @create: 2019-04-14 15:08
 **/

public class Address {
    //省
    private String province;

    //市
    private String city;

    public Address() {
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
