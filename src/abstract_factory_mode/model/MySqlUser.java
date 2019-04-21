package abstract_factory_mode.model;



/**
 * @description:mysql引擎操作
 * @author: wuyanbo
 * @create: 2019-04-20 21:27
 **/

public class MySqlUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("向mysql插入user");
    }

    @Override
    public User select() {
        System.out.println("向mysql查询user");
        return null;
    }
}
