package abstract_factory_mode.model;

/**
 * @description:SqlServer引擎操作
 * @author: wuyanbo
 * @create: 2019-04-20 21:33
 **/

public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("向sqlserver插入department");
    }

    @Override
    public Department select() {
        System.out.println("向sqlserver查询department");
        return null;
    }
}
