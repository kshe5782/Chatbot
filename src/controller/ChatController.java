package controller;

import javax.swing.JOptionPane;
import java.Chatbot.model.Chatbot;//figure this out

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
		String userInput = "";

		while (!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}

	}

	public String bottomText(String userText)
	{
		String output = "";

		output += ("You said: " + userText);

		return output;
	}

	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(null, "What's up B?");
		String chatbotSays = simpleBot.bottomText(userInput);
		return chatbotSays;
	}

	public String processText(String userText)
	{
		String output;
		String answer = "";

		answer += "You said:" + userText;
		output int randomIndex = (int)(Math.random() * responselist.size());
		if (simpleBot.contentChecker(userText));
		{
			answer += "You said the special words. \n";
		}
	return answer;
	}

	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}

	public void handleErrors(generic Error)// and this should be the last needed fix for IOController
	{

	}

	// add a frame and panel and import them
	public Chatbot getChatbot()// fix this
	{
		return simpleBot;
	}
}
