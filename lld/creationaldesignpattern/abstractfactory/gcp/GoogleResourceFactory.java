package lld.creationaldesignpattern.abstractfactory.gcp;


import lld.creationaldesignpattern.abstractfactory.Instance;
import lld.creationaldesignpattern.abstractfactory.ResourceFactory;
import lld.creationaldesignpattern.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(Integer s) {
        return new GoogleCloudStorage(s);
    }
}
