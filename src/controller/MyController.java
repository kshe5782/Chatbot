package controller;

import MyModel.MyModel;

public class MyController
{
	private MyController simpleBot;

public Controller()
{
		simpleBot = new MyController();
}

	public void start()

	{
String userInput ="";

while (!userInput.equalsIgnoreCase("quit"))
{
userInput = interactWithMyModel(String text);

public String interactWithMyModel(String text)
{
	String userInput = JOptionPane.showInputDialog(null);
	String chatbotSays = simpleBot.bottomtext(userInput);
	return chatbotSays;
}