package me.lkp111138.deebot.commands;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.SendMessage;
import me.lkp111138.deebot.translation.Translation;

public class HelpCommand implements Command {
    @Override
    public void respond(TelegramBot bot, Message msg, String[] args) {
        int sender = msg.from().id();
        bot.execute(new SendMessage(sender, Translation.get(null).HELP()));
    }
}