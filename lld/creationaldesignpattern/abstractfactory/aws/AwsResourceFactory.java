package lld.creationaldesignpattern.abstractfactory.aws;

import lld.creationaldesignpattern.abstractfactory.Instance;
import lld.creationaldesignpattern.abstractfactory.ResourceFactory;
import lld.creationaldesignpattern.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(Integer s) {
        return new S3Storage(s);
    }
}
