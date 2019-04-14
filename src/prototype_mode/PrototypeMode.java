package prototype_mode;

import prototype_mode.deep_copy_mode.Address_1;
import prototype_mode.deep_copy_mode.Resume_1;
import prototype_mode.deep_copy_mode2.Address_2;
import prototype_mode.deep_copy_mode2.Resume_2;
import prototype_mode.shallow_copy_model.Address;
import prototype_mode.shallow_copy_model.Resume;

/**
 * @description: 原型模式
 * @author: wuyanbo
 * @create: 2019-04-14 15:04
 **/

public class PrototypeMode {

    public static void main(String[] args) throws CloneNotSupportedException {

        //浅拷贝
        Resume a = new Resume("liaowp", "wuyanbo", new Address("jx", "gz"));
        Resume b = a.clone();
        b.setName("pwl");
        b.getAddress().setProvince("bj");
        System.out.println(b.toString());
        System.out.println(a.toString());

        //深拷贝1
        Resume_1 a1 = new Resume_1("liaowp", "wuyanbo", new Address_1("jx", "gz"));
        Resume_1 b1 = a1.clone();
        b1.setName("pwl");
        b1.getAddress().setProvince("bj");
        System.out.println(b1.toString());
        System.out.println(a1.toString());

        //深拷贝2
        Resume_2 a2 = new Resume_2("liaowp", "wuyanbo", new Address_2("jx", "gz"));
        Resume_2 b2 = a2.clone();
        b2.setName("pwl");
        b2.getAddress().setProvince("bj");
        System.out.println(b2.toString());
        System.out.println(a2.toString());

    }

}
