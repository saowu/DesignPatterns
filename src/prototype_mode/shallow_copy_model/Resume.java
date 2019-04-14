package prototype_mode.shallow_copy_model;

/**
 * @description: 简历类
 *
 * 浅拷贝必须实现Cloneable接口，并重写clone()
 *
 * @author: wuyanbo
 * @create: 2019-04-14 15:05
 **/

public class Resume implements Cloneable {

    private String name;
    private String company;
    private Address address;


    public Resume() {
    }

    public Resume(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Resume(String name, String company, Address address) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
    public Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        return resume;
    }

}
