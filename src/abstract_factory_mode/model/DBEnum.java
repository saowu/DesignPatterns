package abstract_factory_mode.model;

/**
 * 全限定名
 */
public enum DBEnum {


    MYSQL_USER("abstract_factory_mode.model.MySqlUser"),
    SQLSERVER_USER("abstract_factory_mode.model.SqlServerUser"),
    MYSQL_DEPARTMENT("abstract_factory_mode.model.MySqlDepartment"),
    SQLSERVER_DEPARTMENT("abstract_factory_mode.model.SqlServerDepartment");

    private String value;

    DBEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
