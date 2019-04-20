package abstract_factory_mode.model;

/**
 * @description:
 * @author: wuyanbo
 * @create: 2019-04-20 21:34
 **/

public class DataSource {


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
