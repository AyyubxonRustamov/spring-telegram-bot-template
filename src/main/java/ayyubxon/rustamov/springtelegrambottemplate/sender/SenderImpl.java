package ayyubxon.rustamov.springtelegrambottemplate.sender;

import ayyubxon.rustamov.springtelegrambottemplate.component.TelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.Serializable;

@Service
public class SenderImpl implements Sender {

    private TelegramBot fesBot;

    @Override
    public synchronized <T extends Serializable> T send(BotApiMethod<T> botApiMethod) {
        T execute = null;
        try {
            execute = fesBot.execute(botApiMethod);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return execute;
    }

    @Autowired
    public SenderImpl(TelegramBot fesBot) {
        this.fesBot = fesBot;
    }
}
