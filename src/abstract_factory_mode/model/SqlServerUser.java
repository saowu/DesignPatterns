package abstract_factory_mode.model;

/**
 * @description:
 * @author: wuyanbo
 * @create: 2019-04-20 21:29
 **/

public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("向sqlserver插入user");
    }

    @Override
    public User select() {
        System.out.println("向sqlserver查询user");
        return null;
    }
}
