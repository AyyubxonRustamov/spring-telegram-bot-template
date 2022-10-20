package ayyubxon.rustamov.springtelegrambottemplate.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
@RequiredArgsConstructor
public class MessageHandler implements Handler<Message> {

    @Override
    public void choose(Message message) {

    }
}