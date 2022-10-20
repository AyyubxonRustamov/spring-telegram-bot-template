package ayyubxon.rustamov.springtelegrambottemplate.sender;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;

import java.io.Serializable;

public interface Sender {

    <T extends Serializable> T send(BotApiMethod<T> botApiMethod);

}
