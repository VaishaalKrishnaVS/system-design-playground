package lld.creationaldesignpattern.abstractfactory;

import lld.creationaldesignpattern.abstractfactory.aws.AwsResourceFactory;
import lld.creationaldesignpattern.abstractfactory.gcp.GoogleResourceFactory;

public class Client {
    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createInstance(Instance.Capacity capacity, Integer s){
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(s);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
        Instance awsInstance = aws.createInstance(Instance.Capacity.micro, 2048);
        awsInstance.start();
        awsInstance.stop();

        System.out.println("********************************");

        Client google = new Client(new GoogleResourceFactory());
        Instance googleInstance = google.createInstance(Instance.Capacity.micro, 2048);
        googleInstance.start();
        googleInstance.stop();
    }

}
