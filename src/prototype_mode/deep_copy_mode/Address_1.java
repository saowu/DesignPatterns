package prototype_mode.deep_copy_mode;

import java.io.*;

/**
 * @description: 地址类
 * @author: wuyanbo
 * @create: 2019-04-14 15:08
 **/

public class Address_1 implements Cloneable{
    //省
    private String province;

    //市
    private String city;

    public Address_1() {
    }

    public Address_1(String province, String city) {
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

    @Override
    public Address_1 clone() throws CloneNotSupportedException {
        return (Address_1) super.clone();
    }
}
