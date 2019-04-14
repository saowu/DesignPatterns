package prototype_mode.deep_copy_mode2;


import java.io.IOException;

/**
 * @description: 简历类
 * <p>
 * 深拷贝2 实现Cloneable接口，并重写clone()
 * Address_2的deepclone()
 * 先使对象实现Serializable接口，
 * 然后把对象（实际上仅仅是对象的拷贝）写到一个流里（序列化），
 * 再从流里读回来（反序列化），便能够重建对象。
 * @author: wuyanbo
 * @create: 2019-04-14 15:05
 **/

public class Resume_2 implements Cloneable {

    private String name;
    private String company;
    private Address_2 address;


    public Resume_2() {
    }

    public Resume_2(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Resume_2(String name, String company, Address_2 address) {
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

    public Address_2 getAddress() {
        return address;
    }

    public void setAddress(Address_2 address) {
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
    public Resume_2 clone() throws CloneNotSupportedException {
        Resume_2 resume = (Resume_2) super.clone();
        try {
            resume.address = (Address_2) address.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resume;
    }

}
