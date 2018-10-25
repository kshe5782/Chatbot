package controller;

import javax.swing.JOptionPane;

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

userInput = interactWithChatbot(String text);
	}
	public String bottomText(String userText)
	{
		String output = "";
		
		output += ("You said: " + userText);
		
		return output;
	}

	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(null);
		String chatbotSays = simpleBot.bottomText(userInput);
		return chatbotSays;
	}
}