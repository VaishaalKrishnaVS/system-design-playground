package lld.creationaldesignpattern.factory;

import lld.creationaldesignpattern.factory.message.Message;
import lld.creationaldesignpattern.factory.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
