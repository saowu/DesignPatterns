package abstract_factory_mode.model;

public interface IDataSource {
    Object createObject(DBEnum cla);
}
