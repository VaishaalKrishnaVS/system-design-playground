package lld.creationaldesignpattern.factory;

import lld.creationaldesignpattern.factory.message.JSONMessage;
import lld.creationaldesignpattern.factory.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
