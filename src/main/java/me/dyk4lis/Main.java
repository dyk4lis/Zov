package me.dyk4lis;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Main {

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        CryptoBot bot = new CryptoBot();
        botsApi.registerBot(bot);
        var keyboardM1 = bot.getKeyboard1();
        var keyboardM2 = bot.getKeyboard2();

        //bot.buttonTap(5321280232L,"next","back",);
        bot.sendMenu(5321280232L,"Kupi asic",keyboardM1);














    }
}











