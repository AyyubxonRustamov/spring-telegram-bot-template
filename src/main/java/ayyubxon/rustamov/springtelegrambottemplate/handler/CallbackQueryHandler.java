package ayyubxon.rustamov.springtelegrambottemplate.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

@Component
@RequiredArgsConstructor
public class CallbackQueryHandler implements Handler<CallbackQuery> {

    @Override
    public void choose(CallbackQuery callbackQuery) {

    }
}
