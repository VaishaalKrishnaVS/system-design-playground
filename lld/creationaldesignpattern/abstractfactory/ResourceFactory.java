package lld.creationaldesignpattern.abstractfactory;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(Integer s);
}
