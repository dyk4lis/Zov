package me.dyk4lis;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class CryptoBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "null";
    }

    @Override
    public String getBotToken() {
        return ConfigManager.getInstance().getConfigDTO().getConfig().getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        var user = msg.getFrom();
        var txt = msg.getText();

        if (msg.isCommand()) {
            if (txt.equals("/scream"))
                screaming = true;
            else if (txt.equals("/whisper"))
                screaming = false;
            else if (txt.equals("/menu"))
                sendMenu(5321280232L, "<b>Menu 1</b>", keyboardM1);
            return;
        }

        System.out.println(user.getUserName() + " wrote " + msg.getText());

    }

    public void sendText(Long who, String what) {
        SendMessage message = SendMessage.builder()
                .chatId(who.toString())
                .text(what).build();
        try {
            execute(message);                        //Actually sending the message
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);      //Any error will be printed here
        }
    }

    InlineKeyboardMarkup keyboardM1;
    InlineKeyboardMarkup keyboardM2;
    boolean screaming = false;


    public void sendMenu(Long who, String txt, InlineKeyboardMarkup kb) {
        SendMessage sm = SendMessage.builder().chatId(who.toString())
                .parseMode("HTML").text(txt)
                .replyMarkup(kb).build();

        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }

    public InlineKeyboardMarkup getKeyboard1() {
        var next = InlineKeyboardButton.builder()
                .text("Next").callbackData("Next")
                .build();


        var back = InlineKeyboardButton.builder()
                .text("Back").callbackData("Back")
                .build();
        var url = InlineKeyboardButton.builder()
                .text("Kupi asik")
                .url("https://www.kinopoisk.ru/series/229653/?utm_referrer=www.google.com")
                .build();

        keyboardM1 = InlineKeyboardMarkup.builder()
                .keyboardRow(List.of(next)).build();

        keyboardM2 = InlineKeyboardMarkup.builder()
                .keyboardRow(List.of(back))
                .keyboardRow(List.of(url))
                .build();


        return keyboardM1;
    }

    public InlineKeyboardMarkup getKeyboard2() {
        var next = InlineKeyboardButton.builder()
                .text("хочешь чтобы тебя заскамили?").callbackData("хочешь чтобы тебя заскамили?")
                .build();
        var back = InlineKeyboardButton.builder()
                .text("Ты точно этого хочешь").callbackData("Ты точно этого хочешь")
                .build();
        var url = InlineKeyboardButton.builder()
                .text("Ну ты и лох").url("https://core.telegram.org/bots/api")
                .build();

        keyboardM1 = InlineKeyboardMarkup.builder()
                .keyboardRow(List.of(next)).build();

        keyboardM2 = InlineKeyboardMarkup.builder()
                .keyboardRow(List.of(back))
                .keyboardRow(List.of(url))
                .build();


        return keyboardM2;
    }

    public void buttonTap(Long id, String queryId, String data, int msgId) throws TelegramApiException {

        EditMessageText newTxt = EditMessageText.builder()
                .chatId(id.toString())
                .messageId(msgId).text("").build();

        EditMessageReplyMarkup newKb = EditMessageReplyMarkup.builder()
                .chatId(id.toString()).messageId(msgId).build();

        if (data.equals("next")) {
            newTxt.setText("MENU 2");
            newKb.setReplyMarkup(keyboardM2);
        } else if (data.equals("back")) {
            newTxt.setText("MENU 1");
            newKb.setReplyMarkup(keyboardM1);
        }

        AnswerCallbackQuery close = AnswerCallbackQuery.builder()
                .callbackQueryId(queryId).build();

        execute(close);
        execute(newTxt);
        execute(newKb);
    }


}










