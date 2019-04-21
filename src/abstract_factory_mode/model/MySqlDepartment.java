package abstract_factory_mode.model;

/**
 * @description:mysql引擎操作
 * @author: wuyanbo
 * @create: 2019-04-20 21:32
 **/

public class MySqlDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("向mysql插入department");
    }

    @Override
    public Department select() {
        System.out.println("向mysql查询department");
        return null;
    }
}
