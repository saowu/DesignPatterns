package builder_mode.model;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 产品类
 * <p>
 * 每个产品都需要添加部件
 * @author: wuyanbo
 * @create: 2019-04-18 15:34
 **/

public class Product {
    public List<String> parts = new LinkedList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        parts.forEach((obj) -> {
            System.out.print(obj);
        });
    }

}
