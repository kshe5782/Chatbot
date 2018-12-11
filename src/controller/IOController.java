package controller;

import java.util.Calendar;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{

	public static void saveText(ChatController app, String path, String textToSave)
	{
		try 
		{
			String fileName = path; 
			Calendar date = Calendar.getInstance();
			fileName += "/" + date.get(Calendar.MONTH) + " " + date.get(Calendar.DAY_OF_MONTH);
			fileName += " at " + date.get(Calendar.HOUR) + "-" + date.get(Calendar.MINUTE);
			fileName += "Chatbot save.txt";
			
			File saveFile = new File(fileName);
			Scanner textScanner = new Scanner (textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			while(textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			
			textScanner.close();
			saveText.close();
		
		}
		catch(IOException error)
		{
			app.handleErrors(error);
		}
		catch(Exception genericError)
		{
			app.handleErrors(genericError);
		}
	}
}
