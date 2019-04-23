package abstract_factory_mode.model;

/**
 * @description: 数据源工厂
 * <p>
 * 利用反射技术生成对象
 * @author: wuyanbo
 * @create: 2019-04-20 21:34
 **/

public class DataSourceFactory {


    public static IUser createUser(DBEnum cla) {
        IUser iUser = null;

        if (cla != null) {
            try {
                iUser = (IUser) Class.forName(cla.getValue()).newInstance();

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return iUser;
    }

    public static IDepartment createDepartment(DBEnum cla) {
        IDepartment iDepartment = null;
        if (cla != null) {
            try {
                iDepartment = (IDepartment) Class.forName(cla.getValue()).newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return iDepartment;
    }
}
