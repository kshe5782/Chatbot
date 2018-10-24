package controller;

import model.Chatbot;


public class ChatController
{
	private ChatController simpleBot;

public void Controller()
{
		simpleBot = new ChatController();
}

	public void start()

	{
String userInput ="";

while (!userInput.equalsIgnoreCase("quit"))

userInput = interactWithMyModel(String text);
	}

	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(null);
		String chatbotSays = simpleBot.bottomtext(userInput);
		return chatbotSays;
	}
}