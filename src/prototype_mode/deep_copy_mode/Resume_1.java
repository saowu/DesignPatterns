package prototype_mode.deep_copy_mode;

import java.io.Serializable;

/**
 * @description: 简历类
 * <p>
 * * 深拷贝必须实现Cloneable接口，并重写clone()
 * * 并且被引用的对象Address_2也要实现Cloneable接口，并重写clone()
 * @author: wuyanbo
 * @create: 2019-04-14 15:05
 **/

public class Resume_1 implements Cloneable {

    private String name;
    private String company;
    private Address_1 address;


    public Resume_1() {
    }

    public Resume_1(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Resume_1(String name, String company, Address_1 address) {
        this.name = name;
        this.company = company;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Address_1 getAddress() {
        return address;
    }

    public void setAddress(Address_1 address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Resume_1 clone() throws CloneNotSupportedException {
        Resume_1 resume = (Resume_1) super.clone();
        resume.address = address.clone();
        return resume;
    }

}
