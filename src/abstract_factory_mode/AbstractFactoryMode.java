package abstract_factory_mode;

import abstract_factory_mode.model.*;

/**
 * @description: 抽象工厂模式+反射
 * @author: wuyanbo
 * @create: 2019-04-20 21:20
 **/

public class AbstractFactoryMode {

    public static void main(String[] args) {
        IUser user = DataSource.createUser(DBEnum.SQLSERVER_USER);
        user.insert(new User());

        IDepartment department = DataSource.createDepartment(DBEnum.MYSQL_DEPARTMENT);
        department.select();
    }
}
