package lld.creationaldesignpattern.factory;

import lld.creationaldesignpattern.factory.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    public Message getMessage(){
        var message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    protected abstract Message createMessage();
}
